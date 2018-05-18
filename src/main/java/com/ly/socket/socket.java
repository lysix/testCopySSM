package com.ly.socket;

import java.io.*;
import java.net.Socket;

public class socket {
    static Socket socket;

    public static void main(String[] args) {
        try {
            socket = new Socket("localhost",10086);
            OutputStream outputStream = socket.getOutputStream();//socket获取输出流
            PrintWriter printWriter =  new PrintWriter(outputStream);//输出流

            printWriter.write("this is lance");
            printWriter.flush();
            socket.shutdownOutput();

            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String s = null;
            while ((s=bufferedReader.readLine())!=null){
                System.out.println("客户端收到了来自服务器的消息"+s);
            }

            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
