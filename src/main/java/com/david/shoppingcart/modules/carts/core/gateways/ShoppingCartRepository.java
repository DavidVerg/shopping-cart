package com.david.shoppingcart.modules.carts.core.gateways;

import com.david.shoppingcart.modules.carts.core.domain.ClientId;
import com.david.shoppingcart.modules.carts.core.domain.ShoppingCart;

import java.time.LocalDate;
import java.util.Optional;

public interface ShoppingCartRepository {

    void save(ShoppingCart shoppingCart);

    Optional<ShoppingCart> findOne(ClientId clientId);

}
