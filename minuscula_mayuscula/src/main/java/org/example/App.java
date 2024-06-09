package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("manuel");
        lista.add("lucia");

        List<String> listaMayusculas = transformarLista(lista, String::toUpperCase);

        System.out.println(listaMayusculas);
    }

    private static List<String> transformarLista(List<String> lista, Function<String, String> funcion) {
        List<String> listaResultado = new ArrayList<>();
        for (String string : lista) {
            listaResultado.add(funcion.apply(string));
        }
        return listaResultado;
    }
}
