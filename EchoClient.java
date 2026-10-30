import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

/** Helper for Q15: verifies that EchoServer returns the same message. */
public class EchoClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 5001);
             BufferedReader input = new BufferedReader(new InputStreamReader(
                 socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter output = new PrintWriter(new OutputStreamWriter(
                 socket.getOutputStream(), StandardCharsets.UTF_8), true)) {
            output.println("Echo test");
            System.out.println("Echo reply: " + input.readLine());
        }
    }
}
