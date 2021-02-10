package com.kodilla.exception.homework;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {


    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();

        Order order1 = new Order("1");
        Order order2 = new Order("2");
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);

        //when
        Order o = warehouse.getOrder("3");
        // then
        assertEquals(warehouse, o);

    }

}