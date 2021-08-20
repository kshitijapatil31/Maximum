package com.bridgelabz.maximumproblem;

public class MaximumProblem <T extends Comparable>{

	T x1,x2,x3;
	
	MaximumProblem(T x1,T x2,T x3){
		
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
	}
	public T testMaximum() {
		return MaximumProblem.testMaximum(x1, x2, x3);
		
	}
	public static <T extends Comparable> T testMaximum(T x1, T x2,T x3){
	T max=x1;
		if(x1.compareTo(x2)>0&&x1.compareTo(x3)>0) {
			max=x1;
		}else if(x2.compareTo(x1)>0&&x2.compareTo(x3)>0) {
			max=x2;
		}else if(x3.compareTo(x1)>0&& x3.compareTo(x2)>0) {
			max=x3;
		}
		System.out.println("maximum is : "+max);
		return max;
		
	}
	
	public static void main(String[] args) {

		Integer i1=10,i2=25,i3=63;
		Float f1=77.7f,f2=63.2f,f3=52.2f;
		String x1="apple",x2="peach",x3="banana";
		
		new MaximumProblem(i1,i2,i3).testMaximum();
		new MaximumProblem(f1,f2,f3).testMaximum();
		new MaximumProblem(x1,x2,x3).testMaximum();
		
		
	}
}





