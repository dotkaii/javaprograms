import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            int num = 10;
            dos.writeInt(num);
            String result = dis.readUTF();
            System.out.println("Result received from server: " + result);

            dis.close();
            dos.close();
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
