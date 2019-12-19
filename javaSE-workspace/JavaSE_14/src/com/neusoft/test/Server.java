package com.neusoft.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(7001);
            System.out.println("服务端开始运行!!!!");

            Socket socket = serverSocket.accept();
            System.out.println("连接客户端IP:" + socket.getInetAddress());
            System.out.println("客户端连接的端口号:" + socket.getPort());

            new Thread(() -> {
                try {
                        DataInputStream in = new DataInputStream(socket.getInputStream());
                        while(true) {
                            String str = in.readUTF();
                            System.out.println("客户端发送的信息:" + str);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
