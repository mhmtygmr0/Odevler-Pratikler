package week2;
import java.util.Scanner;
public class DeseneGoreMetotOlusturma {

    static int sonDeger = 0;

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan bir sayı al
        System.out.print("N Sayısı : ");
        int n = x.nextInt();

        sayiMetot(n);  // İlk metodu çağır
        sayiMetot2(n); // İkinci metodu çağır

    }

    // İlk metot, sayıları azaltarak ekrana basar
    public static int sayiMetot(int sayi){

        System.out.print(sayi + "  "); // Sayıyı ekrana yazdır
        sayi -= 5; // Sayıdan 5 azalt

        // Eğer sayı hala pozitif ise, metodu kendisini çağır
        if(sayi > 0){
            return sayi + sayiMetot(sayi);
        }

        sonDeger = sayi; // son sayi degerinin alır
        return sayi;

    }
    // İkinci metot, sayıları artırarak ekrana basar
   public static int sayiMetot2(int sayi){

       System.out.print(sonDeger + "  "); // Son değeri ekrana yazdır
       sonDeger += 5; // Son değeri 5 arttır

       if(sonDeger <= sayi){
           return sayiMetot2(sayi);
       } else {
           return 0; // Eğer son değer, verilen sayıdan büyükse, 0 döndürür ve metottan çıkar.
       }
   }
}