package week6;

import java.io.*;
import java.util.Scanner;

public class NotepadUygulamasi {
    public static void main(String[] args) throws IOException {

        // Kullanıcıdan veri almak için tarayıcı nesnesi
        Scanner input = new Scanner(System.in);

        String filePath = "notepad";

        // Önceden kaydedilmiş metni gösteren mesaj
        System.out.println("EN SON KAYDEDİLEN METİN ");

        // "notepad" dosyasından okumak için FileReader
        FileReader fileReader = new FileReader(filePath);

        // Satır satır okumak için BufferedReader
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Dosyanın ilk satırını oku ve yazdır
        String savedText = bufferedReader.readLine();
        System.out.println(savedText);

        // bufferedReader'ı kapat
        bufferedReader.close();

        // Kullanıcıdan yeni metin girmesini iste
        System.out.print("\n\nLütfen bir metin giriniz : ");
        String text = input.nextLine();

        // Dosya yazma hatalarını ele almak için try-catch bloğu
        try {
            // "notepad" dosyasına yazmak için FileOutputStream
            FileOutputStream output = new FileOutputStream(filePath);

            // Yazma için metin dizesini baytlara dönüştür
            byte[] bytes = text.getBytes();

            // Bayt dizisini (metni içeren) dosyaya yaz
            output.write(bytes);

            // Mesaj yazdır
            System.out.print("Metin Kaydedildi... ");

            // FileOutputStream'u kapat
            output.close();

        } catch (IOException e) {
            // Dosya yazma sırasında herhangi bir hatayı ele al
            System.out.println("Hata! Metin kaydedilemedi.");
            e.printStackTrace();
        }

    }

}