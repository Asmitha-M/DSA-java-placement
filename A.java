import java.util.Scanner;
package number.problem;
public class A {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number:");
     int a=sc.nextInt();
     int sum=0;
     for(int i=0;i<=a;i++){
         sum+=i;
     }
     System.out.println(sum);
    }
}
