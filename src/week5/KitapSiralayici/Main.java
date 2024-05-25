package week5.KitapSiralayici;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nKitap Adına Göre Sıralama");
        System.out.println("##########################");

        // Farklı kitap nesneleri oluşturuluyor
        Book b3 = new Book("Suç ve Ceza", "Fyodor Dostoyevski", 1866, 671);
        Book b1 = new Book("Uçurtma Avcısı", "Khaled Hosseini", 2003, 372);
        Book b2 = new Book("Hayvan Çiftliği", "George Orwell", 1945, 112);
        Book b5 = new Book("Sefiller", "Victor Hugo", 1862, 1232);
        Book b6 = new Book("Beyaz Diş", "Jack London", 1906, 252);
        Book b4 = new Book("Ateşten Gömlek", "Halide Edib Adıvar", 1923, 236);

        // Kitapları ada göre sıralamak için TreeSet oluşturuluyor
        TreeSet<Book> books = new TreeSet<>();

        // Kitaplar TreeSet'e ekleniyor
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);

        // Kitap isimleri yazdırılıyor
        for (Book book : books) {
            System.out.println("Kitap Adı :" + book.getName());
        }

        System.out.println("\nKitap Sayfa Sayısına Göre Sıralama");
        System.out.println("##########################");

        // Kitapları sayfa sayısına göre sıralamak için TreeSet oluşturuluyor (Comparator kullanılarak)
        TreeSet<Book> books2 = new TreeSet<>(new Book());

        // Kitaplar TreeSet'e ekleniyor
        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);
        books2.add(b6);

        // Kitap isimleri ve sayfa sayıları yazdırılıyor
        for (Book book2 : books2) {
            System.out.println("Kitap Adı :" + book2.getName() + "\t \t Sayfa Sayısı :" + book2.getPages());
        }
    }
}