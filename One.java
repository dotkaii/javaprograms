import java.util.Scanner;
import java.net.URL;
public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a url: ");
        try {
            URL url = new URL(sc.nextLine());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort() + " (default: " + url.getDefaultPort() + ")");
            System.out.println("File: " + url.getFile());
        } catch (java.net.MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
        sc.close();
    }
}
