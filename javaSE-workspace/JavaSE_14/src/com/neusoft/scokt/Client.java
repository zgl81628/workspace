package com.neusoft.scokt;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1",3333);
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream out = new DataOutputStream(outputStream);
            out.writeUTF("我的第一个socket程序!!!!!");
            out.flush();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
