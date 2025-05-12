package com.yash.pms.model;

public class Container {
	/*public Object myValue = new Object();

    public void printMyValue(){
        System.out.println("1 -"+myValue);
    }
	 public int myInt = 3;

	    public int getMyInt(){
	        return myInt;
	    }*/
   
	public int studentId;
    public String studentName;
    public String studentGrade;
    
    public Container(int studentId, String studentName, String studentGrade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    public void viewStudentInfo(){
        //System.out.format("Id: %d, Name: %s, Grade: %s" , studentId, studentName, studentGrade);
    }
    
    public float addition(short a, short b){
        return a + b;
    }
    
    public static void main(String[] args)
    {
    	//Container myMeasure = new Container(); 
    	//System.out.println(myMeasure.addition(2.3, 3.4));
    }
}
