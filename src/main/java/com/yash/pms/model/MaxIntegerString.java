package com.yash.pms.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class MaxIntegerString {

	public static void main(String[] args)
    {
		//Max Integer
		/*List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
   
		System.out.print("The maximum value is : ");
	
	    // Using stream.max() to get maximum
	    // element according to provided Comparator
	    // and storing in variable var
	    Integer var = list.stream().max(Integer::compare).get();
	    System.out.print(var);*/
	    
		//Smallest Integer
	    /*List<Integer> list = Arrays.asList(9, 18, 0, 25, 4);
	    
        // Using stream.max() to get maximum
        // element according to provided Comparator
        // Here, the smallest element in list
        // will be stored in variable var
        Optional<Integer> var = list.stream()
                     .max(Comparator.reverseOrder());
  
        // If a value is present, isPresent()
        // will return true, else display message
        if (var.isPresent()) {
            System.out.println(var.get());
        }
        else {
            System.out.println("-1");
        }*/
        
		// Here, the character with maximum ASCII value

		/*List<String> list = Arrays.asList("G", "E", "E", "K",
                 "g", "e", "e", "k");

		// using Stream.max() method with Comparator
		// is stored in variable MAX
		String MAX = list.stream().max(Comparator.
		comparing(String::valueOf)).get();
		
		// Displaying the maximum element in
		// the stream according to provided Comparator
		System.out.println("Maximum element in the "
		  + "stream is : " + MAX);
		
		List<String> names = Arrays.asList("Ava", "Alberto", "Sarah", "Sam", "Smith");
		 names = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
		  for (String name : names) {
			System.out.println("Names Start with S: " + name);
		  }
		  
		
		  List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		  List<Integer>result=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		  System.out.println("Even Number: " + result);*/
		/*String num="";
		  int arr[]=new int[n];
		  
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
			   num= Integer.toString(arr[i]);
			  System.out.println(+num.length());
		  }
		  
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		 
		  int a = 0, b = 0, c = 1, d;  
		  
		  for(int i=4; i<=n; i++)  
		  {  
			  d = a + b + c;  
			  a = b;  
			  b = c;  
			  c = d;
		  }
		  System.out.println(c); 

		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  
		  int arr[]=new int[n];
		  
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=sc.nextInt();
		  }
		  
		  for (int i = 0; i < arr.length; i++) {
		      int count = 0;
		  
		      for (int j = 0; j <  arr.length; j++) {
		        if (arr[i] == arr[j]) {
		          count++;
		        }
		      }
		  
		      if (count == 1) {
		    	  System.out.println(arr[i]);
		      }
		    }
		   */
		  Object myContainer = new MaxIntegerString();
		//  myContainer.getMyInt();
		  
		  String myString = new String("This is a string!");

		  //System.out.println(myString.toString());
		  
		  //String myString = new String("This is a string!");
		  System.out.println(myString instanceof Object);
    }
	
	  public int myInt = 3;

	    public int getMyInt(){
	        return myInt;
	    }
}
