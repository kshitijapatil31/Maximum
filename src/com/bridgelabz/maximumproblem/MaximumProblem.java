package com.bridgelabz.maximumproblem;

public class MaximumProblem {

	public static void main(String[] args) {
		Integer x1=new Integer(22);
		Integer x2=new Integer(33);
		Integer x3=new Integer (5);
		
		if(x1.compareTo(x2)>0&&x1.compareTo(x3)>0) {
			System.out.println("maximum no is : "+x1);
		}else if(x2.compareTo(x1)>0&&x2.compareTo(x3)>0) {
			System.out.println("maximum no is : "+x2);
		}else if(x3.compareTo(x1)>0&& x3.compareTo(x2)>0) {
			System.out.println("maximum no is : "+x3);
		}
	}
}




