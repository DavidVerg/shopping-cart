package com.david.shoppingcart.modules.carts.core.domain;

import com.google.common.base.Preconditions;

public record ProductQuantity(Integer value) {

    public ProductQuantity {
        Preconditions.checkNotNull(value, "Product quantity can not be null.");
        Preconditions.checkArgument(value > 0, "Product quantity can not be negative.");
    }

}
