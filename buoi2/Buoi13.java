
package buoi1.pkg3;
import java.util.Scanner;

public class Buoi13 {


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("nhap n:");
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++){
        if(n%i==0)
            sum=sum+i;
    }
        System.out.println("tong cac uoc la: "+sum);
    }
    
}
