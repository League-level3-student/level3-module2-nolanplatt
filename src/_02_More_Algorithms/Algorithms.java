package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		
		int count = 0;
		for (int i = 0; i < oysters.size() ;i++) {
			if(oysters.get(i)) {
				count++;
			}
		}
		
		return count;
	}
	
	public static Double findTallest(List<Double> peeps) {
		Double heighest = 0.0;
		
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > heighest) {
				heighest = peeps.get(i);
			}
		}
		return heighest;
	}
	
	
	public static String findLongestWord(List<String> words) {
		String longest = "a";
		
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}
	
	public static boolean containsSOS(List<String> messages) {
		for (int i = 0; i < messages.size(); i++) {
			if(messages.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
		
		
	}
	
	public static List<Double> sortScores(List<Double> results) {
		
		
		boolean swapped;
		
		for (int i = 0; i < results.size() - 1; i++) {
		swapped = false;
			for (int j = 0; j < results.size() - 1; j++) {
	
				if(results.get(j) > results.get(j + 1)) {
					
					Double swap = results.get(j);
					
					results.set(j, results.get(j + 1));			
					results.set(j + 1, swap);
					swapped = true;
				}
				if(swapped == false) {
					break;
				}
			}
				
		}
		return results;
	}
	
	public static List<String> sortDNA(List<String> sequences) {
		
		
        boolean swapped; 

		for (int i = 0; i < sequences.size() - 1; i++) {
			swapped = false;
			for (int j = 0; j < sequences.size() - 1; j++) {
	
				if(sequences.get(j).length() > sequences.get(j + 1).length()) {
					
					String swap = sequences.get(j);
					
					sequences.set(j, sequences.get(j + 1));			
					sequences.set(j + 1, swap);
					swapped = true;
					
				}
				if(swapped == false) {
					break;
				}
			}
				
		}
		return sequences;
		
		
	}
	
public static List<String> sortWords(List<String> words) {
		
		
	boolean swapped; 

	for (int i = 0; i < words.size() - 1; i++) {
		swapped = false;
		for (int j = 0; j < words.size() - 1; j++) {

			if(words.get(j).compareTo(words.get(j + 1)) > 0) {

				
				String swap = words.get(j);
				
				words.set(j, words.get(j + 1));			
				words.set(j + 1, swap);
				swapped = true;
				
			}
			if(swapped == false) {
				break;
			}
		}
			
	}
		return words;
		
		
	}
	
	
}
