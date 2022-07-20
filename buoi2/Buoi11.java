import java.util.Scanner;
package buoi1.pkg1;

/**
 *
 * @author Long
 */
public class Buoi11 {

 
    public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
        System.out.print("nhap ngay:");
        int ngay= sc.nextInt();
        System.out.print("nhap thang:");
        int thang= sc.nextInt();
        System.out.print("nhap nam:");
        int nam= sc.nextInt();
//        if(ngay>=18 && ngay<=20 && thang>=1 && thang<=2)
//             System.out.println("bao binh");
//        if(ngay>=19 && ngay<=20 && thang>=2 && thang<=3)
//            System.out.println("song ngu");
        switch(thang){
            case 1:
                if(ngay>=18){
                    System.out.println("bao binh");
                    break;
                }
                else{
                    System.out.println("ma ket");
                }
            case 2:
                if(ngay<=20){
                    System.out.println("bao binh");
                    break;
                }
                else{
                    System.out.println("song ngu");
                    break;
                }
            case 3:
                if(ngay<21){
                    System.out.println("song ngu");
                    break;
                }
                else{
                    System.out.println("bach duong");
                }
            case 4:
                if(ngay<=20){
                    System.out.println("bach duong");
                    break;
                }
                else{
                    System.out.println("kim nguu");
                    break;
                }
            case 5:
                if(ngay<=20){
                    System.out.println("kim nguu");
                    break;
                }
                else{
                    System.out.println("song tu");
                    break;
                }
            case 6:
                if(ngay<=21){
                    System.out.println("song tu");
                    break;
                }
                else{
                    System.out.println("cu giai");
                    break;
                }
            case 7:
                if(ngay<=22){
                    System.out.println("cu giai");
                    break;
                }
                else{
                    System.out.println("su tu");
                    break;
                }
            case 8:
                if(ngay<=22){
                    System.out.println("su tu");
                    break;
                }
                else{
                    System.out.println("xu nu");
                    break;
                }
            case 9:
                if(ngay<=22){
                    System.out.println("xu nu");
                    break;
                }
                else{
                    System.out.println("thien binh");
                    break;
                }
            case 10:
                if(ngay<=23){
                    System.out.println("thien binh");
                    break;
                }
                else{
                    System.out.println("bo cap");
                    break;
                }
            case 11:
                if(ngay<=22){
                    System.out.println("bo cap");
                    break;
                }
                else{
                    System.out.println("nhan ma");
                    break;
                }
            case 12:
                if(ngay<=21){
                    System.out.println("nhan ma");
                    break;
                }
                else{
                    System.out.println("ma ket");
                    break;
                }
                    
                    
                    
        }
    
    }
    
}




