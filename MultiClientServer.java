import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

/** Q20: Multi-threaded TCP server on port 5002. Stop with Ctrl+C. */
public class MultiClientServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(5002)) {
            System.out.println("MultiClientServer ready on port 5002...");
            while (true) {
                Socket client = server.accept();
                Thread worker = new Thread(() -> handleClient(client));
                worker.start();
            }
        }
    }
    private static void handleClient(Socket client) {
        try (Socket socket = client;
             BufferedReader input = new BufferedReader(new InputStreamReader(
                 socket.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = input.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + ": " + line);
            }
        } catch (IOException exception) {
            System.err.println("Client error: " + exception.getMessage());
        }
    }
}
