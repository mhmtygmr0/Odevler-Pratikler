package week5;

import java.util.Scanner;

public class TryCatchBloguProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Index numarası giriniz : ");
        int index = input.nextInt();
        System.out.println(proje(index));
    }

    public static String proje(int index) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        try {
            return index + ". Indexteki Eleman = " + (array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Hata: Geçersiz indeks numarası!";
        }
    }
}