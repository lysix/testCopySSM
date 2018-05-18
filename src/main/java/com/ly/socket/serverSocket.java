package com.ly.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class serverSocket {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10086);
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String info = null;
            while((info = bufferedReader.readLine())!=null){
                System.out.println("来自客户端的消息："+info);
            }

            socket.shutdownOutput();

            OutputStream opt = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(opt);
            pw.write("hello 客户端");
            pw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
