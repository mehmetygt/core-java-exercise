
package amstrong;

import java.util.Scanner;
/*Amsatrong sayısı her rakamı nın;sayının basamağı kadar üssü alındııp toplamına eşit olan sayılardır.
örnek 3 basamakılı 371 sayısının her rakamının 3 üssü alınıp toplandığında 371 olur. 
diğer bir örnek 1634 tür.*/

public class Amstrong {

   
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
        System.out.println("Sayı giriniz");
        int sayı=scanner.nextInt();
        int basamak_sayısı=0;
          int basamak_degeri;
        int geçici_sayı=sayı;
        int toplam=0;
        
        
        while (sayı>0) { 
            sayı=sayı/10;
            basamak_sayısı++;
            
        }
        sayı=geçici_sayı;
      
        for (int i = basamak_sayısı; i > 0; i--) {
            basamak_degeri=geçici_sayı%10;
            geçici_sayı=geçici_sayı/10;
            toplam=(int) ((Math.pow(basamak_degeri, basamak_sayısı))+toplam);
            
        }
        if (sayı==toplam) {
            System.out.println(basamak_sayısı+" basamaklı "+sayı+ " sayısı bir amstrong sayısıdır");
            
        }
        else{System.out.println(sayı+ " sayısı bir amstrong sayısı değildir");}
 
    }
    
}
