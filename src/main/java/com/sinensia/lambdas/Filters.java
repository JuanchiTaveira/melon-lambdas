package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.List;

public abstract class Filters {

    public Filters(){
        throw new AssertionError("Utility class can not be instantiated");
    }

    public static List<Melon> filterByType(List<Melon> melons, String type) {
        List<Melon> filtered = new ArrayList<Melon>();
        for (Melon melon : melons) {
            if (melon.getType().equalsIgnoreCase(type)) {
                filtered.add(melon);
            }
        }
        return filtered;
    }
}
