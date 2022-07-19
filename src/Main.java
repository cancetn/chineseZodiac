import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
         Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
         Çin Zodyağı nasıl hesaplanır?
         Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.*/

        int dogumYılı, kalan;

        Scanner inp = new Scanner(System.in);

        System.out.println("Dogum yilinizi giriniz = ");

        dogumYılı = inp.nextInt();

        kalan = dogumYılı % 12 ;

        switch(kalan){
            case 0 :{
                System.out.println("Maymun");
                break;
            }
            case 1 :{
                System.out.println("Horoz");
                break;
            }
            case 2 :{
                System.out.println("Kopek");
                break;
            }
            case 3 :{
                System.out.println("Domuz");
                break;
            }
            case 4 :{
                System.out.println("Fare");
                break;
            }
            case 5 :{
                System.out.println("Okuz");
                break;
            }
            case 6 :{
                System.out.println("Kaplan");
                break;
            }
            case 7 :{
                System.out.println("Tavsan");
                break;
            }
            case 8 :{
                System.out.println("Ejderha");
                break;
            }
            case 9 :{
                System.out.println("Yilan");
                break;
            }
            case 10 :{
                System.out.println("At");
                break;
            }
            case 11 :{
                System.out.println("Koyun");
                break;
            }
        }




    }
}
