package com.example.springbackend.service;

import com.example.springbackend.dto.Purchase;
import com.example.springbackend.dto.PurchaseResponse;

public interface CheckoutInterface {

    PurchaseResponse placeOrder(Purchase purchase);
}
