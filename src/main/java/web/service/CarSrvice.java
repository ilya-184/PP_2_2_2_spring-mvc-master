package web.service;

import web.model.Car;

import java.util.List;

public interface CarSrvice {

    List<Car> prepareCarList (List<Car> carList, int listLen);

}
