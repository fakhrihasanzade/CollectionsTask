package service;

import entity.CarEntity;

import java.util.List;

public interface CarService {
    CarEntity getCarById(int id);
    List<CarEntity> getAllCar();
    void create(CarEntity car);
    void delete(int id);

}