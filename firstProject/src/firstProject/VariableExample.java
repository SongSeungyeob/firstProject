package firstProject;

public class VariableExample 
{
	public static void main(String[] args) 
	{
		int number1 = 10; 	// 변수<--> 상수
		number1 = 20;
		number1 = 30;
		System.out.println("결과 : " + number1);
		
		int number3 = 90;
		int result;
		final int number2 = 20;
		result = number1 + number2;
		double result1 = number3 / 11;
		System.out.println("결과값 : " + result);
//		number2 = 30; 
		
	}

}
