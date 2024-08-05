package entity;

public class SClass {

    String brand;
    String model;
    String typeOfBan;

    public SClass(String brand, String model, String typeOfBan) {
        this.brand = brand;
        this.model = model;
        this.typeOfBan = typeOfBan;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeOfBan() {
        return typeOfBan;
    }

    public void setTypeOfBan(String typeOfBan) {
        this.typeOfBan = typeOfBan;
    }

    @Override
    public String toString() {
        return "SClass{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", typeOfBan='" + typeOfBan + '\'' +
                '}';
    }
}
