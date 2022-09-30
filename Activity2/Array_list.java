import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {

    public static void main(String[] args) {

        Character userChoice;
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<Integer> integers = new ArrayList<>();
            while (true) {
                displaySelect();

                userChoice = input.next().charAt(0);
                userChoice = Character.toUpperCase(userChoice);
                switch (userChoice) {

                    case '1':
                        System.out.println();
                        System.out.print("Enter a number: ");
                        int addedNum = input.nextInt();
                        System.out.println("");

                        if (addedNum > 0) {
                            integers.add(addedNum);
                            System.out.println("You successfully enter a number " + addedNum + " to the ArrayList");
                            System.out.println(" ");
                            break;
                        } else {
                            System.out.println("Input positive integers only");
                        break;
                        }

                    case '2':
                        System.out.println(" ");
                        System.out.print("Remove a number from the Arraylist: ");
                        int removedNum = input.nextInt();

                        if (integers.contains(removedNum)) {
                            integers.remove(Integer.valueOf(removedNum));
                            System.out.println(
                                    "The number " + removedNum + " has been removed from Arraylist!");
                            System.out.println("");
                            break;
                        }

                    case '3':
                        System.out.println(" ");
                        System.out.print("Numbers from the ArrayList: ");
                        System.out.println("");
                        System.out.println(integers);
                        System.out.println("");
                        break;

                    case '4':
                        System.out.println("Delete Arraylist" );
                        System.out.print(" Input Yes to Agree | No to Disagree: ");
                        String yesNo =input.next();

                        if (yesNo.equals("A")) {
                            integers.clear();
                            System.out.println("ArrayList Deleted ");
                            break;

                        } else {
                            System.out.println("ArrayList Undeleted");
                        break;
                        }
                    case '5':
                    input.close();
                        System.out.println("Thank you!");
                        System.exit(0);

                    default:
                        System.out.println("Input your choices!");
                }

            }
        }

    }

    private static void displaySelect() {
        System.out.println("1. Add Integers");
        System.out.println("2. Remove Numbers"); 
        System.out.println("3. Display Numbers");
        System.out.println("4. Clear Numbers");
        System.out.println("5. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");

    }
}