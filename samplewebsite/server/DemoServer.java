package samplewebsite.server;

import java.net.*;
import java.io.*;

public class DemoServer {

    public static void main(String[] args) throws Exception {
        
        ServerSocket serverSocket = new ServerSocket(9876);
        Socket clientSocket = serverSocket.accept();
    }
    
}
