
package hesap_mak;

import java.util.Scanner;


public class Hesap_mak {

    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("İŞLEM SEÇİNİZ");
        System.out.println("+ : Toplama işlemi");
        System.out.println("- : Çıkarma işlemi");
        System.out.println("* : Çarpma işlemi");
        System.out.println("/ : Bölme işlemi");
         int a;
         int b;
        String islem=girdi.nextLine();
        
        switch(islem) {
        case "+" :
        System.out.println("Toplama işlemi yapılacak");
        System.out.println("Birinci sayıyı girin");
        a=girdi.nextInt();
        System.out.println("İkinci sayıyı girin");
        b=girdi.nextInt();
        System.out.println("Sonuç : "+(a+b));
        break;
         case "-" :
        System.out.println("Çıkarma işlemi yapılacak");
        System.out.println("Birinci sayıyı girin");
        a=girdi.nextInt();
        System.out.println("İkinci sayıyı girin");
        b=girdi.nextInt();
        System.out.println("Sonuç : "+(a-b)); 
        break;
         case "*" :
        System.out.println("Çarpma işlemi yapılacak");
        System.out.println("Birinci sayıyı girin");
        a=girdi.nextInt();
        System.out.println("İkinci sayıyı girin");
        b=girdi.nextInt();
        System.out.println("Sonuç : "+(a*b)); 
        break;
         case "/" :
        System.out.println("Bölme işlemi yapılacak");
        System.out.println("Birinci sayıyı girin");
        a=girdi.nextInt();
        System.out.println("İkinci sayıyı girin");
        b=girdi.nextInt();
        System.out.println("Sonuç : "+((double)a/b));
        break;
        default:System.out.println("! GEÇERSİZ İŞLEM");
    }
      
    }

    
    
}
