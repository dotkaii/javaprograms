import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            int num = dis.readInt();
            System.out.println("Number received from client: " + num);

            String result;
            if(num % 2 == 0)
                result = "Even";
            else
                result = "Odd";

            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF(result);

            dis.close();
            dos.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
