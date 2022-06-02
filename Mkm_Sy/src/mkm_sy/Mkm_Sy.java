
package mkm_sy;
import java.util.Scanner;
/* Mükkemmel sayıyı bulan mini proje,
Mükemmel sayı kendiis dışındaki bütün tam bölenlerinin toplamı kendisine eşit olan sayıdır.
*/
public class Mkm_Sy {

    public static void main(String[] args) {
      int top=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz.");
        int sayi=scanner.nextInt();
      
        for (int i = 1; i <=sayi/2; i++) {
            if (sayi%i==0) {
                top+=i;
            }}
        if (top==sayi) {
            System.out.println(sayi+" sayısı bir mükemel sayıdır");
            
        }else {System.out.println(sayi+" sayısı bir mükemel sayı değildir");}
        
    }
    
}
