package org.example;

import java.util.Arrays;
import java.util.List;

import static org.example.PalabrasLargas.concatPalabrasLargas;
import static org.example.ToUpperCase.toUpperCase;

public class App {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hola", "manuel", "adios");
        List<String> uppercaseStrings = toUpperCase(strings);

        System.out.println(uppercaseStrings);

        List<String> strings2 = Arrays.asList("hola", "mundo", "adiós", "ornitorrinco", "electroencefalografista");
        int n = 5;

        String concatenacion = concatPalabrasLargas(strings2, n);

        System.out.println(concatenacion);
    }
}
