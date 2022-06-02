
package faiz;

import java.util.Scanner;

/* faiz uygulamamız ana para ve yılllık oran ile toplam para hesaplaması yapcak*/
public class Faiz {

   
    public static void main(String[] args) {
        System.out.println("welcome ");
        Scanner scan=new Scanner(System.in);
        System.err.println("yatırmak istediğiniz para miktarını giriniz :");
        double anapara=scan.nextDouble();
        System.err.println("yıllık istediğiniz faiz oranını giriniz :");
        double oran=scan.nextDouble();
        System.err.println("kaç yıılık vade istediğinizi giriniz :");
        int vade=scan.nextInt();
        double vadeli=anapara;
        
        for (int i = 0; i < vade; i++) {
           vadeli=(vadeli*(oran/100))+vadeli;
           
      System.out.println("Bankamız yatırmak istediğiniz "+anapara+" yüzde "+oran+" oran ile "+i+" yılda "+vadeli+"tl olacaktır");
           
        }
    }   
}
