
import java.util.Arrays;
import java.util.Scanner;

public class project 
{

public static void main(String[] args)
{
	
	
	// calling sorting methods from the class Sort_methods
	Sort_methods qc= new Sort_methods();
	
	// Taking input from user about the data type of input
	
	Scanner scan = new Scanner(System.in); 	
	System.out.println("please enter the datatype of your input from the following options :-");
	System.out.println("1. int");
	System.out.println("2. double");
	System.out.println("3. String");
	int input_datatype=scan.nextInt();
	
	// Number of inputs to be entered by the user
	
	System.out.println("Please enter the number of entries you wish to list");
	int n;
    n = scan.nextInt();
	
	// We have applied a switch statement base on the data type selected by the user
	
	switch (input_datatype)
	{
	
	// Integer Datatype
	
	case 1:
		Integer a[] = new Integer[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }
		
		
		// User needs to specify the type of sorting algorithm he needs to used
		
		System.out.println("Please select a sorting algorithm:");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Quick Sort");
		int sort_choice;
		sort_choice = scan.nextInt();
		
		
		
		switch (sort_choice)
		{
		
		// Bubble Sort 
		
		case 1:
		
		long startTime_bubble_sort_1 = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(a));
		qc.bubbleSort(a, 0, a.length-1);

		System.out.println("Sorted array : "+Arrays.asList(a));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime_bubble_sort_1);
		System.out.println("Number of comparisons "+qc.compincrement_1);
		
		break;
	
		// Quick sort
	
		case 2:
		
		long startTime_bubble_sort_2 = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(a));
		qc.quickSort(a, 0, a.length-1);

		System.out.println("Sorted array : "+Arrays.asList(a));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime_bubble_sort_2);
		System.out.println("Number of comparisons "+qc.compincrement);

		break;
		
		
		default:
		System.out.println("invalid entry");
		}

		
		break;

		// Double Datatype
		
		case 2:
		Double[] a1 = new Double[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a1[i] = scan.nextDouble();
        }
		System.out.println("Please select a sorting algorithm:");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Quick Sort");

		
		int sort_choice_d;
		sort_choice_d = scan.nextInt();

		switch (sort_choice_d)
		{
		
		// Bubble sort
		
		case 1:
		
		long startTime_bubble_sort_1_double = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(a1));
		qc.bubbleSort(a1, 0, a1.length-1);

		System.out.println("Sorted array : "+Arrays.asList(a1));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime_bubble_sort_1_double);
		System.out.println("Number of comparisons "+qc.compincrement_1);
		
		break;
	
		// Quick sort
	
		case 2:
		
		long startTime_bubble_sort_2_double = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(a1));
		qc.quickSort(a1, 0, a1.length-1);

		System.out.println("Sorted array : "+Arrays.asList(a1));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime_bubble_sort_2_double);
		System.out.println("Number of comparisons "+qc.compincrement);

		break;
		
		
		default:
		System.out.println("invalid entry");
		}
		break;
		
		
		//  String datatype
		
		case 3:
		String[] unsortedArray = new String[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            unsortedArray[i] = scan.next();
        }
		
		System.out.println("Please select a sorting algorithm:");
		System.out.println("1. Bubble Sort");
		System.out.println("2. Quick Sort");
		
		int sort_choice_S;
		sort_choice_S = scan.nextInt();
		
		switch (sort_choice_S)
		{
		
		case 1:
		
		// Bubble sort 
		
		long startTime_bubble_sort_1_String = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(unsortedArray));
		qc.bubbleSort(unsortedArray, 0, unsortedArray.length-1);

		System.out.println("Sorted array : "+Arrays.asList(unsortedArray));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime_bubble_sort_1_String);
		System.out.println("Number of comparisons "+qc.compincrement_1);
		
		break;
	
		case 2:
		
		// Quick sort 
		
		long startTime_bubble_sort_2_String = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(unsortedArray));
		qc.quickSort(unsortedArray, 0, unsortedArray.length-1);

		System.out.println("Sorted array : "+Arrays.asList(unsortedArray));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime_bubble_sort_2_String);
		System.out.println("Number of comparisons "+qc.compincrement);

		break;
		
		
		default:
		System.out.println("invalid entry");
		}
	

		break;
		
		default:
		System.out.println("invalid entry");

		


}
}
}
