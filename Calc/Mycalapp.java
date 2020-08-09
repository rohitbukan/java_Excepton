package Calc;
public class Mycalapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		int result=0;
		try {
			result=c.calcdouble(-5);
			
			System.out.println(result);
			
		}
		catch(MyArithException message) {
			System.out.println(message);
		}
		

	}

}
