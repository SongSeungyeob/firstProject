package operator;

public class OperatorExample2 
{
	public static void main(String[] args) 
	{
		int num1, num2, result;
		num1 = num2 = 10;
		result = num1 + num2;
		result = result + 10;
		result += 10; // result = result + 10;
		result -= 10; // result = result - 10;
		result *= 10; // result = result * 10;
		result /= 10; // result = result / 10;
		result %= 10; // result = result % 10;

		String str = "Hello";
		str = str + " World";
		str += " Welcome";
		System.out.println(str);

		// 3항 연산자. [ 조건문 ? 참 : 거짓 ]
		int score = 80;
		boolean pass = (score > 60) ? true : false;
		String pass_Str = (score > 60) ? "Pass" : "Fail";
	}
}
