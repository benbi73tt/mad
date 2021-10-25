package ru.madbrains.javacourse.collection1;

import ru.madbrains.javacourse.lesson3.Employer;
import ru.madbrains.javacourse.lesson3.lesson_3.Developer;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class Example {
    private static List<Developer> developers = List.of(
            new Developer("Tom Richards", 33, "C++"),
            new Developer("Petr", 33, "java"),
            new Developer("Nik", 22, "javaScript"),
            new Developer("Anton", 25, "C++"),
            new Developer("Pavel", 31, "javaScript"),
            new Developer("Evgen", 28, "java"),
            new Developer("Alex", 19, "Go"),
            new Developer("Kate", 40, "java"),
            new Developer("Ylyana", 29, "Go"),
            new Developer("Mishel", 34, "javaScript"),
            new Developer("Ivan", 41, "Go"),
            new Developer("Maks", 22, "java")
    );

    public static void main(String[] args) {
        List<Integer> collect = developers.stream()
                .map(Employer::getAge) // = (x -> x.getAge())
                .collect(Collectors.toList());

        OptionalDouble average = collect.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);

        Comparator<Developer> comparator = (o1, o2) -> {
            if (o1.getAge() == o2.getAge()) return 0;
            return (o1.getAge() > o2.getAge() ? 1 : -1);
        };

        List<Developer> collect1 = developers.stream()
                .sorted(comparator).collect(Collectors.toList());

        System.out.println(collect1.toString());

        List<Developer> javaDevelopers = developers.stream()
                //.filter(x -> x.getLanguage().equals("java")) // Возможен nullPointerException
                .filter(x -> "java".equals(x.getLanguage()))
                .collect(Collectors.toList());
        System.out.println(javaDevelopers);

        Set<Developer> developerMinAge30Set = developers.stream()
                .filter(x -> x.getAge() > 30)
                .collect((Collectors.toSet()));

        System.out.println(developerMinAge30Set);

        Set<String> languageSet = developers.stream()
                .map(Developer::getLanguage)
                .collect(Collectors.toSet());

        System.out.println(languageSet);

        String developersName = developers.stream()
                .map(Developer::getName)
                .collect(Collectors.joining(", ")); // Как перечислить их?

        System.out.println(developersName);

        developers.stream()
                .map(Developer::getName)
                .forEach(System.out::println); //вывод всех по очереди

        System.out.println("\n");
        developers.stream()
                .sorted(comparator)
                .map(Developer::getName)
                .limit(3)
                .forEach(System.out::println);
    }

}
