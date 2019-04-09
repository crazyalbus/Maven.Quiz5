package rocks.zipcode.io.quiz4.generics;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<SomeType> extends TreeSet<SomeType> implements Comparable<SomeType> {

    Set<SomeType> set;


    public ComparableTreeSet(SomeType... arr) {
        this.set = new TreeSet<SomeType>();
        for (SomeType s : arr) {
            set.add(s);
        }
    }


    public ComparableTreeSet() {
        this.set = new TreeSet<SomeType>();
    }

    public int compareTo(ComparableTreeSet<SomeType> o) {

        boolean matches = true;
        for (SomeType s : o) {
            if(!set.contains(o)) {
                matches = false;
            }
        }

        if(matches == true) {
            return 0;
        }
        return -1;
    }

    @Override
    public int compareTo(SomeType o) {
        return 0;
    }
}
