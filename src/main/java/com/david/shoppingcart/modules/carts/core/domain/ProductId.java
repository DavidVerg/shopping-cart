package com.david.shoppingcart.modules.carts.core.domain;

import com.google.common.base.Preconditions;

import java.util.UUID;

public record ProductId(UUID value) {

    public ProductId {
        Preconditions.checkNotNull(value);
    }

}
