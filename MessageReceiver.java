import java.net.*;
import java.nio.charset.StandardCharsets;

/** Q17: Receive a single UDP datagram on port 6000. */
public class MessageReceiver {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        try (DatagramSocket socket = new DatagramSocket(6000)) {
            System.out.println("Waiting for UDP on port 6000...");
            socket.receive(packet);
            String message = new String(packet.getData(), packet.getOffset(),
                packet.getLength(), StandardCharsets.UTF_8);
            System.out.println("Received: " + message);
        }
    }
}
