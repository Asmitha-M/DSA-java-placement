import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=Sc.nextInt();
        }
        int evencount=0,oddcount=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even count:"+evencount);
        System.out.println("Odd count:"+oddcount);
    }
}
