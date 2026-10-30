import java.io.*;
import java.net.*;
import java.nio.file.*;

/** Q19: Download using URLConnection (the worksheet's sample URL may be missing). */
public class FileDownloader {
    public static void main(String[] args) {
        String urlText = args.length > 0
            ? args[0] : "https://www.example.com/sample.txt";
        Path destination = Paths.get("sample.txt");
        try {
            URLConnection connection = new URL(urlText).openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            try (InputStream input = connection.getInputStream()) {
                Files.copy(input, destination, StandardCopyOption.REPLACE_EXISTING);
            }
            System.out.println("Saved to: " + destination.toAbsolutePath());
        } catch (IOException exception) {
            System.err.println("Download failed: " + exception.getMessage());
            System.err.println("The lab URL may return HTTP 404. To test, pass a valid HTTPS file URL as an argument.");
        }
    }
}
