package firstProject;

public class StringExample2
{
	public static void main(String[] args)
	{
		String name = "송승엽";
		int age = 25;
		System.out.println("이름은 " + name + ", 나이는 " + age);
		System.out.printf("이름은 %s, 나이는 %d\n", name, age);
		
		byte b1 = -90;
		byte b2 = 10;
		byte result = (byte)(b1 + b2);
		System.out.println(b1 + " + " + b2 + " = " + result);
		System.out.printf("%d + %d = %d\n", b1, b2, result);
				
		// 참 또는 거짓을 담을 수 있는 변수 isLarger 선언.
		boolean isLarger = result > 0;
		
		if(isLarger) System.out.println("양수입니다.");
		else System.out.println("음수입니다.");
		
		long Number = 2200000000L;
		int Number2 = 120;
		int Number3 = 16;
		double Avg = (double)Number2 / Number3;
		System.out.println(Avg);
		
		long Result = Number + Number2 + Number3;
		double Avg2 = Result / 3;
		System.out.println(Avg2);
		
	}
}
