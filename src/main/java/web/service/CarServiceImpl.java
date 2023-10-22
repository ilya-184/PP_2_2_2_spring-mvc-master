package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarSrvice{

//    private List<Car> carList;
//    int listLen
    @Override
    public List<Car> prepareCarList(List<Car> carList, int listLen) {
        if (listLen > 5 || listLen == 0) {
            return carList;
        }
        return carList.stream().limit(listLen).collect(Collectors.toList());
    }
}
