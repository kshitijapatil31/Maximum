package com.bridgelabz.maximumproblem;

public class MaximumProblem {

	public static void main(String[] args) {

		Float x1=new Float(22.3);
		Float x2=new Float(55.2);
		Float x3=new Float (11.3);
		
		if(x1.compareTo(x2)>0&&x1.compareTo(x3)>0) {
			System.out.println("maximum no is : "+x1);
		}else if(x2.compareTo(x1)>0&&x2.compareTo(x3)>0) {
			System.out.println("maximum no is : "+x2);
		}else if(x3.compareTo(x1)>0&& x3.compareTo(x2)>0) {
			System.out.println("maximum no is : "+x3);
		}
	}
}





