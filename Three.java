import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a url: ");

        try {
            URL url = new URL(sc.nextLine());
            URLConnection conn = url.openConnection();
            System.out.println("Content Type: " + conn.getContentType());
            System.out.println("Date: " + conn.getDate());
            BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            );

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (java.net.MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
        sc.close();
    }
}
