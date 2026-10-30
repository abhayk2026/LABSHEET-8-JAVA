import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

/** Helper for Q20: run this in multiple terminals. */
public class MultiClientClient {
    public static void main(String[] args) throws IOException {
        String message = args.length > 0 ? String.join(" ", args) : "Hello from a client";
        try (Socket socket = new Socket("localhost", 5002);
             PrintWriter output = new PrintWriter(new OutputStreamWriter(
                 socket.getOutputStream(), StandardCharsets.UTF_8), true)) {
            output.println(message);
            System.out.println("Sent: " + message);
        }
    }
}
