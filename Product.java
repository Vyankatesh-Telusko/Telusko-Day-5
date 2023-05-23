public class Product {
    private String name;
    private String type;
    private String place;
    private int warranty;

    public Product() {
    }

    public Product(String var1, String var2, String var3, int var4) {
        this.name = var1;
        this.type = var2;
        this.place = var3;
        this.warranty = var4;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String var1) {
        this.type = var1;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String var1) {
        this.place = var1;
    }

    public int getWarranty() {
        return this.warranty;
    }

    public void setWarranty(int var1) {
        this.warranty = var1;
    }

    public String toString() {
        return "src.main.java.Product{name='" + this.name + "', type='" + this.type + "', place='" + this.place + "', warranty=" + this.warranty + "}";
    }
}
