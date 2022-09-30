import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hash_set{
     public static void main(String [] args) {
 
    Set<String> hset=new HashSet<String>();  
    Scanner scanner = new Scanner(System.in)  ; 
    System.out.println("\nInput Names"); 
      for (int i = 0; i < 5; i++) { 
          System.out.println("\nEnter Name " + " : ");
          hset.add(scanner.nextLine()); 
      } 
      System.out.println("Output: "+ hset);  
      scanner.close();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
    }
}