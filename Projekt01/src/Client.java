import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) throws IOException {
		final int PORT_NUMBER = 44827;
		final String HOSTNAME = "192.168.178.112";

		// Attempt to connect
		try {
			Socket clientSock = new Socket(HOSTNAME, PORT_NUMBER);
			PrintWriter out = new PrintWriter(clientSock.getOutputStream(),
					true);
			// Output

			out.println("Test");
			out.flush();

			out.close();
			clientSock.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}