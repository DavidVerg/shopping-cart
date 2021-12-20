package com.david.shoppingcart.modules.carts.core.domain;

import com.google.common.base.Preconditions;
import io.vavr.control.Either;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

public record ShoppingCart(ClientId clientId,
                           LocalDateTime creationDate, LocalDateTime modificationDate,
                           ProductsList products) {

    public ShoppingCart {

        Preconditions.checkNotNull(clientId, "Client id can not be null.");
        Preconditions.checkNotNull(creationDate, "Creation date can not be null.");
        Preconditions.checkNotNull(modificationDate, "Modification date can not be null.");
        Preconditions.checkNotNull(products, "Product list can not be null.");

    }

    public Either<ShoppingCartCommandError, ShoppingCart> handleCommand(ShoppingCartCommand command) {
        if (command instanceof ShoppingCartCommand.AddProduct cmd) {
            return addProduct(cmd);
        }

        if (command instanceof ShoppingCartCommand.RemoveProduct cmd) {
            return removeProduct(cmd);
        }

        return null;
    }

    private Either<ShoppingCartCommandError, ShoppingCart> addProduct(ShoppingCartCommand.AddProduct cmd) {

        UUID clientId = cmd.clientId();
        LocalDateTime creationTime = cmd.creationDate();
        LocalDateTime modificationTime = cmd.modificationDate();
        Map<Product, Integer> products = cmd.products();

        boolean a = true;
        boolean b = true;

        if (a) {
            return Either.left(ShoppingCartCommandError.EXPENSIVE_PRODUCT_ALREADY_IS_ONE);
        }

        if (b) {
            return Either.left(ShoppingCartCommandError.NORMAL_PRODUCT_ALREADY_IS_TEN);
        }

        return Either.right(this);
    }

    private Either<ShoppingCartCommandError, ShoppingCart> removeProduct(ShoppingCartCommand.RemoveProduct cmd) {

        return null;
    }
}
