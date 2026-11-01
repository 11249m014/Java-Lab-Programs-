import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditorDemo {
    public static void main(String[] args) {
        String content = "Hello! This is a simple text editor demo.\nWelcome to Java File I/O.";

        try {
            FileWriter fw = new FileWriter("notes.txt");
            fw.write(content);
            fw.close();
            System.out.println("Content written to notes.txt");
        } catch (IOException e) {
            System.out.println("Write Error: " + e);
        }

        try {
            FileReader fr = new FileReader("notes.txt");
            int ch;
            System.out.println("\nReading content:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Read Error: " + e);
        }
    }
}
