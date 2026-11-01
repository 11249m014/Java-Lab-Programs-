import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            out.println("Hello Server!");

            String reply = in.readLine();
            System.out.println("Server says: " + reply);

            socket.close();
        } catch (Exception e) {
            System.out.println("Client Error: " + e);
            System.out.println("Make sure the Server is running first!");
        }
    }
}
