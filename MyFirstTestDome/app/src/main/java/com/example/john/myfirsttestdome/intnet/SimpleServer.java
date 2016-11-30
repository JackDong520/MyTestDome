package com.example.john.myfirsttestdome.intnet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by john on 2016/11/28.
 */
public class SimpleServer{

    public void DoThisSimple() throws IOException {

        ServerSocket serverSocket = new ServerSocket(30000);
        while(true){
            Socket socket =serverSocket.accept();
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("你好，你收到了服务器的新年祝福!".getBytes("utf-8"));
            outputStream.close();
            socket.close();
        }
    }
}
