import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class FileReader {
    public void readFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please make sure the file exists and try again.");
        } catch (IOException e) {
            System.out.println("Error: An I/O exception occurred.");
            e.printStackTrace();
        }
    }
}

public class FileReaderApp {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        String filename = "example.txt"; // Replace "example.txt" with your file name
        System.out.println("Reading data from file...");
        fileReader.readFile(filename);
    }
}
