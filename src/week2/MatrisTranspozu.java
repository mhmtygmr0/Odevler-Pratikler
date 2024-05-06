package week2;

import java.util.Scanner;

public class MatrisTranspozu {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        // Kullanıcıdan matrisin satır sayısını al
        System.out.print("Matrisin satır sayısını girin: ");
        int satir = x.nextInt();

        // Kullanıcıdan matrisin sütun sayısını al
        System.out.print("Matrisin sütun sayısını girin: ");
        int sutun = x.nextInt();

        // Kullanıcıdan matrisin elemanlarını girmesini iste
        System.out.println("Matrisin elemanlarını girin:");


        // Kullanıcının girdiği satır ve sütun sayılarına göre bir matris oluştur
        int[][] matris = new int[satir][sutun];
        // Satırları döngü ile dolaşıyoruz.
        for (int i = 0; i < satir; i++) {
            // Sütunları döngü ile dolaşıyoruz.
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + (i+1) + "][" + (j+1) + "]: ");
                matris[i][j] = x.nextInt();
            }
        }

        // Transpoz matrisi için bir matris oluşturuyoruz.
        int[][] transpoz = new int[sutun][satir];
        // Transpozun satırlarını döngü ile dolaşıyoruz.
        for (int i = 0; i < sutun; i++) {
            // Transpozun sütunlarını döngü ile dolaşıyoruz.
            for (int j = 0; j < satir; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

        // Matris ve transpozunu yazdır
        System.out.println("===============");
        System.out.println("Matris:");
        print(matris);  // Matrisi yazdırmak için print fonksiyonunu çağırıyoruz.
        System.out.println("Transpoze:");
        print(transpoz);  // Transpozu yazdırmak için print fonksiyonunu çağırıyoruz.

    }

    // Matrisi yazdırmak için yardımcı fonksiyon
    static void print(int[][] yazdir) {
        for (int[] i : yazdir) {

            for (int j = 0; j < yazdir[0].length; j++) {
                System.out.print(i[j] + "\t");
            }

            System.out.println();

        }
    }

}