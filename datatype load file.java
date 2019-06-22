import java.util.Arrays;
import java.util.Scanner;

public class project 
{

public static void main(String[] args)
{
	// calling quick sort algo
	QuickSort_comparable qc= new QuickSort_comparable();
	
	
	Scanner scan = new Scanner(System.in); 	
	System.out.println("please enter the datatype of your input from the following options :-");
	System.out.println("1. int");
	System.out.println("2. double");
	System.out.println("3. String");
	int input_datatype=scan.nextInt();
	System.out.println("Please enter the number of entries you wish to list");
	int n;
    n = scan.nextInt();
	
		

	switch (input_datatype)
	{
		case 1:
		Integer a[] = new Integer[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
        }
		
		long startTime1 = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(a));
		qc.quickSort(a, 0, a.length-1);

		System.out.println("Sorted array : "+Arrays.asList(a));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime1);
		System.out.println("Number of comparisons "+qc.compincrement);


		break;

		case 2:
		Double[] a1 = new Double[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a1[i] = scan.nextDouble();
        }

		long startTime2 = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(a1));
		qc.quickSort(a1, 0, a1.length-1);

		System.out.println("Sorted array : "+Arrays.asList(a1));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime2);
		System.out.println("Number of comparisons "+qc.compincrement);

		break;
		
		case 3:
		String[] unsortedArray = new String[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            unsortedArray[i] = scan.next();
        }
		long startTime = System.nanoTime();
		
		System.out.println("Original array : "+Arrays.asList(unsortedArray));
		qc.quickSort(unsortedArray, 0, unsortedArray.length-1);

		System.out.println("Sorted array : "+Arrays.asList(unsortedArray));
		
		System.out.print("total time in nano-seconds:");
		System.out.println(System.nanoTime()-startTime);
		System.out.println("Number of comparisons "+qc.compincrement);


		break;
		
		default:
		System.out.println("invalid entry");

		

}
}
}
		
