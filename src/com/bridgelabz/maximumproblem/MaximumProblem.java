package com.bridgelabz.maximumproblem;

public class MaximumProblem {

	public static void main(String[] args) {

		String x1=new String("rohan");
		String x2=new String("sachin");
		String x3=new String("rohan");

		
		if(x1.compareTo(x2)>0&&x1.compareTo(x3)>0) {
			System.out.println("maximum String is : "+x1);
		}else if(x2.compareTo(x1)>0&&x2.compareTo(x3)>0) {
			System.out.println("maximum String is : "+x2);
		}else if(x3.compareTo(x1)>0&& x3.compareTo(x2)>0) {
			System.out.println("maximum String is : "+x3);
		}
	}
}





