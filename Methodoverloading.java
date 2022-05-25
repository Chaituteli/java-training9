package com.vstl.polymorphisam;

public class Methodoverloading {
	
	
	public void string() {
		String strName="chaitali";
		String strLastName="Teli";
	    String strFullName=strName+strLastName;
	    System.out.println("Full name of student:"+strFullName);
	}
	
	public void string(int inttheorymarks,int intpracticalMarks) {
		int totalMarks;
		totalMarks=inttheorymarks+intpracticalMarks;
		System.out.println("total of theory and practical Marks:"+totalMarks);
	}
	
	public void string(int intsciencemarks,double douhistoryMarks) {
		double totalpercentage;
		 totalpercentage= intsciencemarks*douhistoryMarks;
		System.out.println("total of calculation:"+  totalpercentage);
	}
	
	public void string(boolean pass) {
		boolean Remark = true;
		System.out.println("student Remark:"+ Remark);
	}
	
	}
