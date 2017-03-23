import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		final int PORT_NUMBER = 44827;
		ServerSocket serverSock = null;
		Socket clientSock = null;
		DataInputStream input;
		PrintStream output;


		while (true) {

			try {
				serverSock = new ServerSocket(PORT_NUMBER);
				System.out.println("Listening...");
				// Get connection
				clientSock = serverSock.accept();
				System.out.println("Connected client");

				// Get input
				// BufferedReader br = new BufferedReader(new
				// InputStreamReader(clientSock.getInputStream()));

				input = new DataInputStream(clientSock.getInputStream());
				output = new PrintStream(clientSock.getOutputStream());

				System.out.println(input);
				System.out.println(clientSock.getInetAddress() + " connected");

				output.close();
				input.close();
				serverSock.close();
				clientSock.close();
			} catch (Exception e) {
				//e.printStackTrace();
			}
		}
	}
}
