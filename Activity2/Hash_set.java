import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Hash_set{
    public static void main(String[]args){
        Character userChoice;
        try (Scanner input = new Scanner(System.in)) {
            Set<Integer> integers = new HashSet<Integer>();
            while (true) {
                displaySelect();

                userChoice = input.next().charAt(0);
                userChoice = Character.toUpperCase(userChoice);
                switch (userChoice) {
                    case 'A':
                        System.out.println();
                        System.out.print("Add an integer: ");
                        int addedNum = input.nextInt();
                        System.out.println("");

                        if (addedNum < 0) {
                           System.out.println("Error! Enter a positive integer");
                        }
                        else if(integers.contains(addedNum)){
                            System.out.println("Number already existed. Not added ");
                            break;
                        }
                         else {
                            integers.add(addedNum);
                            System.out.println("The Number" + addedNum + " Added Successfully! " );
                            break;
                        }

                    case 'B':
                        System.out.println(" ");
                        System.out.print(" Remove a number: ");
                        int removedNum = input.nextInt();

                        if (integers.contains(removedNum)) {
                            integers.remove(Integer.valueOf(removedNum));
                            System.out.println(
                                    "The number " + removedNum + " Successfully Removed! ");
                            System.out.println("");
                            break;
                        }

                    case 'C':
                        System.out.println(" ");
                        System.out.println("Numbers in HashSet: ");
                        System.out.println(integers);
                        break;

                    case 'D':
                        System.out.println("Clear HashSet?");
                        System.out.print("Type Yes to agree and No for disagree: ");
                        String yesNo =input.next();

                        if (yesNo.equalsIgnoreCase("Y")) {
                            integers.clear();
                            System.out.println("HashSet Cleared!");
                            break;
                        } else {
                            System.out.println("You didn't clear your HashSet");
                            break;
                        }


                    case 'E':
                    input.close();
                        System.out.println("Thank you for using the program.");
                        System.exit(0);

                    default:
                        System.out.println("Please input a proper choices in the program!");
                }

            }
        }

    }

    private static void displaySelect() {
        System.out.println("||||||||||||||||||||||||||||||");
        System.out.println("A. Add Numbers");
        System.out.println("B. Remove Numbers");
        System.out.println("C. Display Numbers");
        System.out.println("D. Clear Numbers");
        System.out.println("E. Exit");
        System.out.println("||||||||||||||||||||||||||||||||");
        System.out.println();
        System.out.print("Select your choice: ");

    }
    }
