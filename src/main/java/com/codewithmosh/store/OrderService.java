package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    PaymentService paymentService;
    OrderService() {}
    @Autowired
    OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void makeOrder() {
        paymentService.makePayment(10.0);
    }
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
