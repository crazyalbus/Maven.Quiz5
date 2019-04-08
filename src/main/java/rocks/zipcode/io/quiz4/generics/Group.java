package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<SomeType> implements GroupInterface<SomeType> {

    List<SomeType> list;

    public Group() {
        this(new ArrayList<>());
//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Group(List<SomeType> list) {
        this.list = list;
    }

    public Integer count() {
        return list.size();
    }

    public void insert(SomeType value) {
        list.add(value);
    }

    public Boolean has(SomeType value) {
        return list.contains(value);
    }

    public SomeType fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    public void delete(SomeType value) {
        list.remove(value);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<SomeType> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        String listAsString = "[";
        for (SomeType item : list) {
            listAsString += item.toString() + ", ";
        }
        return listAsString.substring(0,listAsString.length() - 2) + "]";
    }

}
