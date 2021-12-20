package com.david.shoppingcart.modules.carts.core.domain;

import com.google.common.base.Preconditions;

import java.math.BigDecimal;
import java.util.Map;


public record ProductsList(Map<Product, ProductQuantity> products) {

    public ProductsList {

        Preconditions.checkNotNull(products);

        Preconditions.checkArgument(products.size() > 0, "Products list can not be empty.");
    }

    public BigDecimal getPrice(Map<Product, ProductQuantity> products) {
        //return products.keySet().stream()
        //        .map(Product::productPrice)
        //        .reduce(0, Price::plus);
        return null;
    }

}
