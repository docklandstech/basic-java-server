package com.docklandstech.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicServer {
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(9090);
        System.out.println("I started");
        while (true) {
            Socket socket = listener.accept();
            try {
                System.out.println("Works " + socket.getInetAddress());
            } finally {
                socket.close();
            }
        }
    }
}