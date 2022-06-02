
package boy_kitle.index;
import  java.util.Scanner ;

/* Girilen verilere göre boy kitle indeksi bulan proje.
  Boy kilo indeks formülü = kilo7(boy*boy)*/

public class Boy_Kitleİndex {
  
   
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        System.out.println("LÜTFEN BOYUNUZU METRE OLARAK GİRİNİZ  (ÖRENEK=1,60)");
     double boy =s.nextDouble();
        System.out.println("LÜTFEN KİLONUZU  GİRİNİZ");
     int kilo =s.nextInt();
     double ind=kilo/(boy*boy);
        System.out.println("Boy Kilo İndexiniz = "+ind); 
        
        if (ind<=18.5) {
            System.out.println("Zayıfsınız");
            
        }
        else if (ind>18.5 && ind<=25) {
            System.out.println("Normalsiniz");
            
        }
        else if (ind>25 && ind<=30) {
            System.out.println("Kilolusunuz");
            
        }
        else{System.out.println("Obezsiniz");}
    }
    
}
