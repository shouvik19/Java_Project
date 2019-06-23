import java.util.Arrays;


public class Search_methods {

public static Comparable LinearSearch(Comparable[] arr, Comparable key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i+1
				;    
            }    
        }    
        return -1;    
    } 
	

	// For testing purposes
	
	public static void main(String[] args) {

		//Integer[] unsortedArray=new Integer[]{1,32,121,1424,2,1214,121214,3535,754,343,50};
		//float[] unsortedArray=new float[]{4,4,8,0,8,9,7,3,7,6}; 
		String[] unsortedArray=new String[]{"A","C","D","E"};
		//double[] unsortedArray=new double[]{3112,134,555,61.5,2.5,4.6,31};

		long startTime = System.nanoTime();
		
		Comparable key="A";
		
		// This will return the index at which it finds the key
		
		System.out.println(LinearSearch(unsortedArray, key));
		
	}	
	}	
