public class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";

        switch (command) {
            case "connect": System.out.println("Connecting");
            break;
            case "cancel": System.out.println("Canceling");
            break;
            default : System.out.println("Command Error!");
            break;
        } //this method can replace if/else statements for string variables only when the data is already in a string form otherwise not necessary
    }
}
