package com.example.springbackend.controller;

import com.example.springbackend.dto.CreatePurchaseDTO;
import com.example.springbackend.dto.GetPurchaseResponseDTO;
import com.example.springbackend.service.CheckoutInterface;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutInterface checkoutInterface;

    public CheckoutController(CheckoutInterface checkoutInterface) {
        this.checkoutInterface = checkoutInterface;
    }

    @PostMapping("/purchase")
    public GetPurchaseResponseDTO placeOrder(@RequestBody CreatePurchaseDTO createPurchaseDTO) {

        GetPurchaseResponseDTO getPurchaseResponseDTO = checkoutInterface.placeOrder(createPurchaseDTO);

        return getPurchaseResponseDTO;
    }

}









