package entity;

public class CarEntity extends SClass {

    private int id;
    private String color;
    private int price;

    public CarEntity(String brand, String model, String typeOfBan, String color, int price, int id) {
        super(brand, model, typeOfBan);
        this.id = id;
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "CarEntity{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", typeOfBan='" + typeOfBan + '\'' +
                "} " + super.toString();
    }
}
