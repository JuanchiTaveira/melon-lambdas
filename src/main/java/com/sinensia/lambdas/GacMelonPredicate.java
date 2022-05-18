package com.sinensia.lambdas;

import org.jetbrains.annotations.NotNull;

public class GacMelonPredicate implements MelonPredicate {
    @Override
    public boolean test(Melon melon) {
        return "gac".equalsIgnoreCase(melon.getType());
    }
}
