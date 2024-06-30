package org.bbathech;

import org.bbathech.data.CourseResults;
import org.bbathech.functional.FunctionalInterface;
import org.bbathech.model.Student;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

//        Collections.examples();

//        collectionExamples();


        FunctionalInterface.execute();

    }

    private static void collectionExamples() {
        System.out.println(squareSum(Arrays.asList(6, 7, 8, 20, 100)));
        System.out.println(removeDuplicates(Arrays.asList("6", "6", "7")));

        final Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, 20, "A"));
        studentMap.put(2, new Student(2, 30, "B"));
        studentMap.put(3, new Student(3, 40, "C"));
        studentMap.put(4, new Student(1, 50, "D"));

        System.out.println(addBonusMarks(studentMap, new HashSet<>(Arrays.asList(1, 2, 5))));

        printStudentTotals(Arrays.asList(new Student(19, 20, "Ahmad"), new Student(17, 20, "Abd")));
    }

    // Example: Write a method that receives a list of Integers and returns the sum of the square of all integers above 10
    private static Integer squareSum(List<Integer> integerList) {
//        Integer sum = 0;
//        for (Integer element: integerList) {
//            if (element > 10) {
//                sum += element * element;
//            }
//        }
//        return sum;

        return integerList.stream().filter(it -> it > 10).mapToInt(it -> it * it).sum();
    }
    // Example: Write a method that uses a set to remove duplicate elements of a list and returns the duplicate-free set.
    private static Set<String> removeDuplicates(List<String> input) {
        return new HashSet<>(input);
    }
    // Example: Write a method that receives a Map of StudentId to Student, and a Set of StudentIds where they should get a bonus of 5 marks.
    // The method returns the map modified
    private static Map<Integer, Student> addBonusMarks(Map<Integer, Student> studentMap, Set<Integer> idsToGetBonus) {
        for (Integer idToGetBonus: idsToGetBonus) {
            if (studentMap.containsKey(idToGetBonus)) {
                Student oldStudent = studentMap.get(idToGetBonus);
                oldStudent.setAge(oldStudent.getAge() + 5);
//                studentMap.put(idToGetBonus, oldStudent);
            }
        }
        return studentMap;
    }
    // Example: Write a method that receives a list of Students and CourseResults and prints the Name and total of each Student.
    private static void printStudentTotals(List<Student> students) {
        for (Student student: students) {
            AtomicInteger sum = new AtomicInteger();
            CourseResults.results.forEach((course, studentIdToScoreMap) -> {
                Integer score = studentIdToScoreMap.get(student.getId());
                if (score != null) {
                    sum.set(sum.get() + score);
                }
            });
            System.out.println("Student: " + student.getName() + " scored: " + sum);
        }
    }
}
