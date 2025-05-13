import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=Sc.nextInt();
        }
        for(int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }    
}
