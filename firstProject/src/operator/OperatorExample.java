package operator;

public class OperatorExample 
{
	public static void main(String[] args)
	{
		int num1, num2, result;
		num1 = 10;
		num2 = 5;
		result = num1 * num2; 
		
		// -50;
		result = -result;
		System.out.printf("- 연산결과 : %d\n", result);
		
		// 10 % 3 = 1
		result = num1 % 3;
		System.out.printf("Moduler 연산결과 : %d\n", result);
		
		// 1010 & 0101 = 0000
		result = num1 & num2;
		System.out.printf("& 연산결과 : %d\n", result);
		
		// 1010 | 0101 = 1111
		result = num1 | num2;
		System.out.printf("| 연산결과 : %d\n", result);
		
		// 1010 ^ 0101 = 1111
		result = num1 ^ num2;
		System.out.printf("^ 연산결과 : %d\n", result);
		
		//10 = 0000 1010 -> 1의보수 = 1111 0101 -> +1 = 1111 0110
		result = ~num1;
		System.out.printf("~ 연산결과 : %d\n", result);
		
		// 10 = 1010 : >>2 = 0010  : 비트연산자.
		result = num1 >> 2;
		System.out.printf(">>2 연산결과 : %d\n", result);
		
		boolean b1 = false;
		boolean b2 = !b1;
		boolean b3 = b1 && b2;
		System.out.printf("b3 : %s, b1 : %s, b2 : %s", b3, b1, b2);
	}

}
