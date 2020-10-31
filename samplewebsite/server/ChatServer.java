package samplewebsite.server;

import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Server socket making in server machine.
        // Connecting server socket to Server port no. = 9823.
        // Now port 9823 is busy.
        ServerSocket serverSocket = new ServerSocket(9823);
        // Server Sockot will wait and listen for client connection
        Socket clientSocket = serverSocket.accept();

        // Sending data( in byte ) to clientSocket connection.
        OutputStream outputStream = clientSocket.getOutputStream();
        // Converting byte data into String format.
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        // taking Input.
        InputStream inputStream = clientSocket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        while (true) {
            System.out.print("Server Message :- ");
            // Writing data into pipe.
            dataOutputStream.writeUTF(scanner.nextLine());
            // Moving data in pipe.
            dataOutputStream.flush();

            if (dataOutputStream.equals(" bye")) {
                System.out.println(dataInputStream.readUTF());
                break;
            }

            System.out.println(" Client Message :- " + dataInputStream.readUTF());
        }

        // Closing all opening connections.
        dataOutputStream.close();
        serverSocket.close();
        clientSocket.close();
    }
}