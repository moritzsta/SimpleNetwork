import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
    final int PORT_NUMBER = 44827;

    while(true) {
        try {
        //Listen on port
        ServerSocket serverSock = new ServerSocket(PORT_NUMBER);
        System.out.println("Listening...");

        //Get connection
        Socket clientSock = serverSock.accept();
        System.out.println("Connected client");

        //Get input 
        BufferedReader br = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
        System.out.println(br.readLine());
        System.out.println(clientSock.getInetAddress());

        br.close();
        serverSock.close();
        clientSock.close();
        } catch(Exception e) {
        e.printStackTrace();
        }
    }
    }
}
