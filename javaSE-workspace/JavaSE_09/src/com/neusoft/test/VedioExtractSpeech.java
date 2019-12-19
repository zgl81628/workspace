package com.neusoft.test;

public class VedioExtractSpeech {

    public static void main(String[] args) {
        System.out.println("toChinese："+toChinese("1230456"));
        System.out.println("toChinese2："+toChinese2("1230456"));
    }
    private static String toChinese(String str) {
        String[] s1 = { "零", "一", "二", "三", "四", "五", "六", "七", "八", "九" };
        String[] s2 = { "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千" };
        String result = "";
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int num = str.charAt(i) - '0';
            if (i != n - 1 && num != 0) {
                result += s1[num] + s2[n - 2 - i];
            } else {
                result += s1[num];
            }
        }
        return result;
    }
    private static String toChinese2(String str) {
        String[] s2 = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        StringBuffer sb=new StringBuffer();
        for (char c : str.toCharArray()) {
            sb.append(s2[Integer.parseInt(String.valueOf(c))]);
        }
        return sb.toString();
    }

}
