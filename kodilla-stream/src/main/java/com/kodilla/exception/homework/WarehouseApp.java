package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Order order2 = new Order("2");
        Order order1 = new Order("1");
        Order order3 = new Order("3");
        Order order4 = new Order("4");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);
        warehouse.addOrder(order4);

        warehouse.printOrders();

        try {
            Order o = warehouse.getOrder("1");
            System.out.println(o.getNumber());
            Order O1 = warehouse.getOrder("8");
            System.out.println(O1.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("order not found");
        }


    }
}
