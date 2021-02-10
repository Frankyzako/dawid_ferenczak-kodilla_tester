package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;


public class Warehouse {

    private List<Order> orders = new ArrayList();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order order =
                orders
                        .stream()
                        .filter(u -> u.getNumber().equals(number))
                        .findFirst()
                        .orElseThrow(OrderDoesntExistException::new);
        return order;
    }

    public void printOrders() {
        orders
                .stream()
                .map(u -> u.getNumber())
                .forEach(s -> System.out.println(s));
    }
}
