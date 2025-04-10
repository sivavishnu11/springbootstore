package com.codewithmosh.store;

public class StripePaymentService implements PaymentService {
    @Override
    public void makePayment(double amount) {
        System.out.println("Stripe payment method");
        System.out.println("payment amount: " + amount);
    }
}
