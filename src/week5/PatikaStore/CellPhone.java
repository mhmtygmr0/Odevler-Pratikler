package week5.PatikaStore;

public class CellPhone extends Features {
    private String camera;
    private String battery;
    private String color;

    public CellPhone(int id, String productName, String price, String brandName, String memory, String screenSize, String ram, String camera, String battery, String color) {
        super(id, productName, price, brandName, memory, screenSize, ram);
        this.camera = camera;
        this.battery = battery;
        this.color = color;
    }

    public String toString() {
        return String.format("| %-3d | %-25s | %-10s | %-10s | %-10s | %-10s | %-8s | %-5s | %-7s |",
                getId(), getProductName(), getPrice(), getBrandName(), getMemory(), getScreenSize(), getCamera(), getBattery(), getColor());
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}