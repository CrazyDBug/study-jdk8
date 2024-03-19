package com.dragon.netty.nio;

/**
 * @date: 2024/3/19 12:08
 * @author: ybl
 */
import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class NIOClient {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 8080));
        System.out.println("Connected to server");

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put("Hello, server!".getBytes());
        buffer.flip();
        socketChannel.write(buffer);
        System.out.println("Sent to server: Hello, server!");

        buffer.clear();
        int bytesRead = socketChannel.read(buffer);
        if (bytesRead > 0) {
            buffer.flip();
            byte[] bytes = new byte[buffer.remaining()];
            buffer.get(bytes);
            String response = new String(bytes);
            System.out.println("Received from server: " + response);
        }

        socketChannel.close();
    }
}
