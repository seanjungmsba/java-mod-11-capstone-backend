package com.example.springbackend.controller;

import com.example.springbackend.dto.Purchase;
import com.example.springbackend.dto.PurchaseResponse;
import com.example.springbackend.service.CheckoutInterface;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutInterface checkoutInterface;

    public CheckoutController(CheckoutInterface checkoutInterface) {
        this.checkoutInterface = checkoutInterface;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutInterface.placeOrder(purchase);

        return purchaseResponse;
    }

}









