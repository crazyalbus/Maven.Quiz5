package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <SomeType extends Comparable> Iterable<? extends Iterable<SomeType>> powerSet(Set<SomeType> originalSet) {


        return null;
    }

    public static <SomeType extends Comparable> Iterable<? extends Iterable<SomeType>> powerSet(SomeType... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }
}

