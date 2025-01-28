import java.util.*;
public class ASCII {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);{ 
           System.out.println("Enter the character: ");
           char character=sc.next().charAt(0);
           System.out.println("ASCII Value for the given value is: "+(int)(character));
           sc.close();
   }
   } 
}
