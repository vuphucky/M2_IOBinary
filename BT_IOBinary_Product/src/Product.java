import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private double price;
    private String origin;
    private String describe;

    public Product(String id, String name, double price, String origin, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.origin = origin;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
