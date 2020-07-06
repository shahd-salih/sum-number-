
package javaapplication8;
import java.util.Scanner;
public class JavaApplication8 {

   
    public static void main(String[] args) {
      
       Scanner in =new Scanner(System.in);
        System.out.println("welcome");
        System.out.println("enter first number");
        int fierstnumber = in.nextInt();
        System.out.println("enter second number");
        int secondnumber = in.nextInt();
        
        int sum=fierstnumber+secondnumber;
        
        System.out.println("total number");
        System.out.println(sum);
        
    }
    
}
