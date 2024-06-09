package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class PalabrasLargas {
    public static String concatPalabrasLargas(List<String> strings, int n) {
        List<String> palabrasLargas = strings.stream()
                .filter(string -> string.length() > n)
                .collect(Collectors.toList());

        return String.join(", ", palabrasLargas);
    }
}
