/**
*  Name: Angelica Stewart
*/

package org.howard.edu.lsp.assignment2;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class WordCounter {
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	static void counter(String file, Map < String, Integer> words) throws FileNotFoundException {
		Scanner f = new Scanner (new File(file));
		while(f.hasNext()) {
			
			String word = f.next().toLowerCase();
			
			if(!isNumeric(word)) {

			Integer count = words.get(word);
			if(count != null)
				count ++;
			else
				count = 1;
				words.put(word, count);
		}}
		f.close();
	}
	public static void main(String[] args) throws FileNotFoundException {
		Map <String, Integer> words = new HashMap <String, Integer>();
		counter("C:\\Users\\angel\\git\\LSP_potato\\lsp-spring-2023\\src\\org\\howard\\edu\\lsp\\assignment2\\words.txt", words);
		System.out.print(words);
		
	}

}
