package serviceimpl;

import entity.CarEntity;
import service.CarService;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    static List<CarEntity> carArrayList = new ArrayList<>();

    static {
        carArrayList.add(new CarEntity("BMW", "F10", "Sedan", "Red", 10000, 1));
        carArrayList.add(new CarEntity("Mercedes", "F10", "Sedan", "green", 10000, 2));
        carArrayList.add(new CarEntity("Audi", "F10", "Sedan", "Red", 10000, 3));
    }

    @Override
    public CarEntity getCarById(int id) {
        return carArrayList.get(id - 1);
    }

    @Override
    public List<CarEntity> getAllCar() {
        return carArrayList;
    }

    @Override
    public void create(CarEntity car) {
        carArrayList.add(car);
    }

    @Override
    public void delete(int id) {
        carArrayList.remove(id);
    }

}
