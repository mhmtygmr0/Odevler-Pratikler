package week5.PatikaStore;

import java.util.*;

public class Store {
    Scanner input = new Scanner(System.in);

    ArrayList<Notebook> notebooks = new ArrayList<>();
    ArrayList<CellPhone> phones = new ArrayList<>();


    boolean store = true;
    int selection;

    public void homePage() {
        notebooks.add(new Notebook(1, "HUAWEI Matebook 14", "7000.0", "Huawei", "512", "14.0", "16"));
        notebooks.add(new Notebook(2, "LENOVO V14 IGL", "3699.0", "Lenovo", "1024", "14.0", "8"));
        notebooks.add(new Notebook(3, "ASUS Tuf Gaming", "8199.0", "Asus", "2048", "15.6", "32"));

        phones.add(new CellPhone(1, "SAMSUNG GALAXY A51", "3199.0", "Samsung", "128", "6.5", "6", "32", "4500", "Siyah"));
        phones.add(new CellPhone(2, "iPhone 11 64 GB", "7379.0", "Apple", "64", "6.1", "6", "5", "4500", "Mavi"));
        phones.add(new CellPhone(3, "Redmi Note 10 Pro 8GB", "4012.0", "Xiaomi", "128", "6.5", "12", "35", "4500", "Beyaz"));

        while (store) {
            selectionScreen();
            switch (selection) {
                case 0:
                    System.out.println("Yine Bekleriz...");
                    store = false;
                    break;
                case 1:
                    notebook();
                    break;
                case 2:
                    phone();
                    break;
                case 3:
                    brand();
                    break;
            }
        }
    }

    public void selectionScreen() {
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println("1 - Notebook İşlemleri");
        System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
        System.out.println("0 - Çıkış Yap");

        System.out.print("Tercihiniz : ");
        selection = input.nextInt();

        while (selection > 3 || selection < 0) {
            System.out.print("Hatalı Tercih !!! Tekrar Giriniz : ");
            selection = input.nextInt();
        }
    }

    public void brand() {
        TreeSet<Brand> treeSet = new TreeSet<>();
        treeSet.add(new Brand(1, "Apple"));
        treeSet.add(new Brand(2, "Asus"));
        treeSet.add(new Brand(3, "Casper"));
        treeSet.add(new Brand(4, "HP"));
        treeSet.add(new Brand(5, "Huawei"));
        treeSet.add(new Brand(6, "Lenovo"));
        treeSet.add(new Brand(7, "Monster"));
        treeSet.add(new Brand(8, "Samsung"));
        treeSet.add(new Brand(9, "Xiaomi"));

        System.out.println("\nMarkalarımız");
        System.out.println("------------");
        for (Brand b : treeSet) {
            System.out.println(b.getName());
        }
        System.out.println();
    }

