
package ortalama.pkg2;
import java.util.Scanner;
public class Ortalama2 {
    public static void main(String[] args) {
    for (int i = 1; i < 6; i++) {    
    Scanner bir= new Scanner(System.in);
	System.out.print(i+". Öğrenci Adı Soyadı :");
	String adsoyad = bir.next();
        System.out.print("ödev : ");
        double odev = bir.nextInt();
        System.out.print("Ara Sınav : ");
	double arasinav = bir.nextInt();
        System.out.print("Dönem Sonu : ");
        double donemsonu = bir.nextInt();
        double ortalama =(odev*(0.2))+(arasinav*(0.3))+(donemsonu*(0.5));
int x = 0;             
if(ortalama<45)
x=1;
else if (ortalama<50)
x=2;
else if (ortalama<55)
x=3;
else if (ortalama<60)
x=4;
else if (ortalama<70)
x=5;
else if (ortalama<75)
x=6;
else if (ortalama<80)
x=7;
else if (ortalama<90)
x=8;
else if (ortalama<=100)
x=9;                            
switch(x) {
	case 1:
		{System.out.println("Ortalama ="+ ortalama+" = FF");}
		break;
	case 2:
		{System.out.println("Ortalama ="+ ortalama+" = FD");}
		break;
	case 3:
		{System.out.println("Ortalama ="+ ortalama+" = DD");}
		break;
	case 4:
		{System.out.println("Ortalama ="+ ortalama+" = DC");}
		break;
	case 5:
		{System.out.println("Ortalama ="+ ortalama+" = CC");}
		break;
	case 6:
		{System.out.println("Ortalama ="+ ortalama+" = CB");}
		break;
	case 7:
		{System.out.println("Ortalama ="+ ortalama+" = BB");}
		break;
        case 8:
		{System.out.println("Ortalama ="+ ortalama+" = BA");}
		break;
        case 9:
		{System.out.println("Ortalama ="+ ortalama+" = AA");}
		break;
	default:
		System.out.println("HATA");
		break;}
               }}}