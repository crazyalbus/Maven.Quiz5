package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{

    Stack stack;

    public MyStack() {
        this.stack = new Stack();
//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.push(i);
    }

    public SomeType peek() {
        if(isEmpty()) {
            return null;
        }
        return (SomeType) stack.peek();
//        throw new UnsupportedOperationException("Method not yet implemented");
    }

    public SomeType pop() {
            return (SomeType) stack.pop();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
