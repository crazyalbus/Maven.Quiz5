package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<SomeType extends Comparable> extends Group<SomeType> {

    @Override
    public void insert(SomeType value) {
        list.add(value);
        list.sort(this::compare);
    }

    @Override
    public void delete(SomeType value) {
        list.remove(value);
        list.sort(this::compare);
    }

    public Integer indexOf(SomeType value) {
        return list.indexOf(value);
    }

    public int compare(SomeType o1, SomeType o2) {
        return o1.compareTo(o2);
    }
}
