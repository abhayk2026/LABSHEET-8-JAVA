import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

/** Q15: Single-client TCP echo server on port 5001. */
public class EchoServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(5001)) {
            System.out.println("EchoServer waiting on port 5001...");
            try (Socket client = server.accept();
                 BufferedReader input = new BufferedReader(new InputStreamReader(
                     client.getInputStream(), StandardCharsets.UTF_8));
                 PrintWriter output = new PrintWriter(new OutputStreamWriter(
                     client.getOutputStream(), StandardCharsets.UTF_8), true)) {
                String message = input.readLine();
                System.out.println("Received: " + message);
                if (message != null) output.println(message);
            }
        }
    }
}
