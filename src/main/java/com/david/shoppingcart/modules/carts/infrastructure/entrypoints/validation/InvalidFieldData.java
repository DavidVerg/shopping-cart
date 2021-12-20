package com.david.shoppingcart.modules.carts.infrastructure.entrypoints.validation;

public record InvalidFieldData(String fieldName,
                               String errorMessage) {
}
