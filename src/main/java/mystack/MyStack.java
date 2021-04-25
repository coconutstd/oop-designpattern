package mystack;

import java.util.*;

public class MyStack<String> extends ArrayList<String> {
    public void push(String element){
        add(element);
    }

    public String pop() {
        return remove(size() - 1);
    }
}
