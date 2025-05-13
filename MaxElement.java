import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter size: ");
        int n=Sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<a.length;i++){
            a[i]=Sc.nextInt();
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Max:"+max)
    }
}
