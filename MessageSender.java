import java.net.*;
import java.nio.charset.StandardCharsets;

/** Q16: Send a UDP Ping datagram to localhost:6000. */
public class MessageSender {
    public static void main(String[] args) throws Exception {
        byte[] data = "Ping".getBytes(StandardCharsets.UTF_8);
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(data, data.length, address, 6000);
        try (DatagramSocket socket = new DatagramSocket()) {
            socket.send(packet);
            System.out.println("Sent: Ping");
        }
    }
}
