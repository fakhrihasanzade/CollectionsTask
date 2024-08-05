package entity;

public class ElanEntity extends SClass{

    private int id;
    private String isNew;
    private String isCrush;

    public ElanEntity(String brand, String model, String typeOfBan, String isNew, String isCrush, int id) {
        super(brand, model, typeOfBan);
        this.id=id;
        this.isNew = isNew;
        this.isCrush = isCrush;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getIsCrush() {
        return isCrush;
    }

    public void setIsCrush(String isCrush) {
        this.isCrush = isCrush;
    }

    @Override
    public String toString() {
        return "ElanEntity{" +
                "id=" + id +
                ", isNew='" + isNew + '\'' +
                ", isCrush='" + isCrush + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", typeOfBan='" + typeOfBan + '\'' +
                "} " + super.toString();
    }
}
