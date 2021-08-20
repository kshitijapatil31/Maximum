package com.bridgelabz.maximumproblem;

public class MaximumProblem <T extends Comparable>{

	T x1,x2,x3,x4;
	
	
	MaximumProblem(T x1,T x2,T x3,T x4){
		
		this.x1=x1;
		this.x2=x2;
		this.x3=x3;
		this.x4=x4;
	}
	public T testMaximum() {
		return MaximumProblem.testMaximum(x1, x2, x3,x4);
		
	}
	public static <T extends Comparable> T testMaximum(T x1, T x2,T x3,T x4){
	T max=x1;
		if(x1.compareTo(x2)>0&&x1.compareTo(x3)>0&&x1.compareTo(x4)>0) {
			max=x1;
		}else if(x2.compareTo(x1)>0&&x2.compareTo(x3)>0&&x2.compareTo(x4)>0) {
			max=x2;
		}else if(x3.compareTo(x1)>0&& x3.compareTo(x2)>0&&x3.compareTo(x4)>0) {
			max=x3;
		}else if(x4.compareTo(x1)>0&& x4.compareTo(x2)>0&&x4.compareTo(x3)>0) {
			max=x4;
		}
		System.out.println("maximum is : "+max);
		return max;
		
	}
	
	public static void main(String[] args) {

		Integer i1=10,i2=25,i3=63,i4=5;
		Float f1=77.7f,f2=63.2f,f3=52.2f,f4=59.3f;
		String a1="apple",a2="peach",a3="banana",a4="strawberry";
		
		new MaximumProblem(i1,i2,i3,i4).testMaximum();
		new MaximumProblem(f1,f2,f3,f4).testMaximum();
		new MaximumProblem(a1,a2,a3,a4).testMaximum();
		
		
	}
}





