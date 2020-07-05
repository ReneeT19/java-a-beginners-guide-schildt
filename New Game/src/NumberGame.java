import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
    Guessing game = new Guessing(120,150);
//    Guessing game = new Guessing();
    game.intro();
    game.guess();
    }
}
