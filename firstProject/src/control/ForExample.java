package control;

public class ForExample 
{
	public static void main(String[] args) 
	{
		int cnt = 0;
		cnt += 1;
		System.out.printf("Cnt : %d\n", cnt);
		cnt += 1;
		System.out.printf("Cnt : %d\n", cnt);		
		cnt += 1;
		System.out.printf("Cnt : %d\n", cnt);		
		cnt += 1;
		System.out.printf("Cnt : %d\n", cnt);
		
		System.out.println("=======�ٽ�1=======");
		cnt = 0;
		for(int i = 1 ; i <= 10; i += 2) {
			cnt += 1;
			System.out.printf("Cnt : %d\n", cnt);
		}
		System.out.println("�ݺ��� ��.");
		System.out.println("===================");
		
		System.out.println("=======�ٽ�2=======");
		/* Math.random() * 10 = 0 ~ 9 ������ ����, + 1�� ���̸� 1 ~ 10 ������ ����. */
		
		int tempValue = 0;
		for(int i = 1; i <= 5; i++) {
			tempValue += (int)(Math.random() * 10) + 1;
			System.out.printf("%d��° �� = %d\n", i , tempValue);
		}
		System.out.println("Sum : " + tempValue);
		System.out.println("�ݺ��� ��.");
		System.out.println("===================");
	}
}
