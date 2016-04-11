package simpletest;

public class Simcalc {
	private int result=0;
	
	public void add(int a,int b){
		result= a+b;
	}
	public void sub(int a,int b){
		result= a-b;
	}

	public void mul(int a,int b){
		result= a*b;
	}


	public void div(int a,int b){
		if (b!=0)
			result= a/b;
		else
			System.out.println("분모가 0입니다");
	}

	public int getResult(){
		return result;
	}
	
}
