package com.neusoft.datasoure.comm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/***
 * unicode编码范围：
 * 汉字：[0x4e00,0x9fa5]（或十进制[19968,40869]）
 * 数字：[0x30,0x39]（或十进制[48, 57]）
 * 小写字母：[0x61,0x7a]（或十进制[97, 122]）
 * 大写字母：[0x41,0x5a]（或十进制[65, 90]）
 *
 */
public class StringUitl {

    //判断是否存在汉字
    public static boolean checkcountname(String countname)
    {
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(countname);
        if (m.find()) {
            return true;
        }
        return false;
    }

    //判断整个字符串都由汉字组成
    public static boolean checkname(String name)
    {
        int n = 0;
        for(int i = 0; i < name.length(); i++) {
            n = (int)name.charAt(i);
            if(!(19968 <= n && n <40869)) {
                return false;
            }
        }
        return true;
    }

    //判断整个字符串都由数字组成
    public static boolean checkNumber(String number)
    {
        Pattern p = Pattern.compile("[0x30,0x39]");
        Matcher m = p.matcher(number);
        if (m.find()) {
            return true;
        }
        return false;
    }


}
