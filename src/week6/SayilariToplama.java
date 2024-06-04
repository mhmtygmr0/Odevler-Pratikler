package week6;

import java.io.*;

public class SayilariToplama {
    public static void main(String[] args) {

        // Toplamı tutmak için bir değişken tanımlanıyor
        int sum = 0;

        try {
            // "sayilar.txt" dosyasını okumak için BufferedReader oluşturuluyor
            BufferedReader br = new BufferedReader(new FileReader("sayilar.txt"));

            // Dosyadan bir satır okunuyor
            String content = br.readLine();

            // Dosyanın sonuna gelene kadar döngü devam ediyor
            while (content != null) {
                // Okunan satırdaki sayı, toplama ekleniyor
                sum += Integer.parseInt(content);

                // Okunan satır ekrana yazdırılıyor
                System.out.println(content);

                // Bir sonraki satır okunuyor
                content = br.readLine();
            }
        } catch (IOException e) {
            // Bir giriş/çıkış hatası meydana gelirse, bir RuntimeException fırlatılıyor
            throw new RuntimeException(e);
        }

        // Toplam sonuç ekrana yazdırılıyor
        System.out.println("Yukarıdaki Sayıların Toplamı = " + sum);
    }
}