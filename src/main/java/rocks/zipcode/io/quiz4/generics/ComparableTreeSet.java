package rocks.zipcode.io.quiz4.generics;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<SomeType> extends TreeSet<SomeType> implements Comparable<SomeType> {

    private Set<SomeType> set;


    public ComparableTreeSet(SomeType... arr) {
        this.set = new TreeSet<SomeType>();
        for (SomeType s : arr) {
            this.set.add(s);
        }
    }


    public ComparableTreeSet() {
        this.set = new TreeSet<SomeType>();
    }

    public int compareTo(ComparableTreeSet<SomeType> o) {

        String thisSet = toString();
        String compareSet = o.toString();

        return thisSet.compareTo(compareSet);
    }

    @Override
    public int compareTo(SomeType o) {

        return 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (SomeType s : set) {
            builder.append(s);
            builder.append(", ");
        }
        String temp = builder.toString();
        temp = temp.substring(0, temp.length()-2) + "]";
        return temp;
    }
}
