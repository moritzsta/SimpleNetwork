import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) throws IOException {
		final int PORT_NUMBER = 44827;
		final String HOSTNAME = "192.168.178.112";
		DataInputStream input;
		PrintStream output;
		Socket clientSock;

		// Attempt to connect
		try {
			clientSock = new Socket(HOSTNAME, PORT_NUMBER);
			input = new DataInputStream(clientSock.getInputStream());
			output = new PrintStream(clientSock.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}