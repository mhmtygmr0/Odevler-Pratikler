package week5.PatikaStore;

public class Features {
    private int id;
    private String productName;
    private String price;
    private String brandName;
    private String memory;
    private String screenSize;
    private String ram;

    public Features(int id, String productName, String price, String brandName, String memory, String screenSize, String ram) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.brandName = brandName;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}