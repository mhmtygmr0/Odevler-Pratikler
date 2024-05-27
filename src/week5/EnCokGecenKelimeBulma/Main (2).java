package week5.EnCokGecenKelimeBulma;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıya metin girmesi için bir istek gönderiyoruz.
        System.out.print("Lütfen bir metin giriniz : ");
        String metin = input.nextLine();

        // Girilen metni boşluklara göre parçalayarak kelimeleri bir diziye atıyoruz.
        String[] kelimeler = metin.split(" ");

        // Kelimelerin sayısını ve tekrarlarını takip edecek bir HashMap oluşturuyoruz.
        HashMap<String, Integer> x = new HashMap<>();

        // Tüm kelimelerin üzerinden geçmek için bir döngü başlatıyoruz.
        for (int i = 0; i < kelimeler.length; i++) {

            // Eğer kelime HashMap'te yoksa, ilk kez görülen bir kelime demektir, bu yüzden 1 değerini ekliyoruz.
            if (!x.containsKey(kelimeler[i])) {
                x.put(kelimeler[i], 1);
            }
            // Eğer kelime zaten HashMap'te varsa, bu kelimeyi bir daha gördük demektir, bu yüzden sayısını arttırıyoruz.
            else {
                x.put(kelimeler[i], x.get(kelimeler[i]) + 1);
            }

        }
        // Tüm kelimelerin ve kullanım sayılarının olduğu HashMap'i döngüye alıyoruz.
        for (String a : x.keySet()) {
            System.out.println("Kelime : " + a + " \t Kullanım Adeti = " + x.get(a));
        }
    }
}