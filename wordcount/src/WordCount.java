import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception {
        File file = new File("a tale of two cities.txt");
        Scanner scanner = new Scanner(file);

        int words = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
//            System.out.println(line.split(" ").length); //how many words are in each line
            words += line.split(" ").length;    //split the string using the space character as a delimiter
        }
        System.out.println("The file contains " + words + " words.");
    }
}
