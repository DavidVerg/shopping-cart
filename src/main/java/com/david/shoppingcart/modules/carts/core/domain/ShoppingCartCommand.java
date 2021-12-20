package com.david.shoppingcart.modules.carts.core.domain;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

public interface ShoppingCartCommand {

    UUID clientId();

    record AddProduct(UUID clientId,
                      LocalDateTime creationDate,
                      LocalDateTime modificationDate,
                      Map<Product, Integer> products) implements ShoppingCartCommand {};

    record RemoveProduct(UUID clientId,
                         LocalDateTime modificationDate,
                         Map<Product, Integer> products) implements ShoppingCartCommand {};

}
