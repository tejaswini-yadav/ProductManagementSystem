package com.yash.pms.test;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test[]=null;
		String newTest[]=null;
		String line="";
		String newWord="";
		ArrayList<String> words = new ArrayList<String>(); 
		FileReader f;
		try {
			
		f = new FileReader("D://SLB/test.txt");
		
		BufferedReader br=new BufferedReader(f);
		while((line=br.readLine()) != null){
			test=line.toLowerCase().split(" ");
			for(String newTests:test)
				words.add(newTests);
			
		int count=0;
		for(int i=0;i<words.size();i++)
		{
			count=1;
			for(int j=i+1;j<words.size();j++) {
				
				if(words.get(i).equals(words.get(j)))
					count++;
			}
			if(count>0)
			{
				newWord = words.get(i); 
			}
		}
		System.out.println("Most repeated word: " + newWord);
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
