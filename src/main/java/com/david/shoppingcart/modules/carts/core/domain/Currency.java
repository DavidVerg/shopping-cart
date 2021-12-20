package com.david.shoppingcart.modules.carts.core.domain;

import java.math.BigDecimal;

public enum Currency {

    EUR(BigDecimal.valueOf(1.12)),
    COP(BigDecimal.valueOf(4000)),
    USD(BigDecimal.valueOf(1));

    private final BigDecimal usdValue;

    Currency(BigDecimal usdValue) {
        this.usdValue = usdValue;
    }

    public BigDecimal getUsdValue() {
        return usdValue;
    }
}
