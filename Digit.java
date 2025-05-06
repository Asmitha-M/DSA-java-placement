import java.util.Scanner;
package number.problem;
public class Digit {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number:");
     int x=sc.nextInt();
     while(x!=0){
         int dig=x%10;
         System.out.println(dig);
         x/=10;         
     }
    }
}
