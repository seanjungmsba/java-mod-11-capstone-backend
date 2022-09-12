package com.example.springbackend.service;

import com.example.springbackend.dto.CreatePurchaseDTO;
import com.example.springbackend.dto.GetPurchaseResponseDTO;

public interface CheckoutInterface {

    GetPurchaseResponseDTO placeOrder(CreatePurchaseDTO createPurchaseDTO);
}
