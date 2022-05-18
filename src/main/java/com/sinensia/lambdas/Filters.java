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

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        if(list==null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        List<T> result = new ArrayList<>();
        for(T t: list) {
            if(t!=null && predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

}
