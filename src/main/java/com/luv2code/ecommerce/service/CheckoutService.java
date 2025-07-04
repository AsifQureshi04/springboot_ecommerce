package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dto.Purchase;
import com.luv2code.ecommerce.dto.PurchaseResponse;
import org.springframework.web.bind.annotation.CrossOrigin;


public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
