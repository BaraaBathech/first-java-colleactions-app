package org.bbathech.collections;

import org.bbathech.model.Student;

import java.util.*;
import java.util.stream.Stream;

public class Collections {

    public static void examples() {

        listExamples();
        setExamples();
        mapExamples();



        //TODO: Stacks
//        stackExamples();

        //TODO: Queues
//        queueExamples();



        // Learning Source: Lists, Sets and Maps in java >> https://www.geeksforgeeks.org/difference-between-list-set-and-map-in-java/
        // Learning Source: Stacks and Queues in java >> https://www.scaler.com/topics/java/stack-and-queue-in-java/

    }

    private static void listExamples() {
        // Lists
        // Ordered by the order of insertion
        // Duplicates allowed
        // Nulls allowed
        // Get by index available
        // Looping returns elements by the order of insertion
        // TODO: Real life examples
        // TODO: Homework
        listOfStrings();
        listOfPersons();
    }

    private static void setExamples() {
        // Sets
        // Unordered
        // No duplicates
        // Only one "null" is allowed
        // Get by index is unavailable
        // Looping returns elements randomly
        // TODO: Real life examples
        // TODO: Homework
        setOfStrings();
        setOfPersons();
    }

    private static void mapExamples() {
        // Maps
        // keys and values
        // Unordered
        // Adding a duplicate key will overwrite the previous value
        // One null key is allowed
        // no limit on allowed null values
        // get by key is available
        // get by index is unavailable
        // TODO: Real life examples
        // TODO: Homework
        mapOfStrings();
    }

    private static void stackExamples() {
        // LIFO: Last in first out >> like a stack of plates
        // Push / Add methods add elements at the top of the stack
        // Pop / Remove methods get and remove elements at the top of the stack
        // Peek method gets an element from the top of the stack without removing it
        // Stack inherits List, so we can loop over it like a list.
        // Get by index is available
        // Duplication is allowed
        // null is allowed
        System.out.println("<<<<<<<PRINTING STACKS>>>>>>>>>");
        final Stack<String> stringStack = new Stack<>();

        System.out.println(stringStack.isEmpty());

        stringStack.add("a");
        stringStack.add("b");
        stringStack.add("c");
        stringStack.add("d");
        stringStack.push("e");
        stringStack.push(null);
        stringStack.push("g");
        stringStack.push("h");
        stringStack.push("b");
        stringStack.push(null);

        System.out.println(stringStack.peek());
        System.out.println(stringStack.indexOf("a"));
        System.out.println(stringStack.indexOf("h"));
        System.out.println(stringStack.size());

        final String firstRemoved = stringStack.pop();
        final String secondRemoved = stringStack.pop();

        System.out.println(firstRemoved);
        System.out.println(secondRemoved);

        System.out.println(stringStack.size());

        System.out.println(stringStack.isEmpty());

        // Stack is in the end, a List
        for(String elem: stringStack) {
            System.out.println(elem);
        }

    }

    private static void queueExamples() {
        // FIFO: First in first out, like a line of people waiting for a service.
        // Offer / Add methods add elements to the tail of the queue.
        // Remove / Poll methods remove elements from the head of the queue.
        // Peek method gets an element from the top of the stack without removing it
        // Queue inherits List, so we can loop over it like a list.
        // Get by index is unavailable
        // Duplication is allowed
        // null is allowed
        final Queue<String> stringQueue = new PriorityQueue<>();

        System.out.println("<<<<<<<PRINTING QUEUES>>>>>>>>>");

        stringQueue.add("a");
        stringQueue.add("b");
        stringQueue.add("c");
        stringQueue.add("d");
        stringQueue.add("e");
        stringQueue.add("f");
//        stringQueue.add(null);
//        stringQueue.add(null);


        System.out.println(stringQueue.size());
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.size());

        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.poll());
