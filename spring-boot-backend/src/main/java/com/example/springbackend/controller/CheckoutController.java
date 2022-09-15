package com.example.springbackend.controller;

import com.example.springbackend.dto.CreatePurchaseDTO;
import com.example.springbackend.dto.GetPurchaseResponseDTO;
import com.example.springbackend.exception.NotFoundException;
import com.example.springbackend.service.CheckoutInterface;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private final CheckoutInterface checkoutInterface;

    public CheckoutController(CheckoutInterface checkoutInterface) {
        this.checkoutInterface = checkoutInterface;
    }

    @PostMapping("/purchase")
    public GetPurchaseResponseDTO placeOrder(@RequestBody CreatePurchaseDTO createPurchaseDTO) {
        try {
            GetPurchaseResponseDTO getPurchaseResponseDTO = checkoutInterface.placeOrder(createPurchaseDTO);
            return getPurchaseResponseDTO;
        } catch (NotFoundException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Order Not Found", e);
        }
    }

}









