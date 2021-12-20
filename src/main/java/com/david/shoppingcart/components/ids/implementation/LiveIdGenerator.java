package com.david.shoppingcart.components.ids.implementation;

import com.david.shoppingcart.components.ids.IdGenerator;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class LiveIdGenerator implements IdGenerator {

    @Override
    public UUID generate() {
        return UUID.randomUUID();
    }
}