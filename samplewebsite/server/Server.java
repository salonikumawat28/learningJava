package samplewebsite.server;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class Server {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    // String end ="Ok! goood bye";
    // Created socket at port 9987.
    ServerSocket serverSocket = new ServerSocket(9987);

    // Server socket listen and then accept client connection.
    Socket clientSocket = serverSocket.accept();

    OutputStream outputStream = clientSocket.getOutputStream();

    DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

    InputStream inputStream = clientSocket.getInputStream();
    DataInputStream dataInputStream = new DataInputStream(inputStream);

    //for (int i = 0; i < 50; i++) {
    while(scanner.nextLine().toLowerCase() != " ok! good bye" ){

      dataOutputStream.writeUTF(scanner.nextLine());
      dataOutputStream.flush();

      String inputFromClient = dataInputStream.readUTF();
      System.out.println(inputFromClient);
    }

   // }

    serverSocket.close();
    clientSocket.close();
    dataOutputStream.close();
    dataInputStream.close();

  }
}