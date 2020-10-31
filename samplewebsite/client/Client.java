package samplewebsite.client;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Socket clientSocket = new Socket(InetAddress.getByName("127.0.0.1"), 9987);

        InputStream inputStream = clientSocket.getInputStream();

        DataInputStream dataInputStream = new DataInputStream(inputStream);

        OutputStream outputStream = clientSocket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        for (int i = 0; i < 50; i++) {
            String inputFromServer = dataInputStream.readUTF();
            System.out.println(inputFromServer);

           
            dataOutputStream.writeUTF(scanner.nextLine());
            dataOutputStream.flush();
        }

        clientSocket.close();

        dataInputStream.close();
        dataOutputStream.close();
    }

}
