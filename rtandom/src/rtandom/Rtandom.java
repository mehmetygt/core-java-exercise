
package rtandom;

import java.util.Random;

public class Rtandom {

    public static void main(String[] args) {
       int[] dizi=new int[10];
       for(int i=0;i<10;i++){
      Random rastgele=new Random();
      int sayi;
           sayi = rastgele.nextInt(10);
           dizi[i]=sayi;
        System.out.println(dizi[i]);
    }      
 for(int i=0; i<10;i++){
       for (int j = 1; j < 10; j++) {
          int min=dizi[i];
         if(dizi[i]>=dizi[j]){
            
             dizi[i]=dizi[j];
             dizi[j]=min;
                 } }
System.out.println(dizi[i]);
         }
 
 }
           
       }
        
    

