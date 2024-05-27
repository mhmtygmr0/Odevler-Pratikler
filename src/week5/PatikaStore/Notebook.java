package week5.PatikaStore;


public class Notebook extends Features {

    public Notebook(int id, String productName, String price, String brandName, String memory, String screenSize, String ram) {
        super(id, productName, price, brandName, memory, screenSize, ram);
    }

    public String toString() {
        return String.format("| %-3d | %-30s | %-10s | %-10s | %-10s | %-10s | %-5s |",
                getId(), getProductName(), getPrice(), getBrandName(), getMemory(), getScreenSize(), getRam());
    }

}
