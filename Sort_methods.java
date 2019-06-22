import java.util.Arrays;


public class Sort_methods {
		
	// comparison counters
	
	 static int compincrement=0;
	 static int compincrement_1=0;
	
	
	// bubble sort method
	
	public static void bubbleSort(Comparable[] array, int lowIndex, int highIndex) {
    
	//flag to see if an item was swapped or not
       
	   boolean swap = false;
		
		
	   // loop size - 1 times   
	   
    for (int i = lowIndex + 1; i <= highIndex; i++) {
    	
      //loop from beginning of array to (last element - i)
	  
	for (int j = 0; j <= highIndex - i; j++) {
          
     // swap takes place if 1st item greater than 2nd item
	
		compincrement_1++; 
		if (array[j].compareTo(array[j + 1]) > 0) {
            
		Comparable temp = array[j];
		array[j] = array[j + 1];
        array[j + 1] = temp;
			}
          }
	   }  
	}


	
	public static void quickSort (Comparable comparableArray[], int lowIndex, int highIndex){
				
		
		//at least one item must exist in the array 
		if (lowIndex>=highIndex){
			return;
		}

		int pivot_Index=getMedianIndexAspivot_Index(lowIndex, highIndex);
		
		//1) CREATE A PIVOT
		
		Comparable pivot=comparableArray[pivot_Index];
		
		//2) Swap the pivot to the last item in the array
		swapMethod(comparableArray, pivot_Index, highIndex); 	

		/*	
		  	we will set 'i' to point to the item before the first Index
			we will set 'j' to point to the item before pivot
			 
			 This will cause
			 
			1. All items left of Index 'i' have a value <=pivot
			2. All items right of Index 'j' have a value >=pivot
		*/

		int i=lowIndex-1;
		int j=highIndex;

		do{ //Notice the <j (pivot item is ignored). We stop when both the counters cross

			//compareTo will return 0 when it reaches the pivot - will exit loop
			compincrement++;
			do {i++;} while (comparableArray[i].compareTo(pivot)<0);
			
						
			//we dont have the protection as the previous loop. 
			//So, add extra condition to prevent 'j' from overflowing outside the current sub array
			
			compincrement++;
			do {j--;} while (comparableArray[j].compareTo(pivot)>0 &&(j>lowIndex));
			
			if (i<j){
				swapMethod(comparableArray, i, j);
				
			}
			
			
		} while (i<j);

		swapMethod(comparableArray, highIndex, i);//bring pivot to i's position	
		
		// USING RECURSIVE ALGORITHM
		
		quickSort(comparableArray, lowIndex, i-1); // To sort subarray between low index and one before the pivot
		quickSort(comparableArray, i+1, highIndex); // To sort subarray between low index and one before the pivot
		
		}


	// CREATING A SWAP METHOD
	
	private static void swapMethod(Comparable[] comparableArray, int firstItem, int secondItem) {
		final Comparable tempItem=comparableArray[firstItem];
		comparableArray[firstItem]=comparableArray[secondItem];
		comparableArray[secondItem]=tempItem;
	}


	//Variation 1 - chose median as pivot  
	
	private static int getMedianIndexAspivot_Index(int lowIndex, int highIndex) {
		return lowIndex+((highIndex-lowIndex)/2);
	}



	// For testing purposes
	
	public static void main(String[] args) {

		//Integer[] unsortedArray=new Integer[]{1,32,121,1424,2,1214,121214,3535,754,343};
		//float[] unsortedArray=new float[]{4,4,8,0,8,9,7,3,7,6}; 
		String[] unsortedArray=new String[]{"A","C","D","E","F"};
		//double[] unsortedArray=new double[]{3112,134,555,61.5,2.5,4.6,31};

		long startTime = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(unsortedArray));
		quickSort(unsortedArray, 0, unsortedArray.length-1);
		//bubbleSort(unsortedArray, 0, unsortedArray.length-1);

		System.out.println("Sorted array : "+Arrays.asList(unsortedArray));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime);
		System.out.println("Number of comparisons "+compincrement);
		//System.out.println("Number of comparisons "+compincrement_1);
		
	}

}
