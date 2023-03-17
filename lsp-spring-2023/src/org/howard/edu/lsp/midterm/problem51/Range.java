package org.howard.edu.lsp.midterm.problem51;

import org.howard.edu.lsp.midterm.problem51.IntegerRange.EmptyRangeException;

public interface Range { 
int lower = 0;
int upper = 0;
public boolean contains( int value );  
    // returns true if v is ≥ lower bound and ≤ upper bound, 
    // and false otherwise 
public boolean overlaps( Range other ) throws EmptyRangeException; 
    // returns true if the receiver contains at least 
    // one value in common with other, and false otherwise 
    //  EmptyRangeException is thrown when a null Range object is passed to the method
public int size(); 
    // returns the number of integers in the range
}

