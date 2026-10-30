import java.net.InetAddress;
import java.net.UnknownHostException;

/** Q11: Show the hostname and IP of the local computer. */
public class Q11_HostInfo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        System.out.println("Host name: " + host.getHostName());
        System.out.println("IP address: " + host.getHostAddress());
    }
}
