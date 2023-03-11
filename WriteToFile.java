import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; // Step 1


public class WriteToFile {

    public static void main(String[] args) throws IOException {
        //Create the file
        File file1 = new File("text.txt");

        //create file writer class
        FileWriter fw  = new FileWriter(file1);

        //print writer
        PrintWriter pw = new PrintWriter(fw);

        pw.println("Line 1");
        pw.println("Line 2");
        pw.println("Line 3");
        pw.println("Line 4");

        pw.close();

    }
}
