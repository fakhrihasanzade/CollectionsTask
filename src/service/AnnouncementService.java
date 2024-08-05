package service;

import entity.CarEntity;
import entity.ElanEntity;

import java.util.List;

public interface AnnouncementService {
    ElanEntity getAnonsById(int id);
    List<ElanEntity> getAllAnons();
    void create(ElanEntity anons);
    void delete(int id);
    void getNameById(int id);
}
