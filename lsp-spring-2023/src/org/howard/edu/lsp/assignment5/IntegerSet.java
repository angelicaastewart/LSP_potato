package org.howard.edu.lsp.assignment5;


import java.util.List;
import java.util.ArrayList;


public class IntegerSet {
    private List<Integer> my_set;
    
    public IntegerSet() {
        my_set = new ArrayList<Integer>();
    }
    
    //making an exception that extends the  java Exception class
    public class IntegerSetException extends Exception {
        //constructor that prints out error by calling super()
        public IntegerSetException(String error) {
            super(error);
        }
    }
    
    //get method
    public List<Integer> get_set() {
        return my_set;
    }
    
    //set method
    public void set_set(List<Integer> new_set) {
        my_set = new_set;
    }
    
    //removes all values present in the ArrayList
    public void clear() {
        my_set.clear();
    }
    
    //returns the length of the ArrayList
    public int length() {
        return my_set.size();
    }
    
    //checks if a given IntegerSet has the same elements as its own
    public boolean equals(IntegerSet a) {
        if (my_set.size() != a.length()) {
            return false;
        }
        else {
            return my_set.containsAll(a.my_set);
        }
    }
    
    public boolean contains(int value) {
        return my_set.contains(value);
    }
    
    public int largest() throws IntegerSetException {
        if (my_set.isEmpty()) {
            throw new IntegerSetException("The Set is Empty.");
        }
        else {
            int max = my_set.get(0);
            for (int i = 0; i < my_set.size(); i++) {
                if (my_set.get(i) > max) {
                    max = my_set.get(i);
                }
            }
            return max;
        }
    }
    
    public int smallest() throws IntegerSetException {
        if (my_set.isEmpty()) {
            throw new IntegerSetException("The Set is Empty.");
        }
        else {
            int min = my_set.get(0);
            for (int i = 0; i < my_set.size(); i++) {
                if (my_set.get(i) < min) {
                    min = my_set.get(i);
                }
            }
            return min;
        }
    }
    
    public void add(int item) {
        if (my_set.contains(item) == false) {
            my_set.add(item);
        }
    }
    
    public void remove(int item) {
        if (my_set.contains(item) == true) {
            my_set.remove(my_set.indexOf(item));
        }
    }
    
    public void union(IntegerSet b) {
        for (int i = 0; i < b.length(); i++) {
            if (my_set.contains(b.my_set.get(i)) == false) {
                my_set.add(b.my_set.get(i));
            }
        }
    }
    
    public void intersect(IntegerSet b) {
        my_set.retainAll(b.my_set);
    }
    
    public void diff(IntegerSet b) {
        for (int i = 0; i < b.length(); i++) {
            if (my_set.contains(b.my_set.get(i)) == true) {
                my_set.remove(b.my_set.get(i));
            }
        }
    }
    
    public boolean isEmpty() {
        return my_set.isEmpty();
    }
    
    public String toString() {
        String list = "";
        for (int i = 0; i < my_set.size(); i++) {
            list += my_set.get(i).toString() + ", ";
        }
        return list;
    }
}
  