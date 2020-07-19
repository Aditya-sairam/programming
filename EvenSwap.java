import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EvenSwap
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    int i,j;
	    for(i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    //int temp;
	    List<Integer> array = new ArrayList<Integer>();
	    List<Integer> ind = new ArrayList<Integer>();
	    for(i=0;i<n;i++){
	        int count = 0;
	        if(arr[i]%2 == 0){
	            array.add(arr[i]);
	            ind.add(i);
	            count++;
	        }
	         //System.out.print(count);
	        if(count == 2){
	            int temp = arr[ind.get(0)];
	            arr[ind.get(0)] = arr[ind.get(1)];
	            arr[ind.get(1)] = temp;
	            count = 0;
	            ind.clear();
	        }
	       
	    }
	    /*for(i=0;i<n;i++){
	        System.out.println(arr[i]);
	    }*/
	   
	   
	   int[] finale = new int[ind.size()];
	   for(i=0;i<ind.size();i++){
	       finale[i] = ind.get(i);
	   }
	    
	    if(finale.length%2 == 0){
	        for(i=0;i<finale.length;i+=2){
	            int tempo = finale[i];
	            finale[i] = finale[i+1];
	            finale[i+1] = tempo;
	        }
	    }
	    else{
	        for(i=0;i<finale.length-1;i+=2){
	            int tempo = finale[i];
	            finale[i] = finale[i+1];
	            finale[i+1] = tempo;
	        }
	    }
	   if(finale.length%2 != 0){
	    for(i=0;i<finale.length-1;i+=2){
	        int tempu = arr[finale[i]];
	        arr[finale[i]] = arr[finale[i+1]];
	        arr[finale[i+1]] = tempu;
	        
	    }
	   }
	   else{
	       for(i=0;i<finale.length;i+=2){
	        int tempu = arr[finale[i]];
	        arr[finale[i]] = arr[finale[i+1]];
	        arr[finale[i+1]] = tempu;
	       
	   }
	   }
	     for(i=0;i<n;i++){
	        System.out.println(arr[i]);
	    }
	    for(i=0;i<finale.length;i++){
	        System.out.println(finale[i]);
	    }
	}
}
