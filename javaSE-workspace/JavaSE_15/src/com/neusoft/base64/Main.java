package com.neusoft.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Main
{
    public static void main(String[] args) throws UnsupportedEncodingException {
        String basasB64 = Base64.getEncoder().encodeToString("水电费水电费属性的防守打法".getBytes("utf-8"));
        System.out.println(basasB64);

        byte[] asBytes = Base64.getDecoder().decode("5rC055S16LS55rC055S16LS55bGe5oCn55qE6Ziy5a6I5omT5rOV");
        String str = new String(asBytes,"utf-8");
        System.out.println(str);
    }
}
