import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NotFoundException {
    public static void main(String[] args) {
        File file = new File("output.txt");

        // wrap with try-catch
        try {

            // Throws: FileNotFoundException - if the file does not exist

            FileReader fileReader = new FileReader(file);

        } catch (FileNotFoundException e) {

            // do something in the catch block

            System.out.println("Oops, " + file.getName() + " does not exist");
        }

    }
}
