package firstProject;

public class StringExample2
{
	public static void main(String[] args)
	{
		String name = "�۽¿�";
		int age = 25;
		System.out.println("�̸��� " + name + ", ���̴� " + age);
		System.out.printf("�̸��� %s, ���̴� %d\n", name, age);
		
		byte b1 = -90;
		byte b2 = 10;
		byte result = (byte)(b1 + b2);
		System.out.println(b1 + " + " + b2 + " = " + result);
		System.out.printf("%d + %d = %d\n", b1, b2, result);
				
		// �� �Ǵ� ������ ���� �� �ִ� ���� isLarger ����.
		boolean isLarger = result > 0;
		
		if(isLarger) System.out.println("����Դϴ�.");
		else System.out.println("�����Դϴ�.");
		
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
