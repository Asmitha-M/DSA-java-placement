import java.util.Scanner;
public class AvgArray {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=Sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<=a.length;i++){
            sum+=i;
        }
        double average=(double)sum/a.length;
        System.out.println("Average"+average);
    }
}
