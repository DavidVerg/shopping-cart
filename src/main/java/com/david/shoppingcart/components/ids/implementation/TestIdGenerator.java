package com.david.shoppingcart.components.ids.implementation;

import com.david.shoppingcart.components.ids.IdGenerator;

import java.util.UUID;

// @Component
public class TestIdGenerator implements IdGenerator {
    private final UUID fixedId;

    public TestIdGenerator(UUID fixedId) {
        this.fixedId = fixedId;
    }

    @Override
    public UUID generate() {
        return fixedId;
    }
}
