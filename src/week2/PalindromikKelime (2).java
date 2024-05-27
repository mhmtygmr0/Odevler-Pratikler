package week2;
import java.util.Scanner;
public class PalindromikKelime {

    // Kelimenin palindromik olup olmadığını kontrol eden metod
    static String isPalindrome(String kelime){

        int i = 0;    // İlk karakterin indeksi
        int j = kelime.length() - 1;    // Son karakterin indeksi

        // İlk karakter ile son karakter aynı olana kadar döngü devam eder
        while (i < j) {
            // Karakterler eşleşmiyorsa
            if (kelime.charAt(i) != kelime.charAt(j)){
                return  "Palindromik Kelime Değildir";
            }
            // İndeksleri güncelle
                i++;
                j--;
        }

        // Döngüden çıkıldığında palindromikse bu mesajı döndürür
        return "Palindromik Kelime'dir";
    }


    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        // Kullanıcıya kelime girmesi istenir
        System.out.print("Kelime Giriniz : ");
        String kelime = x.nextLine();

        // Girilen kelimenin palindromik olup olmadığı kontrol edilir ve sonuç ekrana yazdırılır
        System.out.println(isPalindrome(kelime));
    }
}