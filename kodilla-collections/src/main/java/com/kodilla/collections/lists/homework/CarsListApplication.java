package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;


import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Audi> cars = new ArrayList<>();
        cars.add(new Audi(100));
        cars.add(new Audi(110));
        cars.add(new Audi(120));

        cars.remove(0);
        cars.remove(new Audi(110));

        System.out.println(cars.size());

        CarUtils carUtils = new CarUtils();

        for (Audi audi : cars) {
            carUtils.describeCar(audi);
        }

    }
}
