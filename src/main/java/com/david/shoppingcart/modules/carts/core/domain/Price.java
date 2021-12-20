package com.david.shoppingcart.modules.carts.core.domain;

import java.math.BigDecimal;

public record Price(BigDecimal value, Currency currency) {

    public static final Price ZERO = new Price(BigDecimal.ZERO, Currency.USD);

    public static Price of(Double unsafeValue) {
        return new Price(BigDecimal.valueOf(unsafeValue), Currency.USD);
    }

    public static Price of(long unsafeValue) {
        return new Price(BigDecimal.valueOf(unsafeValue), Currency.USD);
    }

    public BigDecimal plus(Price price, Currency currency) {
        return
                value.add(price.value).multiply(currency.getUsdValue())
        ;
    }

}
