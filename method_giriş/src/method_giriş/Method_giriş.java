
package method_giriş;

import java.util.Scanner;

public class Method_giriş {
    
    
    public static  void selamalama(){
    
        System.out.println("merhaba hoş geldin");}
 
            
   public  static void faktöriyel(){
       System.out.println("sayı gir");
       Scanner scan=new Scanner(System.in);
       int sayı=scan.nextInt();
       int fac=1;
       for (int i = 1; i <= sayı; i++) {
           
         fac=i*fac;
           
       }
       System.out.println("sonuç :"+fac);
   }
    public static void selam_parametre(String isim){
    
        System.out.println("merhaba "+isim);
    
    }
    public static void toplam(int a,int b){
    
    int top=a+b;
        System.out.println("toplam :"+top);
    }
     public static int topla(int a,int b){
         return (a+b);
    
     }
     
     public static int kare(int a){
     
     return a*a;
     
     } 
     //method overloaiding örnek
     public  static void çarp(int a,int b,int c){
     
         System.out.println("üç sayının çarpımı :"+(a*b*c));
         
     }
     public  static void çarp(int a,int b){
         System.out.println("iki sayının çarpımı : "+(a*b));}
     
    public static void main(String[] args) {
        selamalama();
        //faktöriyel();
        selam_parametre("bedirhan");
        toplam(5, 6);
        System.out.println("çıktı :"+kare(topla(5, 6)));
        çarp(2, 3);
        çarp(2, 3, 4);
    }
    
}
