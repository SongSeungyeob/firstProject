package firstProject;

public class CharExample {

	public static void main(String[] args) 
	{
		/*
		 * 1byte < char , short(2byte) < int(4byte)
		 * 1byte = 8bit = 256가지 숫자 표현 가능. (-128 ~ 127)
		 * short = 2byte = 16bit (-32768 ~ 32767)
		 * int = 4byte = 32bit (-21억 ~ 21억)
		 */
		char myFirstCharType = 97;
		System.out.println(myFirstCharType);
		byte b1 = 10;
		b1 = 127;
		b1++;
		System.out.println(b1);
		
		short s1 = 0;
		short result = (short)(b1 + s1);
		// 기본 연산을 하는 순간 기본적으로 자료형이 int형으로 바뀌게 된다.
		// 따라서, short에 int형의 결과를 담을 수가 없다.
		System.out.println(Short.MAX_VALUE);
		
		long fakeLong = 2147483648L;
	
	}
}
