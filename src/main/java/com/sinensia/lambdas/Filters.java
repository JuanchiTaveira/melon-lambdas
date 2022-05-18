package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.List;

public abstract class Filters {

    public Filters(){
        throw new AssertionError("Utility class can not be instantiated");
    }

    public static boolean validMelon(Melon melon){
        return melon != null;
    }

    public static List<Melon> filterMelons(List<Melon> melons, MelonPredicate predicate) {
        List<Melon> filtered = new ArrayList<Melon>();
        for (Melon melon : melons) {
            if(validMelon(melon) && predicate.test(melon))
                filtered.add(melon);
        }
        return filtered;
    }

    /*public static List<Melon> filterByType(List<Melon> melons, String type) {
        List<Melon> filtered = new ArrayList<Melon>();
        for (Melon melon : melons) {
            if (melon.getType().equalsIgnoreCase(type)) {
                filtered.add(melon);
            }
        }
        return filtered;
    }

    public static List<Melon> filterByWeight(List<Melon> melons, int weight) {
        List<Melon> filtered = new ArrayList<Melon>();
        for (Melon melon : melons) {
            if (validMelon(melon) && melon.getWeight() == weight) {
                filtered.add(melon);
            }
        }
        return filtered;
    }*/
}
