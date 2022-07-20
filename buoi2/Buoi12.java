
package buoi1.pkg2;

import java.util.Scanner;
public class Buoi12 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.print("nhap a:");
            int a= sc.nextInt();
        System.out.print("nhap b:");
            int b= sc.nextInt();
        System.out.print("nhap c:");
            int c= sc.nextInt();
        if(a+b<=c||a+c<=b||b+c<=a){
            System.out.println("3 canh tren khong tao thanh tam giac");
        }else{
            if(a==b&&b==c){
                System.out.println("tam gian tren la tam deu");
            }
            else{
                if(a*a + b*b==c*c ||a*a + c*c==b*b||b*b + c*c==a*a){
                    if(a==b || a==c|| b==c)
                            System.out.println("tam giac tren la tam giac vuong can");
                    else
                        System.out.println("tam giac tren la tam giac vuong");
                }
                else{
                    if(a==b || a==c|| b==c){
                        System.out.println("tam giac tren la tam giac can");
                    }
                    else
                        System.out.println("tam giac tren la tam giac thuong");
                }
            }
        }
        
    }
    
}
