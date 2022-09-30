import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {
    public static void main(String[] args){
        
    ArrayList<Object> personalData = new ArrayList<Object>();
    try (Scanner info = new Scanner(System.in)) {

            System.out.print("Complete Name: ");
            String name = info.nextLine();

            System.out.print("Age: ");
            int age = info.nextInt();

            System.out.print("Address: ");
            String address = info.next();

            System.out.print("Gender: ");
            String gender = info.next();

            System.out.print("Email Address: ");
            String email_address = info.next();

            personalData.add(name);
            personalData.add(age);
            personalData.add(address);
            personalData.add(gender);
            personalData.add(email_address);
        }


        System.out.println(personalData);


    }

}