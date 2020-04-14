/* package codechef; // don't place package name! */
//Finding the minimum distance between same elements using hashmap

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hacko
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    
	    int i,j,count = 0;
	    for(i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    HashMap<Integer, Integer> hmap = new HashMap<>();
	    int min_val = Integer.MAX_VALUE;
	    int prev = 0;
	    int curr = 0;
	    
	    for(i=0;i<n;i++){
	        if(hmap.containsKey(arr[i])){
	            curr= i;
	            prev = hmap.get(arr[i]);
	            min_val = Math.min((curr-prev),min_val);
	        }
	        hmap.put(arr[i],i);
	    }
	    System.out.print(min_val);
	}
}
