import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private static ArrayList<String> movieBank = new ArrayList<String>();
    private String selectedMovie;
    private char letter;
    private boolean[] guessedLetters = new boolean[26];
    //private static char incorrectGuesses;
    private String incorrectGuesses = "";
    private boolean rightGuess = false;
    private int wrongGuesses;
    private boolean hasNoDashes;

    public Game(Scanner scanner) {
        while (scanner.hasNextLine()) {
            movieBank.add(scanner.nextLine());
        }
        System.out.println(movieBank);
    }

    public void play() {
        randomMovie();
        convertString();
        while (wrongGuesses <= 10) {
            numOfWrongs();
            getLetter();
            wordSoFar();
            if (hasNoDashes) {
                System.out.println("You win!\n" + "You have guessed " + "'" + selectedMovie + "'" + " correctly.");
                break;
            } else if (wrongGuesses == 10) {
                System.out.println("Too bad, you lose!\nThe word was: " + selectedMovie);
                break;
            }
        }
    }

    public void randomMovie() {
        Random randomIndex = new Random();
        int index = randomIndex.nextInt(Game.movieBank.size());
        selectedMovie = Game.movieBank.get(index);
        System.out.println(index);
        System.out.println(selectedMovie);
    }

    public void convertString() {
        char[] selectedMovieCharArray = selectedMovie.toCharArray();
        System.out.println("You are guessing: ");
        for (int i = 0; i < selectedMovieCharArray.length; i++) {
            if (selectedMovieCharArray[i] == ' ') {
                System.out.print(" ");
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }

//        System.out.println(selectedMovie.indexOf(" "));
//        selectedMovie = selectedMovie.replaceAll(" "," ");
//        selectedMovie = selectedMovie.replaceAll("a", "_");
//        System.out.println(selectedMovie);

    public void getLetter() {
        boolean valid = false;
        while (valid == false) {
            System.out.println("Guess a letter: ");
            Scanner sc = new Scanner(System.in);
            letter = sc.next().charAt(0);
            if (letter >= 'a' && letter <= 'z') {
                guessedLetters[letter - 'a'] = true;
                valid = true;
            } else {
                System.out.println("Please enter letters only.");
            }
        }
        checkIfRight(letter);
    }

    public void checkIfGuessed(char letter) {
        for (int i = 0; i < guessedLetters.length; i++) {
            if (guessedLetters[i]) {
                if (!rightGuess) {
                    //incorrectGuesses = (char) (i + 'a');
                    System.out.print(incorrectGuesses + " ");
                }
            }
        }
        System.out.println();
    }


    public boolean checkIfRight(char letter) {
        char[] selectedMovieCharArray = selectedMovie.toCharArray();
        rightGuess = false;
        for (int i = 0; i < selectedMovieCharArray.length; i++) {
            if (letter == selectedMovieCharArray[i]) {
                rightGuess = true;
            }
        }
        if (!rightGuess) {
            wrongGuesses += 1;
            incorrectGuesses += letter + " ";
//            System.out.print(incorrectGuesses + " ");
        }
        return rightGuess;
    }

    public void numOfWrongs() {
        System.out.print("You have guessed " + wrongGuesses + " wrong letter(s): " + incorrectGuesses);
        System.out.println();
        //checkIfGuessed(letter);
    }

    public void wordSoFar() {
        char[] selectedMovieCharArray = selectedMovie.toCharArray();
        System.out.print("You are guessing: ");
        hasNoDashes = true;
        for (int i = 0; i < selectedMovieCharArray.length; i++) {
            if (selectedMovieCharArray[i] != ' ' && guessedLetters[selectedMovieCharArray[i] - 'a']) {   //map a-z to 0-25
                System.out.print(selectedMovieCharArray[i]);
            } else if(selectedMovieCharArray[i] == ' ') {
                System.out.print(" ");
            }  else {
                System.out.print("_");
                hasNoDashes = false;
            }
        }
        System.out.println();
    }
}

