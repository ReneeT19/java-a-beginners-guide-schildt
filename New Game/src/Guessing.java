import java.util.Random;
import java.util.Scanner;

public class Guessing {
    private int input;
    private int answer;
    private int numberOfGuesses;
    private boolean correctGuess;
    int min;
    int max;

    Guessing() {
        min = 1;
        max = 100;
        randomNumber(min,max);
    }

    Guessing(int min, int max) {
        this.min = min;
        this.max = max;
        randomNumber(min,max);
    }

    public void intro() {
        System.out.println("I have randomly chosen a number between " + min + " and " + max + ".\n" + "Try to guess it.");
    }

    public void randomNumber(int min, int max) {
        this.min = min;
        this.max = max;
        if(min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random random = new Random();
        answer = random.nextInt((max - min) + 1) + min;
//        System.out.println(answer);
//        answer = (int) (Math.random() * 100 + 1);
    }

    public void guess() {
        while (numberOfGuesses <= 10) {
            checkIfCorrect();
            if(correctGuess) {
                break;
            } else if (numberOfGuesses == 10)
                System.out.println("GAME OVER...YOU LOSE!!!\n" + "The number was: " + answer);
                break;
        }
    }

    public void getInput() {
        boolean valid = false;
        while (valid == false) {
            System.out.println("Choose again: ");
            Scanner scanner = new Scanner(System.in);
            this.input = scanner.nextInt();
            if (this.input >= min && this.input <= max) {
                valid = true;
            } else {
                System.out.println("Invalid, please only enter numbers between" + min + " and " + max + ".");
            }
        }
    }

    public boolean checkIfCorrect() {
        correctGuess = false;
        numberOfGuesses = 0;
        for (int i = 0; i < 10; i++) {
            getInput();
            if (input == answer) {
                correctGuess = true;
                System.out.println("CORRECT...YOU WIN!!!");
                break;
            } else if (input > answer) {
                numberOfGuesses += 1;
                System.out.println("It's smaller than " + input);
                System.out.println("You have " + (10 - numberOfGuesses) + " guess(es) left.");
            } else if (input < answer) {
                numberOfGuesses += 1;
                System.out.println("It's greater than " + input);
                System.out.println("You have " + (10 - numberOfGuesses) + " guess(es) left.");
            } else if (numberOfGuesses == 10) {
                System.out.println("GAME OVER...YOU LOSE!!!\n" + "The number was: " + answer);
                break;
            }
        } return correctGuess;
    }
}
