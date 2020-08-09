package Calc;

public class Calculator {

	public int calcdouble(int num)throws MyArithException
	{
		if(num==0) {
			throw new MyArithException("Zero not allowed");
		}
		else if(num<0) {
			throw new MyArithException("Negative not allowed");
		}
		else {
			return num*2;
		}
	}

}
