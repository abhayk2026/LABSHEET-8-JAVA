import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

/** Q12 + Q14: TCP server; accepts a client and reads its message. */
public class HelloServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("HelloServer waiting on port 5000...");
            try (Socket client = server.accept();
                 BufferedReader input = new BufferedReader(new InputStreamReader(
                     client.getInputStream(), StandardCharsets.UTF_8))) {
                System.out.println("Client connected");
                String message = input.readLine();
                System.out.println("Received from client: " + message);
            }
        }
    }
}
