package org.bbathech.data;

import org.bbathech.model.Course;

import java.util.HashMap;
import java.util.Map;

public class CourseResults {

    public static Map<Course, Map<Integer, Integer>> results = new HashMap<>();

    static {

        final Map<Integer, Integer> mathResults = new HashMap<>();
        mathResults.put(11, 70);
        mathResults.put(17, 92);
        mathResults.put(18, 49);
        mathResults.put(22, 66);
        mathResults.put(25, 88);
        results.put(Course.MATH, mathResults);

        final Map<Integer, Integer> englishResults = new HashMap<>();
        englishResults.put(11, 70);
        englishResults.put(17, 92);
        englishResults.put(18, 49);
        englishResults.put(22, 66);
        englishResults.put(25, 88);
        results.put(Course.ENGLISH, englishResults);

        final Map<Integer, Integer> scienceResults = new HashMap<>();
        scienceResults.put(11, 70);
        scienceResults.put(17, 92);
        scienceResults.put(18, 49);
        scienceResults.put(22, 66);
        scienceResults.put(25, 88);
        results.put(Course.SCIENCE, scienceResults);
    }

}
