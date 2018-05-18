package com.ly.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiClient extends Thread {

    private Socket client ;

    public MultiClient(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {

        try {
            InputStream inputStream = client.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String info = null;
            while((info = bufferedReader.readLine())!=null){
                System.out.println("来自客户端的消息："+info);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);

        while(true){
            MultiClient multiClient = new MultiClient(serverSocket.accept());
            multiClient.start();
        }
    }
}

