import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Scanner;

public class project_trial 
{

public static void main(String[] args)
{
	
	
	// calling sorting methods from the class Sort_methods
	Sort_methods qc= new Sort_methods();
	
	// Taking input from user about the data type of input
	
	String input_method=" ";
	String input_array=" ";
	String output_array	=" ";
	String total_time	=" ";
	String total_comparisons	=" ";
	
	// total time taken
	
	float time_taken;
	
	String input= JOptionPane.showInputDialog("\n please enter the datatype of your input from the following options :-"
	+"\n 1. int"
	+"\n 2. double"
	+"\n 3. String");
	
	int input_datatype=Integer.parseInt(input);
	
	// Number of inputs to be entered by the user
	Scanner scan = new Scanner(System.in); 	
	
	int n;
    n = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of entries you wish to list"));
	
	// We have applied a switch statement base on the data type selected by the user
	
	switch (input_datatype)
	{
	
	// Integer Datatype
	
	case 1:
	
		Integer a[] = new Integer[n];
        
        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the "+(i+1)+" element"));
        }
		
		
		
		// User needs to specify the type of sorting algorithm he needs to used
		
			input_method= JOptionPane.showInputDialog("\n Please select a sorting algorithm :-"
			+"\n 1. Bubble Sort"
			+"\n 2. Quick Sort"+"\n 3. Exit");
		
		int sort_choice=Integer.parseInt(input_method);
		
		
		
		switch (sort_choice)
		{
		
		// Bubble Sort 
		
		case 1:
		
		long startTime_bubble_sort_1 = System.nanoTime();
		
		// input list
		
		input_array += "Input List : "+Arrays.asList(a);
		
		// applying the bubble sort
		
		qc.bubbleSort(a, 0, a.length-1);

		// sorted array
		
		output_array += "Sorted List : "+Arrays.asList(a);
		
		// calculating the time
		
		time_taken=System.nanoTime()-startTime_bubble_sort_1;
		total_time += "total time in nano-seconds: "+time_taken;
		
		// computing the comparisons
		
		total_comparisons += "total comparisons : "+qc.compincrement_1;
		
		
		JOptionPane.showMessageDialog(null,input_array);
		JOptionPane.showMessageDialog(null,output_array);
		JOptionPane.showMessageDialog(null,total_time);
		JOptionPane.showMessageDialog(null,total_comparisons);
		
		break;
	
		// Quick sort
	
		case 2:
		
		long startTime_bubble_sort_2 = System.nanoTime();
		
		// input list
		
		input_array += "Input List : "+Arrays.asList(a);
		
		// applying the bubble sort
		
		qc.quickSort(a, 0, a.length-1);

		// sorted array
		
		output_array += "Sorted List : "+Arrays.asList(a);
		
		// calculating the time
		
		time_taken=System.nanoTime()-startTime_bubble_sort_2;
		total_time += "total time in nano-seconds: "+time_taken;
		
		// computing the comparisons
		
		total_comparisons += "total comparisons : "+qc.compincrement;
		
		
		JOptionPane.showMessageDialog(null,input_array);
		JOptionPane.showMessageDialog(null,output_array);
		JOptionPane.showMessageDialog(null,total_time);
		JOptionPane.showMessageDialog(null,total_comparisons);

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
            a1[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the "+(i+1)+" element"));
        }
		
		
		
		// User needs to specify the type of sorting algorithm he needs to used
		
			input_method= JOptionPane.showInputDialog("\n Please select a sorting algorithm :-"
			+"\n 1. Bubble Sort"
			+"\n 2. Quick Sort"+"\n 3. Exit");
		
		int sort_choice_d=Integer.parseInt(input_method);
		
		
		switch (sort_choice_d)
		{
		
		// Bubble sort
		
		case 1:
		
		long startTime_bubble_sort_1_double = System.nanoTime();
		
		// input list
		
		input_array += "Input List : "+Arrays.asList(a1);
		
		// applying the bubble sort
		
		qc.bubbleSort(a1, 0, a1.length-1);

		// sorted array
		
		output_array += "Sorted List : "+Arrays.asList(a1);
		
		// calculating the time
		
		time_taken=System.nanoTime()-startTime_bubble_sort_1_double;
		total_time += "total time in nano-seconds: "+time_taken;
		
		// computing the comparisons
		
		total_comparisons += "total comparisons : "+qc.compincrement_1;
		
		
		JOptionPane.showMessageDialog(null,input_array);
		JOptionPane.showMessageDialog(null,output_array);
		JOptionPane.showMessageDialog(null,total_time);
		JOptionPane.showMessageDialog(null,total_comparisons);
		
		break;
	
		// Quick sort
	
		case 2:
		
		long startTime_bubble_sort_2_double = System.nanoTime();
		
		// input list
		
		input_array += "Input List : "+Arrays.asList(a1);
		
		// applying the quick sort
		
		qc.quickSort(a1, 0, a1.length-1);

		// sorted array
		
		output_array += "Sorted List : "+Arrays.asList(a1);
		
		// calculating the time
		
		time_taken=System.nanoTime()-startTime_bubble_sort_2_double;
		total_time += "total time in nano-seconds: "+time_taken;
		
		// computing the comparisons
		
		total_comparisons += "total comparisons : "+qc.compincrement;
		
		
		JOptionPane.showMessageDialog(null,input_array);
		JOptionPane.showMessageDialog(null,output_array);
		JOptionPane.showMessageDialog(null,total_time);
		JOptionPane.showMessageDialog(null,total_comparisons);
		
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
            unsortedArray[i] = JOptionPane.showInputDialog(null,"Enter the "+(i+1)+" element");
        }
		
		// User needs to specify the type of sorting algorithm he needs to used
		
			input_method= JOptionPane.showInputDialog("\n Please select a sorting algorithm :-"
			+"\n 1. Bubble Sort"
			+"\n 2. Quick Sort"+"\n 3. Exit");
		
		int sort_choice_S=Integer.parseInt(input_method);
				
		switch (sort_choice_S)
		{
		
		case 1:
		
		// Bubble sort 
		
		long startTime_bubble_sort_1_String = System.nanoTime();
		
		// input list
		
		input_array += "Input List : "+Arrays.asList(unsortedArray);
		
		// applying the bubble sort
		
		qc.bubbleSort(unsortedArray, 0, unsortedArray.length-1);

		// sorted array
		
		output_array += "Sorted List : "+Arrays.asList(unsortedArray);
		
		// calculating the time
		
		time_taken=System.nanoTime()-startTime_bubble_sort_1_String;
		total_time += "total time in nano-seconds: "+time_taken;
		
		// computing the comparisons
		
		total_comparisons += "total comparisons : "+qc.compincrement_1;
		
		
		JOptionPane.showMessageDialog(null,input_array);
		JOptionPane.showMessageDialog(null,output_array);
		JOptionPane.showMessageDialog(null,total_time);
		JOptionPane.showMessageDialog(null,total_comparisons);
		
		break;
	
		case 2:
		
		// Quick sort 
		
		long startTime_bubble_sort_2_String = System.nanoTime();
		
		// input list
		
		input_array += "Input List : "+Arrays.asList(unsortedArray);
		
		// applying the quick sort
		
		qc.quickSort(unsortedArray, 0, unsortedArray.length-1);

		// sorted array
		
		output_array += "Sorted List : "+Arrays.asList(unsortedArray);
		
		// calculating the time
		
		time_taken=System.nanoTime()-startTime_bubble_sort_2_String;
		total_time += "total time in nano-seconds: "+time_taken;
		
		// computing the comparisons
		
		total_comparisons += "total comparisons : "+qc.compincrement;
		
		
		JOptionPane.showMessageDialog(null,input_array);
		JOptionPane.showMessageDialog(null,output_array);
		JOptionPane.showMessageDialog(null,total_time);
		JOptionPane.showMessageDialog(null,total_comparisons);

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
