package com.david.shoppingcart.modules.carts.core.services;

import com.david.shoppingcart.modules.carts.core.domain.ClientId;
import com.david.shoppingcart.modules.carts.core.domain.ProductsList;
import com.david.shoppingcart.modules.carts.core.domain.ShoppingCart;
import com.david.shoppingcart.modules.carts.core.domain.ShoppingCartCommandError;
import com.google.common.base.Preconditions;
import io.vavr.control.Either;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class AddProductService {

    public Either<ShoppingCartCommandError, ShoppingCart> execute(ClientId clientId,
                                                                  LocalDateTime creationDate,
                                                                  LocalDateTime modificationDate,
                                                                  ProductsList products) {

        Preconditions.checkNotNull(clientId, "Client id can not be null.");
        Preconditions.checkNotNull(creationDate, "Creation date can not be null.");
        Preconditions.checkNotNull(modificationDate, "Modification date can not be null.");
        Preconditions.checkNotNull(products, "Products list can not be null.");

        return Either.right(null);

    }

}
