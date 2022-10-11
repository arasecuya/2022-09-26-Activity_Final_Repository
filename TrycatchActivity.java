
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class TrycatchActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> Bag = new ArrayList<String>();
 
        
        System.out.println("Choose an index");
        System.out.println("[0,1,2,3,4]");
        
    
        System.out.print("\nEnter your choosen index:");
        int input = sc.nextInt();
    //String bagBrand;
    //String bagType;
    //VariableType bagColor;

        Bag<String> p1 = new Bag<String>();
        p1.setBag_Brand("Louis Vuitton"); 
        p1.setBag_Color("White");
        p1.setBag_Type("Duffel Bag");
        Bag.add("\"" + p1.getBag_Brand() + "\"" + " It is a " + p1.getBag_Color() + " colored "+ p1.getBag_Type());
    
        Bag<String> p2 = new Bag<String>();
        p2.setBag_Brand("Hermes"); 
        p2.setBag_Color("Black");
        p2.setBag_Type("Shoulder Bag");
        Bag.add("\"" + p2.getBag_Brand() + "\"" + " It is a" + p2.getBag_Color() + " colored "+ p2.getBag_Type());

        Bag<String> p3 = new Bag<String>();
        p3.setBag_Brand("Chanel"); 
        p3.setBag_Color("Dirty White");
        p3.setBag_Type("Quilted Bag");
        Bag.add("\"" + p3.getBag_Brand() + "\"" + " It is a" + p3.getBag_Color() + " colored "+ p3.getBag_Type());
   
        Bag<String> p4 = new Bag<String>();
        p4.setBag_Brand("Dior"); 
        p4.setBag_Color("Gray");
        p4.setBag_Type("Lady Dior");
        Bag.add("\"" + p4.getBag_Brand() + "\"" + " It is a" + p4.getBag_Color() + " colored "+ p4.getBag_Type());

        Bag<String> p5 = new Bag<String>();
        p5.setBag_Brand("Gucci"); 
        p5.setBag_Color("Brown");
        p5.setBag_Type("Baguette Bag");
        Bag.add("\"" + p5.getBag_Brand() + "\"" + " It is a" + p5.getBag_Color() + " colored "+ p5.getBag_Type()); 


        try {
            if (input < 0) {
                sc.close();
                throw new BagException("Invalid input!! TRY ENTERING A POSITIVE NUMBER");
            }
            if (input > 5) {
                sc.close();
                throw new BagException("Invalid input!! TRY ENTERING A NUMBER NOT EXCEEDS FIVE");
            }

            System.out.println("Index number: " + input);
            System.out.println(Bag.get(input));

        } catch (BagException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}
