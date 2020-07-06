import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("a tale of two cities.txt");
        Scanner scanner = new Scanner(file);

        //you can have multiple catch statements such as IndexOutOfBoundsException e or simply use catch(Exception e) to catch all exceptions
        try {
            scanner = new Scanner(new File("a tale of two cities.txt"));
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found or not opened.");
            System.exit(0);
        }

        int words = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
//            System.out.println(line.split(" ").length); //how many words are in each line
            words += line.split(" ").length;    //split the string using the space character as a delimiter
        }
        System.out.println("The file contains " + words + " words.");
    }
}
