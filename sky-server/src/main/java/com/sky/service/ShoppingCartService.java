package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShoppingCartService {
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
    List<ShoppingCart> showShoppingCart();

    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);

    void cleanShoppingCart();
}
