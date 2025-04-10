package com.codewithmosh.store;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paypal payment method");
        System.out.println("payment amount: " + amount);

    }
}
