package com.yash.pms.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ReadFile2 {
	
	public static void main(String[] args) {
		FileReader f;
		String line="";
		String test[]=null;
		 Map<String,Integer> mp=null;
		 int count=0;
		 int lines=0;
		try {
			
			f = new FileReader("D://SLB/test.txt");
			
			BufferedReader br=new BufferedReader(f);
			while((line=br.readLine()) != null){
				test=line.toLowerCase().split(" ");
				mp=new HashMap<>();;
				lines++;
				for(int i=0;i<test.length;i++)
		        {
		            // Condition to check if the
		            // array element is present
		            // the hash-map
		            if(mp.containsKey(test[i]))
		            {
		                mp.put(test[i], mp.get(test[i])+1);
		            }
		            else
		            {
		                mp.put(test[i],1);
		            }
		        }
				for(Map.Entry<String,Integer> entry:
                    mp.entrySet())
		        {
					count=0;
					if(entry.getValue()>1) {
						System.out.println(entry.getKey()+
		                    " - "+entry.getValue());
						count++;
					}			
		        }
				if(count==0)					
				{
						System.out.println("Not present in line "+lines);
				}
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
