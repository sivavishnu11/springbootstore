package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        OrderService orderService = (OrderService) context.getBean(OrderService.class);
        //OrderService orderService = new OrderService();
        //orderService.setPaymentService(new PaypalPaymentService());
        orderService.makeOrder();
        System.out.println("Order made");
    }

}
