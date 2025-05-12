package com.yash.pms.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {


	public static void main(String[] args) {
		/*Map<String, Integer> pList=null ;
		Map<String, BigDecimal> copayList=null ;

		String psgDescs="10027,10027,10014,10014,10027";
		String psgDescss=String.valueOf("10008,10027,10014,10027,10014");
		BigDecimal max=new BigDecimal(50);
		BigDecimal min=new BigDecimal(10);
		BigDecimal copay=new BigDecimal(10);
		BigDecimal proportionate=null;
		BigDecimal proportionatechk=new BigDecimal(0);
		BigDecimal proportionate1=new BigDecimal(0);
		BigDecimal billLevelAmt=new BigDecimal(0);
		BigDecimal servieAmount=new BigDecimal(250);
		int servCnt=0;
		int rowCnt=1;
		BigDecimal copayVariable=new BigDecimal(0);

	try {	
		 pList = new HashMap<>();
		 copayList = new HashMap<>();
		String[] diagCodeArray = psgDescs.split(",");

		List<String> list = Arrays.asList(diagCodeArray);
		//Set<String> set = new HashSet<String>(list);
		
		for(String str : list)
		{
			pList.put(str, Collections.frequency(list, str));
		}
		System.out.println("Map>> "+pList);
		billLevelAmt=servieAmount.divide(new BigDecimal(100)).multiply(copay);
		System.out.println("CopayAmt>> "+billLevelAmt);
		servCnt=pList.get("10027");
		proportionate=billLevelAmt;
		copayList.put("10027", proportionate);

		//service.setPayerAmount(service.getPayerAmount().subtract(proportionate));
		//service.setPatientAmount(service.getPatientAmount().add(proportionate));
		for(int i=0;i<servCnt-1;i++) {
			System.out.println("proportionate1>> "+proportionate);
			rowCnt++;
			if(copayList.containsKey("10027")) {
				if(copayVariable.compareTo(max)==0) {
					proportionate=new BigDecimal(0);
					//copayList.put("10027", proportionate);

				}
				copayVariable=copayList.get("10027").add(proportionate);
				System.out.println("CopayAmt>> "+copayVariable);
				copayList.put("10027", copayVariable);
				
				if(copayVariable.compareTo(max)>0)
				{
					proportionatechk=copayVariable.subtract(max);
					System.out.println("proportionatechk>> "+proportionatechk);
					proportionate1=proportionate.subtract(proportionatechk);
					System.out.println("proportionate2>> "+proportionate1);
					copayVariable=copayVariable.subtract(proportionatechk);
					System.out.println("copayVariable>> "+copayVariable);
					
					copayList.put("10027", copayVariable);
					System.out.println("copayList>> "+copayList.get("10027"));
				}
				if(copayVariable.compareTo(min)<0 && servCnt==rowCnt)
				{
					proportionatechk=min.subtract(copayVariable);
					System.out.println("proportionatechk>> "+proportionatechk);
					proportionate1=proportionate.add(proportionatechk);
					System.out.println("proportionate2>> "+proportionate1);
					copayVariable=copayVariable.add(proportionatechk);
					System.out.println("copayVariable>> "+copayVariable);
					copayList.put("10027", copayVariable);
					System.out.println("copayList>> "+copayList.get("10027"));
				}
				System.out.println(i+" 10027 "+proportionate);

			}
		}

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}*/
		
		String s[] = "My name is Vishwendra and I am a backend developer".split(" "); 
	      String ans = ""; 
	      char ch;
	      /*for (int i = s.length - 1; i >= 0; i--) { 
	        ans += s[i] + " "; 
	      } */
	      for(int i=0;i<s.length; i++)
	      {
	    	  if(s[i].length()>5) {
	    		  ans=" ";
	    	  for(int j=0;j<s[i].length(); j++)
	    	  {
	    		  ch=s[i].charAt(j);
	    		  ans=ch+ans;
	    	  }
	    	  }
	    	  else {
	    		  ans=s[i]+" ";
	    	  }
		      System.out.print(ans);
 
	      }
	      //System.out.println("Reversed String: " + ans);
	}
	
}
