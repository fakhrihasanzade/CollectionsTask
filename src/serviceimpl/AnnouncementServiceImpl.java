package serviceimpl;

import entity.CarEntity;
import entity.ElanEntity;
import service.AnnouncementService;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementServiceImpl implements AnnouncementService {


    static List<ElanEntity> anonsArrayList = new ArrayList<>();

    static {
        anonsArrayList.add(new ElanEntity("Kia", "Sorento", "ofRoad", "Yenidir", "Vurugu var", 1));
        anonsArrayList.add(new ElanEntity("Hyundai", "Sorento", "ofRoad", "Yenidir", "Vurugu yoxdur", 2));
        anonsArrayList.add(new ElanEntity("Toyota", "Rav4", "ofRoad", "Yenidir", "Vurugu var", 3));

    }


    @Override
    public ElanEntity getAnonsById(int id) {
        return anonsArrayList.get(id - 1);
    }

    @Override
    public List<ElanEntity> getAllAnons() {
        return anonsArrayList;
    }

    @Override
    public void create(ElanEntity anons) {
        anonsArrayList.add(anons);
    }

    @Override
    public void delete(int id) {
        anonsArrayList.remove(id);
    }

    @Override
    public void getNameById(int id) {
        System.out.println(anonsArrayList.get(id-1).getBrand());
    }


}
