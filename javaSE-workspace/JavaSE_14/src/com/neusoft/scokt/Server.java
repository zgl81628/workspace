package com.neusoft.scokt;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3333);
            System.out.println("服务端数据:"+serverSocket.getLocalSocketAddress());
            System.out.println("服务端数据:"+serverSocket.getLocalPort());


            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            DataInputStream in = new DataInputStream(inputStream);
            String str = in.readUTF();
            System.out.println("客户端IP:"+socket.getInetAddress());
            System.out.println("客户端端口:"+socket.getLocalPort());
            System.out.println("获得的数据是:"+str);
            in.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
