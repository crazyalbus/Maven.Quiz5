package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <SomeType extends Comparable> Iterable<? extends Iterable<SomeType>> powerSet(Set<SomeType> originalSet) {
        List<SomeType> originalList = new ArrayList<>(originalSet);
        List<List<SomeType>> powerList = new ArrayList<>();

        int powerSetSize = (int) Math.pow(2, originalSet.size());

        int i = powerSetSize - 1;
        while (i >= 0) {
            List<SomeType> temp = new ArrayList<>();
            String pattern = Integer.toBinaryString(i);
            if(pattern.length() < Integer.toBinaryString(powerSetSize-1).length()) {
                pattern = "0" + pattern;
            }
            for (int j = 0; j < pattern.length(); j++) {
                if(Character.compare(pattern.charAt(j), '1') == 0) {
                    temp.add(originalList.get(j));
                }
            }
            powerList.add(temp);
            i--;
        }
        return powerList;
    }

    public static <SomeType extends Comparable> Iterable<? extends Iterable<SomeType>> powerSet(SomeType... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

