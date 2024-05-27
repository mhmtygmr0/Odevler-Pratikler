package week5.KitapSiralayici;

import java.util.*;

public class Book implements Comparable<Book>, Comparator<Book> {

    private String name; // Kitabın adı
    private String writerName; // Yazarın adı
    private int history; // Yayın tarihi
    private int pages; // Sayfa sayısı

    // Parametreli yapıcı metot
    public Book(String name, String writerName, int history, int pages) {
        this.name = name;
        this.writerName = writerName;
        this.history = history;
        this.pages = pages;
    }

    // Parametresiz yapıcı metot
    public Book() {
    }

    // Kitapları ada göre karşılaştıran metot (Comparable arayüzünden geliyor)
    @Override
    public int compareTo(Book other) {
        return (this.getName().compareTo(other.getName()));
    }

    // Kitapları sayfa sayısına göre karşılaştıran metot (Comparator arayüzünden geliyor)
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPages() - o2.getPages();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}