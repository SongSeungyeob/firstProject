package control;

public class ForExe 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("[ ��1 ] ================================");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("[ ��2 ] ================================");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("[ ��3 ] ================================");

		int Sum = 0;
		for (int i = 1; i <= 10; i++) {
			Sum += i;
		}
		System.out.println("�հ� : " + Sum);
		System.out.println("[ ��4 ] ================================");
	}
}
