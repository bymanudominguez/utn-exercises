package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static List<String> toUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}

