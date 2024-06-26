package week5.PatikaStore;

public class Brand implements Comparable<Brand> {
    private int id;
    private String name;


    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Brand o) {
        return this.name.compareTo(o.getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}