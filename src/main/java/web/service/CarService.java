package web.service;

import org.springframework.stereotype.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> getCarList(int count) {
        if (count <= 0) {
            return null;
        } else if (count >= carList().size()) {
            return carList();
        } else {
            List<Car> countList = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                countList.add(carList().get(i));
            }
            return countList;
        }
    }
    private List<Car> carList() {
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Ford", "Mustang", 2019);
        Car car3 = new Car("Chevrolet", "Malibu", 2022);
        Car car4 = new Car("BMW", "X5", 2021);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);

        return carList;
    }
}





