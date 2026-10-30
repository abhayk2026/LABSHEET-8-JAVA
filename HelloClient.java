import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

/** Q13: Connect to localhost:5000; send Hello Server. */
public class HelloClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter output = new PrintWriter(new OutputStreamWriter(
                 socket.getOutputStream(), StandardCharsets.UTF_8), true)) {
            output.println("Hello Server");
            System.out.println("Sent: Hello Server");
        }
    }
}
