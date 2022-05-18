package com.sinensia.lambdas;

public class HeavyMelonPredicate implements MelonPredicate{
    @Override
    public boolean test(Melon melon) {
        return melon.getWeight() > 4000;
    }
}
