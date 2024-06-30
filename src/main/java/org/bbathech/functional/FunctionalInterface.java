package org.bbathech.functional;

import org.bbathech.data.CourseResults;
import org.bbathech.model.Course;
import org.bbathech.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

    public static void execute() {

        // Object Oriented >>> Organized around objects (Mainly data, with methods)
        // Functional Oriented >> Organized around functions.

        // What is a functional interface?
        // A Functional Interface is an interface that has only one abstract method. They can have only one functionality to exhibit.
        // Example: Addition Interface with anonymous inner class implementation, then with lambda

        final Add classAdder = new Add();
        System.out.println(classAdder.sum(5, 6));

        final Addition innerAdder = new Addition() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        System.out.println(innerAdder.sum(8, 8));

        final Addition lambdaAddition = (x, y) -> { return x + y; };

        System.out.println(lambdaAddition.sum(7, 7));

        final Addition methodReferenceAddition = Integer::sum;

        System.out.println(methodReferenceAddition.sum(9 ,9));

        final GenericAdder<Double> genericAdder = Double::sum;

        System.out.println(genericAdder.sum(5.6, 7.8));


        // java.util.Function
        // Functions: Represents a function that accepts one argument and produces a result [R apply(T t);] (Mapping)

        List<Student> students = Arrays.asList(new Student(1, 20, "Soso"), new Student(2, 45, "Lolo"));

        Function<Student, Integer> idExtractor = Student::getId;
        for (Student student: students) {
            System.out.println(idExtractor.apply(student));
        }

        // Predicate: Represents a predicate (boolean-valued function) of one argument [boolean test(T t);] (filtering)

        Predicate<Student> isOld = student -> student.getAge() > 30;

        for (Student student: students) {
            if (isOld.test(student)) {
                System.out.println(student.getName());
            }
        }

        // Supplier: Represents a supplier of results. [T get();]

        Supplier<Student> getAnyStudent = () -> new Student(6, 77, "KOKO");

        System.out.println(getAnyStudent.get());

        // Consumer: Represents an operation that accepts a single input argument and returns no result [void accept(T t);]

        Consumer<Object> printIt = System.out::println;

        printIt.accept("lololololo");


        Supplier<Map<Course, Map<Integer, Integer>>> getDBData = () -> CourseResults.results;

        System.out.println(getDBData.get());

        printIt.accept(getDBData.get());


        // Example1: List<String> cities... Write a consumer to print them.
        List<String> cities = Arrays.asList("Amman", "Zarka", "Irbid", "Ajlon", "Amman");

//        for (String city: cities) {
//            System.out.println(city);
//        }

        cities.stream()
                .distinct()
                .filter(city -> city.startsWith("A")) // predicate
                .map(city -> city + "2024")
                .forEach(System.out::println); // consumer

        System.out.println(cities);

        for (String city: cities) {
            if (city.startsWith("A")) {
                System.out.println(city + "2024");
            }
        }

        System.out.println(cities);

        // https://medium.com/javarevisited/java-8s-consumer-predicate-supplier-and-function-bbc609a29ff9


    }


}

@java.lang.FunctionalInterface
interface Addition {
    int sum(int a, int b);
}

class Add implements Addition {
    @Override
    public int sum(int a, int b) {
        return a +b;
    }
}

@java.lang.FunctionalInterface
interface GenericAdder<T> {
    T sum(T a, T b);
}

