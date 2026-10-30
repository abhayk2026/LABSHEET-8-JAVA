import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

/** Q18: Read HTML from the requested web URL (requires internet access). */
public class WebReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection connection = url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException exception) {
            System.err.println("Unable to read the website: " + exception.getMessage());
        }
    }
}
