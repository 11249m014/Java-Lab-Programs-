import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProfileFileStream {
    public static void main(String[] args) {
        String profile = "Name: Ravi\nAge: 25\nWeight: 70kg\n";

        try {
            FileOutputStream fos = new FileOutputStream("profile.txt");
            byte[] data = profile.getBytes();
            fos.write(data);
            fos.close();
            System.out.println("Profile written to profile.txt");
        } catch (IOException e) {
            System.out.println("Write Error: " + e);
        }

        try {
            FileInputStream fis = new FileInputStream("profile.txt");
            int ch;
            System.out.println("\nReading profile:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("Read Error: " + e);
        }
    }
}
