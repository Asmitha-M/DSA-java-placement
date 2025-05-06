import java.util.Scanner;
package number.problem;
public class Palindrome {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number:");
     int a=sc.nextInt();
     int rev=0;
     int temp=a;
     while(a!=0){
         int d=a%10;
         rev=rev*10+d;
         a/=10;
     }
     System.out.println((temp==rev)?"Palindrome":"Not palindrome");
    }
}
