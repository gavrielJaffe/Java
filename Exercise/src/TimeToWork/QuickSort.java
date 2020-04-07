package TimeToWork;
import java.util.Scanner;
public class QuickSort {
	    /* This function takes last element as pivot, 
	       places the pivot element at its correct 
	       position in sorted array, and places all 
	       smaller (smaller than pivot) to left of 
	       pivot and all greater elements to right 
	       of pivot */
	    int partition(int arr[], int low, int high) 
	    { 
	        int pivot = arr[high];  
	        int i = (low-1); // index of smaller element 
	        for (int j=low; j<high; j++) 
	        { 
	            // If current element is smaller than the pivot 
	            if (arr[j] < pivot) 
	            { 
	                i++; 
	  
	                // swap arr[i] and arr[j] 
	                int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	            } 
	        } 
	  
	        // swap arr[i+1] and arr[high] (or pivot) 
	        int temp = arr[i+1]; 
	        arr[i+1] = arr[high]; 
	        arr[high] = temp; 
	  
	        return i+1; 
	    } 
	  
	    /* The main function that implements QuickSort() 
	      arr[] --> Array to be sorted, 
	      low  --> Starting index, 
	      high  --> Ending index */
	    void sort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 
	            /* pi is partitioning index, arr[pi] is  
	              now at right place */
	            int pi = partition(arr, low, high); 
	  
	            // Recursively sort elements before 
	            // partition and after partition 
	            sort(arr, low, pi-1); 
	            sort(arr, pi+1, high); 
	        } 
	    } 
	  
	    /* A utility function to print array of size n */
	    
	    static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i]+" "); 
	        System.out.println(); 
	    } 

	       //Ex1 -The main 
	    	public static void main(String[] args) {
	    		int size=0,flag;
	    		int[] arr = new int[size];
	    		Set_Array saObj=new Set_Array();
	    		Scanner scn=new Scanner(System.in);
	    		//Asking for the size
	    		System.out.println("Enetr size of Array :");
	    		size = scn.nextInt();
	    		arr=saObj.SetArray(size);
	    		
	    	  do{
	    		
	    		System.out.println("if you want to change press -1,otherwise Enter :'-5' ");
	    		flag=scn.nextInt();
	    		if (flag==-1)
	    		  {
	    			System.out.println("Enter the new size:");
	    			size=scn.nextInt();
	    			arr=saObj.SetArray(size);
	    		  }
	    		}
	    		while(flag==-1);
	    		for (int i = 0; i < arr.length; i++) {
	    			System.out.println(""+arr[i]);
	    		}
	    	     scn.close();	    			    	
    		// int arr[] = {10, 7, 8, 9, 1, 5}; 
	        int n = size; 
	  
	        QuickSort ob = new QuickSort(); 
	        ob.sort(arr, 0, n-1); 
	  
	        System.out.println("sorted array"); 
	        printArray(arr); 
	    } 
	} 