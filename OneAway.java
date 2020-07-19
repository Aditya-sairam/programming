/* There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.*/
 import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class OneAway
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String st1 = sc.nextLine();
	    String st2 = sc.nextLine();
	    int i,j;
	    int l1 = st1.length();
	    int l2 = st2.length();
	    
	    Map<Character,String> hmap = new HashMap<Character,String>();
	    if(l1<l2 || l1 == l2){
	        for(i=0;i<l1;i++){
	            hmap.put(st1.charAt(i),"Not Visited");
	        }
	        for(i=0;i<l2;i++){
	            if(hmap.containsKey(st2.charAt(i))){
	                hmap.put(st2.charAt(i),"Visited");
	            }
	            else{
	                hmap.put(st2.charAt(i),"Not Visited");
	            }
	        }
	    }
	    else{
	         for(i=0;i<l2;i++){
	            hmap.put(st2.charAt(i),"Not Visited");
	        }
	        for(i=0;i<l1;i++){
	            if(hmap.containsKey(st1.charAt(i))){
	                hmap.put(st1.charAt(i),"Visited");
	            }
	            else{
	                hmap.put(st1.charAt(i),"Not Visited");
	            }
	        }
	        
	    }
	    int counter = 0;
	    //System.out.println(hmap);
	    if(l1<l2){
	    for(i=0;i<l2;i++){
	        String val = hmap.get(st2.charAt(i));
	        if(val == "Not Visited"){
	            counter++;
	        }
	    }
	    }
	    else{
	        for(i=0;i<l1;i++){
	        String val = hmap.get(st1.charAt(i));
	        if(val == "Not Visited"){
	            counter++;
	    }
	  }
	 }
	    //System.out.println(counter);
	    //System.out.println(hmap);
	    if(counter == 1){
	        System.out.print("True");
	    }
	    else{
	        System.out.print("False");
	    }
	}
}
