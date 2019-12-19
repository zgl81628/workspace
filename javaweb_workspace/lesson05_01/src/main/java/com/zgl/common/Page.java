package com.zgl.common;

import java.util.List;

/**
 * Created by Administrator on 2018/2/1.
 */
public class Page <T> {

    private int pageSize = 10;
    private int totalCount;
    private int totalpage;
    private int curenPage = 1;
    private int nextpage;
    private int prePage;
    private int firstpage;
    private int lastpage;

    private List<T> arrys; 

    public List<T> getArrys() {
        return arrys;
    }

    public void setArrys(List<T> arrys) {
        this.arrys = arrys;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 閹鍙￠崚鍡楊樋鐏忔垿銆�
     * @return
     */
    public int getTotalpage() {
        if(totalCount%pageSize==0)
            return totalCount/pageSize;
        else
            return totalCount/pageSize+1;
    }

    public int getCurenPage() {
        return curenPage;
    }

    public void setCurenPage(int curenPage) {
        this.curenPage = curenPage;
    }

    /**
     * 娑撳绔存い锟�
     * @return
     */
    public int getNextpage() {
        if(curenPage<this.getTotalpage())
            return curenPage+1;
        else
            return this.getTotalpage();
    }

    /***
     * 娑撳﹣绔存い锟�
     * @param
     */
    public int getPrePage() {
        if(curenPage>1)
            return curenPage-1;
        else
            return this.getFirstpage();
    }

    /**
     * 妫ｆ牠銆�
     * @return
     */
    public int getFirstpage() {
        return 1;
    }

    /**
     * 鐏忛箖銆�
     * @return
     */
    public int getLastpage() {
        return this.getTotalpage();
    }

}
