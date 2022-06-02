
package sayi_degistir;
import java.util.Scanner;
/*Kullanıcı tarafından girilen sayıların yerini değiştiren mini proje*/

public class Sayi_degistir {

    public static void main(String[] args) {
        Scanner sayı=new Scanner(System.in);
        System.out.println("Bir sayıgiriniz.");
        int bsayi=sayı.nextInt();
        System.out.println("Bir sayı daha giriniz.");
        int isayi=sayı.nextInt();
        System.out.println("Sayıların ilk hali ");
        System.out.println("birinci sayı : "+bsayi);
        System.out.println("ikinci sayı :  "+isayi);
        System.out.println("değişmiş hai ile");
         int tmp=bsayi;
         bsayi=isayi;
         isayi=tmp;
        System.out.println("birinci sayı : "+bsayi);
        System.out.println("ikinci sayı : "+isayi);
    }
    
}
