package control;

public class WhileExe 
{
	public static void main(String[] args) 
	{
		/* while ������ ����ؼ� 1 ~ 10���� ��� */
		int Num = 1;
		while(Num <= 10) {
			System.out.print(Num + " ");
			Num++;
		}
		System.out.println();
		System.out.println("[ ��1 ] ====================");
		
		/* while ������ ����ؼ�, 1 ~ 10�� ¦�� ��� */
		Num = 1;
		while(Num <= 10) {
			if(Num % 2 == 0) {
				System.out.print(Num + " ");
			}
			Num++;
		}
		System.out.println();
		System.out.println("[ ��2 ] ====================");
		
		Num = 1;
		while(Num <= 10) {
			if(Num % 2 == 1) {
				System.out.print(Num + " ");
			}
			Num++;
		}
		System.out.println();
		System.out.println("[ ��3 ] ====================");
		
		Num = 1;
		int Sum = 0;
		while(Num <= 10) {
			Sum += Num;
			Num++;
		}
		System.out.println("�հ� : " + Sum);
		System.out.println("[ ��4 ] ====================");
	}
}
