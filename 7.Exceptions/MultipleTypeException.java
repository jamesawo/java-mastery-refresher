import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MultipleTypeException {
    public static void main(String[] args) {
        try {

            FileInputStream file = new FileInputStream("output.txt");
            int x = (byte) file.read();

        } catch (FileNotFoundException f) {

            System.out.println("Throws FileNotFoundException");

        } catch (IOException i) {

            System.out.println("Throws IOException");

        }
    }
}
