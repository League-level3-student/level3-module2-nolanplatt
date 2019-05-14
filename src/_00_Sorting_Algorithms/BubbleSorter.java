package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		for (int i = 0; i < arr.length; i++) {
			int firstArray = arr[i];
			for (int j = 0; j < arr.length - i; j++) {
				if(firstArray> j) {
					System.out.println(firstArray + ">" + j + " , ok");
				}
				else {
					System.out.println(j + ">" + firstArray + " , swapping");
					arr[i] = arr[j];
					arr[j] = arr[i];
				}
				
			}
		}
	}
	
}
