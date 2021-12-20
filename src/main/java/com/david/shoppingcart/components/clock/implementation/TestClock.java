package com.david.shoppingcart.components.clock.implementation;

import com.david.shoppingcart.components.clock.Clock;
import org.springframework.stereotype.Component;

import java.time.Instant;

//@Component
public class TestClock implements Clock {
    private final Instant fixedTime;

    public TestClock(Instant fixed) {
        this.fixedTime = fixed;
    }

    @Override
    public Instant now() {
        return fixedTime;
    }
}