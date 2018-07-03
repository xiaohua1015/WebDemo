package com.isdev.xiaohua.test.server;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2018/7/4.
 */
public class SocketTest {

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8888);
            Socket socket = server.accept();
//            FileInputStream inputStream = new FileInputStream("data.txt");
            InputStream inputStream = SocketTest.class.getResourceAsStream("data.txt");
            OutputStream outputStream = socket.getOutputStream();
            byte[] buf = new byte[1024];
            int len = 0;
            while((len = inputStream.read(buf))!=-1){
                outputStream.write(buf, 0, len);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