    public void notebook() {
        System.out.println("\nNotebook Listesi\n");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID  | Ürün Adı                       | Fiyat      | Marka      | Depolama   | Ekran      | RAM   |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook n : notebooks) {
            System.out.format("| %-3d | %-30s | %-10s | %-10s | %-10s | %-10s | %-5s |\n",
                    n.getId(), n.getProductName(), n.getPrice(), n.getBrandName(),
                    n.getMemory(), n.getScreenSize(), n.getRam());
        }
        notebookSelection();
    }

    public void notebookSelection() {
        int secim;

        boolean selection = true;
        while (selection) {
            store = false;

            System.out.println("\nNotebook İşlemleri");
            System.out.println("1 - Ürün Ekle");
            System.out.println("2 - Ürün Sil");
            System.out.println("3 - Ürün Filtrele");
            System.out.println("0 - AnaSayfa");

            System.out.print("Tercihiniz : ");
            secim = input.nextInt();

            while (secim > 3 || secim < 0) {
                System.out.print("Hatalı Tercih !!! Tekrar Giriniz : ");
                secim = input.nextInt();
            }

            switch (secim) {
                case 0:
                    selection = false;
                    store = true;
                    System.out.println();
                    break;
                case 1:
                    addNotebook();
                    break;
                case 2:
                    removeNotebook();
                    break;
                case 3:
                    filterNotebook();
                    break;
            }
        }
    }

    public void addNotebook() {
        int id = notebooks.getLast().getId() + 1;

        System.out.print("Ürün Adı : ");
        String urunAdi = input.next();

        System.out.print("Fiyat    : ");
        String fiyat = input.next();

        System.out.print("Marka    : ");
        String marka = input.next();

        System.out.print("Depolama : ");
        String depolama = input.next();

        System.out.print("Ekran    : ");
        String ekran = input.next();

        System.out.print("RAM      : ");
        String ram = input.next();


        notebooks.add(new Notebook(id, urunAdi, fiyat, marka, depolama, ekran, ram));
        System.out.println("Ürününüz Başarıyla Eklendi");
    }

    public void removeNotebook() {
        System.out.print("Silmek İsteğiniz Ürünün ID sini giriniz : ");
        int id = input.nextInt();

        notebooks.remove(id - 1);
        System.out.println("Ürününüz Başarıyla Silindi");

    }

    public void filterNotebook() {
        System.out.println("1 - ID ye Göre Filtrele");
        System.out.println("2 - Markaya ye Göre Filtrele");
        System.out.print("Tercihiniz : ");
        int tercih = input.nextInt();

        switch (tercih) {
            case 1:
                filterNotebookId();
                break;
            case 2:
                filterNotebookBrand();
                break;
            default:
                System.out.println("Hatalı Tercih!!!");
                break;
        }
    }

    public void filterNotebookId() {
        System.out.print("Lütfen Ürün ID Giriniz : ");
        int id = input.nextInt();
        int count = 0;

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID  | Ürün Adı                  | Fiyat      | Marka      | Depolama   | Ekran      | Kamera   | Pil   | Renk   |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        for (Notebook n : notebooks) {
            if (n.getId() == id) {
                System.out.println(n);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Aradığnız ID ye ait ürün bulunamamıştır...");
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------");

    }

    public void filterNotebookBrand() {
        System.out.print("Lütfen Marka Adı Giriniz : ");
        String marka = input.next();
        int count = 0;

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID  | Ürün Adı                       | Fiyat      | Marka      | Depolama   | Ekran      | RAM   |");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (Notebook notebook : notebooks) {
            if (notebook.getBrandName().equalsIgnoreCase(marka)) {
                System.out.println(notebook);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Aradığnız markaya ait ürün bulunamamıştır...");
        }

        System.out.println("----------------------------------------------------------------------------------------------------");

    }

    public void phone() {
        System.out.println("\nCep Telefonu Listesi\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID  | Ürün Adı                  | Fiyat      | Marka      | Depolama   | Ekran      | Kamera   | Pil   | Renk   |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        for (CellPhone phone : phones) {
            System.out.format("| %-3d | %-25s | %-10s | %-10s | %-10s | %-10s | %-8s | %-5s | %-6s |\n",
                    phone.getId(), phone.getProductName(), phone.getPrice(), phone.getBrandName(),
                    phone.getMemory(), phone.getScreenSize(), phone.getCamera(), phone.getBattery(),
                    phone.getColor());
        }
        phoneSelection();
    }


    public void phoneSelection() {
        int secim;

        boolean selection = true;
        while (selection) {
            store = false;

            System.out.println("\nTelefon İşlemleri");
            System.out.println("1 - Ürün Ekle");
            System.out.println("2 - Ürün Sil");
            System.out.println("3 - Ürün Filtrele");
            System.out.println("0 - AnaSayfa");

            System.out.print("Tercihiniz : ");
            secim = input.nextInt();

            while (secim > 3 || secim < 0) {
                System.out.print("Hatalı Tercih !!! Tekrar Giriniz : ");
                secim = input.nextInt();
            }

            switch (secim) {
                case 0:
                    selection = false;
                    store = true;
                    System.out.println();
                    break;
                case 1:
                    addPhone();
                    break;
                case 2:
                    removePhone();
                    break;
                case 3:
                    filterPhone();
                    break;
            }
        }
    }

    public void addPhone() {
        int id = phones.getLast().getId() + 1;

        System.out.print("Ürün Adı : ");
        String urunAdi = input.next();

        System.out.print("Fiyat    : ");
        String fiyat = input.next();

        System.out.print("Marka    : ");
        String marka = input.next();

        System.out.print("Depolama : ");
        String depolama = input.next();

        System.out.print("Ekran    : ");
        String ekran = input.next();

        System.out.print("Kamera   : ");
        String kamera = input.next();

        System.out.print("Pil      : ");
        String pil = input.next();

        System.out.print("RAM      : ");
        String ram = input.next();

        System.out.print("Renk     : ");
        String renk = input.next();


        phones.add(new CellPhone(id, urunAdi, fiyat, marka, depolama, ekran, kamera, pil, ram, renk));
        System.out.println("Ürününüz Başarıyla Eklendi");
    }

    public void removePhone() {
        System.out.print("Silmek İsteğiniz Ürünün ID sini giriniz : ");
        int id = input.nextInt();

        phones.remove(id - 1);
        System.out.println("Ürününüz Başarıyla Silindi");

    }

    public void filterPhone() {
        System.out.println("1 - ID ye Göre Filtrele");
        System.out.println("2 - Markaya ye Göre Filtrele");
        System.out.print("Tercihiniz : ");
        int tercih = input.nextInt();

        switch (tercih) {
            case 1:
                filterPhoneId();
                break;
            case 2:
                filterPhoneBrand();
                break;
            default:
                System.out.println("Hatalı Tercih!!!");
                break;
        }
    }

    public void filterPhoneId() {
        System.out.print("Lütfen Ürün ID Giriniz : ");
        int id = input.nextInt();
        int count = 0;

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID  | Ürün Adı                  | Fiyat      | Marka      | Depolama   | Ekran      | Kamera   | Pil   | Renk   |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        for (CellPhone c : phones) {
            if (c.getId() == id) {
                System.out.println(c);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Aradığnız ID ye ait ürün bulunamamıştır...");
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------");

    }

    public void filterPhoneBrand() {
        System.out.print("Lütfen Marka Adı Giriniz : ");
        String marka = input.next();
        int count = 0;

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID  | Ürün Adı                  | Fiyat      | Marka      | Depolama   | Ekran      | Kamera   | Pil   | Renk   |");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        for (CellPhone c : phones) {
            if (c.getBrandName().equalsIgnoreCase(marka)) {
                System.out.println(c);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Aradığnız markaya ait ürün bulunamamıştır...");
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------");

    }

}