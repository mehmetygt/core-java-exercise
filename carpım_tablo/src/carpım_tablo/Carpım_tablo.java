
package carpım_tablo;

public class Carpım_tablo {
    //iç içe forlar ile çarpım tablosu

    public static void main(String[] args) {
        
        int sonuc;
        System.out.println("ÇARPIM TABLOSU");
        
        for (int i = 1; i <=10; i++) {
            
            for (int j = 1; j <=10; j++) {
                sonuc=i*j;
             
                System.out.println(i+"x"+j+" = "+sonuc);
                
                
            } System.out.println("************");
            
        }
      
    }
    
}
