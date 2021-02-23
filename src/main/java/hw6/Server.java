package hw6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Socket clientSocket = null;
        Scanner scanner = new Scanner(System.in);
        try (ServerSocket serverSocket= new ServerSocket(9992)){
            System.out.println("Server started");
            clientSocket = serverSocket.accept();
            System.out.println("The User connected: " + clientSocket.getRemoteSocketAddress());
            DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());

            Thread threadReader = new Thread(() -> {
                try {
                    while (true) {
                        outputStream.writeUTF(scanner.nextLine());
                    }
                }catch (IOException e){e.printStackTrace();}
            });
            threadReader.setDaemon(true);
            threadReader.start();

            while (true){
                String str = inputStream.readUTF();
                if(str.equals("/close")){
                    System.out.println("Client disconnected");
                    outputStream.writeUTF("/close");
                    break;

                }else{
                    System.out.println("Client: " + str);

                }
            }
        }catch (IOException e){e.printStackTrace();}
        finally {
            try{clientSocket.close();
        }catch (IOException|NullPointerException e){e.printStackTrace();}
    }
}}
