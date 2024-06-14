package org.bbathech;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

//        final int getTimeout = new Configuration().getParameter("http.get.timeout");

//        final String dbTimeout = "10 seconds";
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
//
//        for (String arg: args) {
//            System.out.println(arg);
//        }
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        // Lists
        listOfStrings();
        listOfPersons();

        // Sets
        setOfStrings();
        setOfPersons();

        // Maps
        mapOfStrings();



    }

    private static void mapOfStrings() {
        System.out.println("PRINTING MAPS");
        final Map<Integer, Person> personMap = new HashMap<>();

        personMap.put(15, new Person(15, 50, "soso"));
        personMap.put(77, new Person(77, 13, "foso"));
        personMap.put(225, new Person(225, 16, "aoso"));
        personMap.put(1333, new Person(1333, 20, "yoso"));
        personMap.put(1333, new Person(1333, 23, "toso"));


        System.out.println(personMap.get(77));
        System.out.println(personMap.get(88));
        System.out.println(personMap.get(1333));
    }

    private static void setOfPersons() {
        final Set<Person> personSet = new HashSet<>();

        personSet.add(new Person(5, 50, "Lolo"));
        personSet.add(new Person(15, 44, "Soso"));
        personSet.add(new Person(15, 44, "Soso"));

        for (Person p: personSet) {
            if (p.getId() == 15) {
                System.out.println("The person with id=15 is:" + p);
            }
        }

        System.out.println(personSet);

    }

    private static void setOfStrings() {

        // Unordered
        // No duplicates

        System.out.println("PRINTING SETS");
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

        // To read, you should just loop over, no index.
    }

    private static void listOfPersons() {

        System.out.println("PRINTING LISTS");
        final List<Person> persons = new ArrayList<>();

        persons.add(new Person(1, 50, "Abood"));
        persons.add(new Person(17, 15, "Baraa"));
        persons.add(new Person(18, 11, "Lolo"));
        persons.add(new Person(70, 35, "Soso"));
        persons.add(new Person(100, 70, "Fofo"));

        for (Person person: persons) {
            System.out.println(person);
        }

        Person elli3omro70 = null;
        for (Person p: persons) {
            if (p.getId() == 70) {
                elli3omro70 = p;
            }
        }
        System.out.println(elli3omro70);
        System.out.println(persons.get(3));
    }

    private static void listOfStrings() {
        final List<String> stringList = new ArrayList<>(); // LinkedList<>()
        // List: Ordered .... add(1)... add(2)
        // Duplicates allowed

        stringList.add("1");
        stringList.add("3");
        stringList.add("3");
        stringList.add("3");
        stringList.add("3");
        stringList.add("3");
        stringList.add("5");

        //stringList = new ArrayList<>();

        System.out.println(stringList);
        for (String listElem: stringList) {
            System.out.print(listElem);
        }

        stringList.add("7");

        System.out.println(stringList);

        stringList.add(null);

        System.out.println(stringList);

        stringList.add(null);

        System.out.println(stringList);

        System.out.println(stringList.get(1));
    }


}