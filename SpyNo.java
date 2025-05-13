import java.util.Scanner;
package number.problem;

public class SpyNo {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number:");
     int x=sc.nextInt();
     int prod=1;
     int sum=0;
     while(x!=0){
         int d=x%10;
         prod*=d;
         sum+=d;
         x/=10;
     }
     System.out.println((prod==sum?"Spy":"Not Spy");
    }
}
