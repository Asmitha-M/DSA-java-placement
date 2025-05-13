import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=Sc.nextInt();
        }
        int sum=0,product=1;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
            product=product*a[i];
        }
            System.out.println("Sum:"+sum +"Product:"+product);
    }
}
