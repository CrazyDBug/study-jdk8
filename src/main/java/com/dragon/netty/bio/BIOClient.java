package com.dragon.netty.bio;

/**
 * @date: 2024/3/19 12:01
 * @author: ybl
 */
import java.io.*;
import java.net.*;

public class BIOClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        System.out.println("Connected to server");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        writer.println("Hello, server!");
        System.out.println("Sent to server: Hello, server!");

        String response = reader.readLine();
        System.out.println("Received from server: " + response);

        reader.close();
        writer.close();
        socket.close();
    }
}

