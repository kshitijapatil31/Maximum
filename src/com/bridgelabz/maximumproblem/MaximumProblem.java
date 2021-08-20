package com.bridgelabz.maximumproblem;

public class MaximumProblem {

	MaximumProblem(){
		
	}
	public static <T extends Comparable> void maximum(T x1, T x2,T x3){
	
		if(x1.compareTo(x2)>0&&x1.compareTo(x3)>0) {
			System.out.println("maximum is : "+x1);
		}else if(x2.compareTo(x1)>0&&x2.compareTo(x3)>0) {
			System.out.println("maximum is : "+x2);
		}else if(x3.compareTo(x1)>0&& x3.compareTo(x2)>0) {
			System.out.println("maximum is : "+x3);
		}
		
		
	}
	
	public static void main(String[] args) {

		Integer i1=10,i2=25,i3=63;
		Float f1=77.7f,f2=63.2f,f3=52.2f;
		String x1="apple",x2="peach",x3="banana";
		
		maximum(i1,i2,i3);
		maximum(f1,f2,f3);
		maximum(x1,x2,x3);
		
		
	}
}





