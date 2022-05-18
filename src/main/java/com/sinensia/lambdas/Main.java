package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 5500, "Europe"),
                new Melon("Bailan", 6000, "China"),
                new Melon("Watermelon", 1200, "Europe"),
                new Melon("Gac", 3400, "US"),
                new Melon("Bailan", 1300, "China")
        );

        for (Melon melon : melons) {
            System.out.println(melon);
        }

        //Filter by type
        /*List<Melon> bailans = Filters.filterMelon(melons,"Bailan");

        System.out.println("\n---------------- Melons with type = 'Bailan' ---------------------\n");

        for (Melon bailan : bailans) {
            System.out.println("bailan = " + bailan);
        }*/

        //Filter by weight
        System.out.println("\n---------------- Melons with weight > 4000g ---------------------\n");
        HeavyMelonPredicate heavyMelonPredicate = new HeavyMelonPredicate();
        List<Melon> founds = Filters.filterMelons(melons,heavyMelonPredicate);
        for (Melon found : founds) {
            System.out.println("found = " + found);
        }

        //Gac melons
        System.out.println("\n---------------- Gac melons ---------------------\n");
        GacMelonPredicate gacMelonPredicate = new GacMelonPredicate();
        List<Melon> gacs = Filters.filterMelons(melons,gacMelonPredicate);
        for (Melon gac : gacs) {
            System.out.println("gac = " + gac);
        }

    }

}
