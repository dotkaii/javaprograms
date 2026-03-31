import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Four {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            URLConnection conn = url.openConnection();

            BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            );

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (java.net.MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}
