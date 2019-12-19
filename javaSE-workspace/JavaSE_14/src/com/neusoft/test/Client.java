package com.neusoft.test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
                Socket socket = new Socket("127.0.0.1", 7001);
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                while(true) {
                System.out.println("客户端准备就绪请输入你要发送数据:");
                String str = scanner.next();
                out.writeUTF(str);

                if(str.equals("cc"))
                {
                    break;
                }
                out.flush();
             }
            scanner.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
