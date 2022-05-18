package com.sinensia.lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 5500, "Europe"),
                new Melon("Bailan", 6000, "China"),
                new Melon("Watermelon", 1200, "Europe"),
                new Melon("Gac", 3400, "US"),
                new Melon("Bailan", 1300, "China")
        );

        //Filter by weight
        System.out.println("\n---------------- Melons with weight > 4000g ---------------------\n");
        List<Melon> founds = Filters.filter(melons, (Melon melon) -> melon.getWeight() > 4000);
        for (Melon found : founds) {
            System.out.println("found = " + found);
        }

        //Filter gac melons
        System.out.println("\n---------------- Gac melons ---------------------\n");
        List<Melon> gacs = Filters.filter(melons,(Melon melon) -> "gac".equalsIgnoreCase(melon.getType()));
        for (Melon gac : gacs) {
            System.out.println("gac = " + gac);
        }

        //Apply streams
        System.out.println("\n---------------- Print melons with stream().forEach() ---------------------\n");
        melons.stream()
                .forEach(melon -> System.out.println("melon = " + melon));

        System.out.println("\n---------------- Filter gac melons with stream().filter() ---------------------\n");
        melons.stream()
                .filter(melon -> "gac".equalsIgnoreCase(melon.getType()))
                .forEach(melon -> System.out.println("melon = " + melon));

        System.out.println("\n---------------- First element of the stream ---------------------\n");
        melons.stream()
                .findFirst()
                .ifPresent(first -> System.out.println("first = " + first));

        System.out.println("\n---------------- Map average weight ---------------------\n");
        melons.stream()
                .mapToInt(melon -> melon.getWeight())
                .average()
                /*.ifPresent(average -> System.out.println("Average weight = " + average))*/
                .ifPresentOrElse(average -> System.out.println("Average weight = " + average) , () -> System.out.println("Lista vacía"));
    }

}
