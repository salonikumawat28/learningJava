package samplewebsite.client;

import java.net.*;
import java.io.*;
import java.util.*;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // creating client socket and connecting to server port.
        Socket clientSocket = new Socket("127.0.0.1", 9823);

        // Accepting input data in byte format.
        InputStream inputStream = clientSocket.getInputStream();
        // Convertion of byte format input stream into java's datatype.
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        // Output data.
        OutputStream outputStream = clientSocket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        while (true) {

            // Reading input data
            String inputFromServer = dataInputStream.readUTF();
            // Print input data on terminal.
            System.out.println("Server Message :- " + inputFromServer);

            if (inputFromServer.equals("bye")) {
                System.out.print("Client message : ");
                dataOutputStream.writeUTF(scanner.nextLine());
                dataOutputStream.flush();

                break;
            }
            System.out.print("Client message : ");
            dataOutputStream.writeUTF(scanner.nextLine());
            dataOutputStream.flush();

        }

        // Close all connection
        dataInputStream.close();
        clientSocket.close();

    }

}
