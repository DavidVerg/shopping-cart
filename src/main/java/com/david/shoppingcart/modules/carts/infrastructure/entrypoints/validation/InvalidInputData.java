package com.david.shoppingcart.modules.carts.infrastructure.entrypoints.validation;

import java.util.List;

public record InvalidInputData(List<InvalidFieldData> errors) {
}
