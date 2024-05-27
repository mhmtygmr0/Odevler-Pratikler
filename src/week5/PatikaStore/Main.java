package week5.PatikaStore;

import java.util.*;

public class Main {

    static boolean store = true;

    public static void main(String[] args) {

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

        Store x = new Store();

        while (store){
            x.selectionScreen();
            switch (x.selection) {
                case 0:
                    System.out.println("Yine Bekleriz...");
                    store = false;
                    break;
                case 1:
                    x.notebook();
                    break;
                case 2:
                    x.phone();
                    break;
                case 3:
                    System.out.println("Markalarımız");
                    System.out.println("------------");
                    for(Brand b : treeSet){
                        System.out.println(b.getName());
                    }
                    break;
            }

        }




    }
}
