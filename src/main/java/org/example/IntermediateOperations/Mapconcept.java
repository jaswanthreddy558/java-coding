package org.example.IntermediateOperations;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapconcept {
    public static void main(String[] args) {
        Stream<String> apple = Stream.of("Apple", "Banana", "Orange", "Grapes");
        apple.map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
    }
}