//        System.out.println(stringQueue.remove());

        for (String elem: stringQueue) {
            System.out.print(elem);
        }
    }

    public static void listOfPersons() {

        System.out.println("<<<<<<<<<<PRINTING LIST OF PERSONS<<<<<<<<<<");
        final List<Student> students = new ArrayList<>();

        students.add(new Student(1, 50, "Abood"));
        students.add(new Student(17, 15, "Baraa"));
        students.add(new Student(18, 11, "Lolo"));
        students.add(new Student(70, 35, "Soso"));
        students.add(new Student(100, 70, "Fofo"));

        for (Student student : students) {
            System.out.println(student);
        }

        Student elli3omro70 = null;
        for (Student p: students) {
            if (p.getId() == 70) {
                elli3omro70 = p;
            }
        }
        System.out.println(elli3omro70);
        System.out.println(students.get(3));
    }

    public static void listOfStrings() {

        System.out.println("<<<<<<<<<<PRINTING LIST OF STRINGS<<<<<<<<<<");
        final List<String> stringList = new ArrayList<>(); // LinkedList<>()

        stringList.add("1");
        stringList.add("3");
        stringList.add("3");
        stringList.add("3");
        stringList.add("3");
        stringList.add("3");
        stringList.add("5");

        //stringList = new ArrayList<>();

        System.out.println(stringList);
        for (String listElem: stringList) { // Enhanced for loop
            System.out.print(listElem);
        }

        stringList.add("7");

        System.out.println(stringList);

        stringList.add(null);

        System.out.println(stringList);

        stringList.add(null);

        System.out.println(stringList);

        System.out.println(stringList.get(1));

//        for(int i=0; i < stringList.size(); i++) {
//            System.out.print(stringList.get(i));
//        }

        for (String elem: stringList) {
            System.out.print(elem);
        }

//        stringList.forEach(elem -> {
//            System.out.print(elem);
//        });

        System.out.println(stringList.size());
        System.out.println(stringList.isEmpty());

        stringList.addAll(Arrays.asList("w", "x", "z"));


        System.out.println(stringList);
        System.out.println(stringList.contains("s"));
        System.out.println(stringList.contains("z"));
        System.out.println(stringList.containsAll(Arrays.asList("1", "x")));


    }

    public static void setOfStrings() {

        System.out.println("<<<<<<<<<<PRINTING SETS<<<<<<<<<<");
        final Set<String> setOfStrings = new HashSet<>();

        boolean firstAdded = setOfStrings.add("1");
        boolean secondAdded = setOfStrings.add("1");
        setOfStrings.add("2");
        setOfStrings.add("3");
        setOfStrings.add("4");
        setOfStrings.add("5");
        setOfStrings.add("6");
        setOfStrings.add("7");
        setOfStrings.add("8");
        setOfStrings.add(null);
        setOfStrings.add(null);

        System.out.println(setOfStrings);
        System.out.println("firstAdded=" + firstAdded);
        System.out.println("secondAdded=" + secondAdded);

        setOfStrings.addAll(Stream.of("2", "11").toList());

        System.out.println(setOfStrings);

        // To read, you should just loop over, no index.\
    }

    public static void setOfPersons() {
        final Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(5, 50, "Lolo"));
        studentSet.add(new Student(15, 44, "Soso"));
        studentSet.add(new Student(15, 44, "Soso"));

        for (Student p: studentSet) {
            if (p.getId() == 15) {
                System.out.println("The person with id=15 is:" + p);
            }
        }

        System.out.println(studentSet);
    }

    public static void mapOfStrings() {
        System.out.println("<<<<<<<<<<PRINTING MAPS>>>>>>>>>>>");
        final Map<Integer, Student> personMap = new HashMap<>();

        personMap.put(15, new Student(15, 50, "soso"));
        personMap.put(77, new Student(77, 13, "foso"));
        personMap.put(225, new Student(225, 16, "aoso"));
        personMap.put(1333, new Student(1333, 20, "yoso"));
        personMap.put(1333, new Student(1333, 23, "toso"));

//        personMap.computeIfAbsent(15, (key) -> {
//            return new Student(key, 55, "soso2");
//        });

        System.out.println(personMap.get(77));
        System.out.println(personMap.get(88));
        System.out.println(personMap.get(1333));

        System.out.println(personMap.containsKey(88));
        System.out.println(personMap.containsKey(225));

        System.out.println(personMap.containsValue(new Student(1333, 200, "Mustafa")));

        personMap.computeIfPresent(225, (key, value) -> new Student(225, 17, "aoso"));

        System.out.println(personMap);
    }

}
