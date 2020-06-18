public class BubbleString {
            public static void main(String[] args) {
                String[] str = {"e", "s", "o", "n", "a"};   //can't be words but single letters
                String t;

                //display original array
                System.out.print("The original array is: ");
                for (int i = 0; i < str.length; i++)
                    System.out.print(" " + str[i]);
                System.out.println();
                //the Bubble sort has two for loops
                for (int a = 1; a < str.length; a++) //the outer loop causes this process to repeat until the entire array has been sorted
                    for (int b = str.length - 1; b >= a; b--) { //the inner loop checks adjacent elements in the array looking for out-of-order elements
                        if (str[b - 1].compareTo(str[b]) > 0) { //the way to compare strings is different from comparing numbers
                            t = str[b - 1]; //when an out-of-order elements is found, the two elements are exchanged.
                            str[b - 1] = str[b];
                            str[b] = t;
                        }
                    }
                //display sorted array using the same code above
                System.out.print("Sorted array is: ");
                for (int i = 0; i < str.length; i++)
                    System.out.print(" " + str[i]);
                System.out.println();
            }
        }

