package rocks.zipcode.io.quiz4.generics;

import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<SomeType> extends TreeSet<SomeType> implements Comparable<SomeType> {
    public ComparableTreeSet(SomeType... arr) {
    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<SomeType> o) {
        return Integer.valueOf(null);
    }

    @Override
    public int compareTo(SomeType o) {
        return 0;
    }
}
