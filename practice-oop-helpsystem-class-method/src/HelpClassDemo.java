class Help {
    void helpOn(int what) {  //method 1 using void
        switch (what) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("  statement sequence");
                System.out.println("  break");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration");
                System.out.println(" statement");
                break;
            case '4':
                System.out.println("The while: \n");
                System.out.println("while(condition) statement");
                break;
            case '5':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println(" } while(condition);");
                break;
            case '6':
                System.out.println("The break: \n");
                System.out.println("break; or break label");
                break;
            case '7':
                System.out.println("The continue: \n");
                System.out.println("continue; or continue label");
                break;
        }
        System.out.println();
    }
    void showMenu() {    // method 2 using void
        System.out.println("Help on: ");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.println("Choose one (q to quit): ");
    }
    boolean isValid(int ch) {    //method 3 using boolean
        if(ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}

public class HelpClassDemo {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice, ignore;
        Help hlpobj = new Help();  // very important line to create a new object called hlpobj in the Help class
        for (; ; ) {
            do {                // add a do loop here
                hlpobj.showMenu(); //call the method instead of typing the whole thing again here
                choice = (char) System.in.read();
                do {               // another do loop here to discard the unwanted input
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isValid(choice));  // call the method instead of typing the whole thing again here
            if (choice == 'q')
                break;
            System.out.println("\n");
            hlpobj.helpOn(choice);  //call the method instead of typing the whole thing again here
        }
    }
} //now you have a help system component that can be reused whenever it is needed