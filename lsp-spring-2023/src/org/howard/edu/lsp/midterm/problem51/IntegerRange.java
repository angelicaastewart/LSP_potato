package org.howard.edu.lsp.midterm.problem51;

public class IntegerRange implements Range {
	private int lower;
	private int upper;

    public class EmptyRangeException extends Exception {
        //constructor that prints out error by calling super()
        public EmptyRangeException(String error) {
            super(error);
        }
    }
// Hint: implement getters for lower and upper

	 IntegerRange(int lower, int upper) { 	// Constructor
    		this.lower = lower;
    		this.upper = upper;
	 }
public boolean contains(int value) {
	// implement
	return(value>=lower && value <= upper);
}
public boolean overlaps(Range other) throws EmptyRangeException {
	// implement
	
	return other.contains(lower) || other.contains(upper);
//	if(other.lower>=lower && other.lower<=upper)
//		return true;
//	if(other.upper>=lower && other.upper<=upper)
//		return true;
//	if(lower>=other.lower && lower<=other.upper)
//		return true;
//	if(upper>=other.lower && upper<=other.upper)
//		return true;
//	return false;
}

public int size()  {
	// implement
	return upper-lower+1;
}
}

