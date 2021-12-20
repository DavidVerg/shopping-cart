package com.david.shoppingcart.modules.carts.core.domain;

import com.google.common.base.Preconditions;

import java.math.BigDecimal;

public record ProductPrice(BigDecimal value) {

    public ProductPrice {
        Preconditions.checkNotNull(value, "Product value can not be null.");
        Preconditions.checkArgument(value.signum() > 0, "Product value can not bet negative.");
    }

}
