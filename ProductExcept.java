//Produt of all elements except the particular element in an array

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ProductExcept
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] left = new int[n];
	    int[] right = new int[n];
	    
	    int arr[] = new int[n];
	    int i,j;
	    for(i=0;i<n;i++){
	        arr[i] = sc.nextInt(); 
	    }
	    left[0] = 1;
	    for(i=1;i<n;i++){
	        left[i] = left[i-1]*arr[i-1];
	    }
	    right[n-1] = 1;
	    
	    for(i=n-2;i>=0;i--){
	        right[i] = right[i+1]*arr[i+1];
	    }
	    for(i=0;i<n;i++){
	        arr[i] = right[i]*left[i];
	    }
	    for(i=0;i<n;i++){
	        System.out.println(arr[i]);
	    }
	}
	
}
