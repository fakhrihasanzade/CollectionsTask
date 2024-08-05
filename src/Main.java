import serviceimpl.CarServiceImpl;

public class Main {
    public static void main(String[] args) {

        CarServiceImpl car=new CarServiceImpl();

      //  System.out.println(car.getAllCar());
        System.out.println(car.getCarById(1));
    }

}