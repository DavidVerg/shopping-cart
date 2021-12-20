package com.david.shoppingcart.components.clock.implementation;

import com.david.shoppingcart.components.clock.Clock;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class LiveClock implements Clock {

    @Override
    public Instant now() {
        return Instant.now();
    }
}