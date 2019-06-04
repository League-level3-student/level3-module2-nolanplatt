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
	
	public static double sortScores(List<Double> results) {
		for (int i = 1; i < results.size(); i++) {
		
			for (int j = i; j > 0; j++) {
	
				if(results.get(j) < results.get(j - 1)) {
					/*
					int swap = results.get(j);
					
					results.get(j) = array[i];					
					results.get(i) = swap;
					*/
				}
			}
				
		}
		return 0;
	}
	
	
}
