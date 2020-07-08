import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    File file = new File("movies.txt");
    Scanner scanner = new Scanner(file);
    try {
        scanner = new Scanner(new File("movies.txt"));
    }
    catch(FileNotFoundException e) {
        System.out.println("File not found or not opened.");
        System.exit(0);
    }

    Game guessingMovie = new Game(scanner);
    Scanner keyboard = new Scanner(System.in);
        guessingMovie.play();
    }
}
