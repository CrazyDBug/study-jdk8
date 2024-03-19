package com.dragon.netty.bio;

/**
 * @date: 2024/3/19 12:01
 * @author: ybl
 */
import java.io.*;
import java.net.*;

public class BIOServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server started");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println("Received from client: " + inputLine);
                writer.println("Echo: " + inputLine);
            }

            reader.close();
            writer.close();
            clientSocket.close();
        }
    }
}

