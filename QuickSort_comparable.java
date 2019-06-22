import java.util.Arrays;

public class QuickSort_comparable {
	 
	 static int compincrement=0;
	 
	public static void quickSort (Comparable comparableArray[], int lowIndex, int highIndex){
				
		
		//at least one item must exist in the array 
		if (lowIndex>=highIndex){
			return;
		}

		int pivotIndex=getMedianIndexAsPivotIndex(lowIndex, highIndex);
		//1) Choose pivot from the sublist
		Comparable pivot=comparableArray[pivotIndex];
		System.out.println("Pivot : "+pivot);
		//2) Swap the pivot to the last item in the array
		swapItemsWithIndices(comparableArray, pivotIndex, highIndex); 	

		/*	
		  	Get the border indices sandwiching the unsorted items alone (ignore pivot (now, in the highIndex))
			set 'i' to point to the item before the first Index
			set 'j' to point to the item before pivot
			
			Notice that this way, the following invariant gets maintained 
			all through the sorting procedure
			
			a. All items left of Index 'i' have a value <=pivot
			b. All items right of Index 'j' have a value >=pivot
		*/

		int i=lowIndex-1;
		int j=highIndex;

		do{ //Notice the <j (pivot item is ignored). We stop when both the counters cross

			//compareTo will return 0 when it reaches the pivot - will exit loop
			do {i++;} while (comparableArray[i].compareTo(pivot)<0);
			compincrement++; // Adding the number of comparisons to the counter
			
			//we dont have the protection as the previous loop. 
			//So, add extra condition to prevent 'j' from overflowing outside the current sub array
			do {j--;} while (comparableArray[j].compareTo(pivot)>0 &&(j>lowIndex));
			compincrement++; // Adding the number of comparisons to the counter
			
			if (i<j){
				swapItemsWithIndices(comparableArray, i, j);
				
			}
			System.out.println("I :"+i + " J :"+j);
		} while (i<j);

		swapItemsWithIndices(comparableArray, highIndex, i);//bring pivot to i's position	
		
		System.out.println("Comparable array : "+Arrays.asList(comparableArray));

		//the big subarray is partially sorted (agrees to invariant). Let's recurse and bring in more hands

		quickSort(comparableArray, lowIndex, i-1); //sort subarray between low index and one before the pivot
		quickSort(comparableArray, i+1, highIndex); //sort subarray between low index and one before the pivot
		
		}


	//... since swapping with array is the easiest way to swap two objects
	private static void swapItemsWithIndices(Comparable[] comparableArray, int firstItem, int secondItem) {
		System.out.println("Swapping "+comparableArray[firstItem] +"  and  "+comparableArray[secondItem]);
		
		final Comparable tempItem=comparableArray[firstItem];
		comparableArray[firstItem]=comparableArray[secondItem];
		comparableArray[secondItem]=tempItem;
		System.out.println("After swap array : "+Arrays.asList(comparableArray));
	}


	//Variation 1 - chose median as pivot  
	private static int getMedianIndexAsPivotIndex(int lowIndex, int highIndex) {
		return lowIndex+((highIndex-lowIndex)/2);
	}




	public static void main(String[] args) {

		//Integer[] unsortedArray=new Integer[]{1,32,121,1424,2,1214,121214,3535,754,343};
		//float[] unsortedArray=new float[]{4,4,8,0,8,9,7,3,7,6}; 
		String[] unsortedArray=new String[]{"B","C","D","E","F","A"};
		//double[] unsortedArray=new double[]{3112,134,555,61.5,2.5,4.6,31};

		long startTime = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(unsortedArray));
		quickSort(unsortedArray, 0, unsortedArray.length-1);

		System.out.println("Sorted array : "+Arrays.asList(unsortedArray));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime);
		System.out.println("Number of comparisons "+compincrement);
		
	}

}
