package reference;

public class ForExample {

	public static void main(String[] args) 
	{
		for(int i = 1 ; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("[ �� 1 ] ===============");
		
		for(int i = 1; i <= 10 ;i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("[ �� 2 ] ===============");
		
		int Sum = 0;
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 1) {
				Sum += i;
			}
		}
		System.out.println("Ȧ������ �հ� = " + Sum);
		System.out.println("[ �� 3 ] ===============");
		
		Sum = 0;
		int Cnt = 0;	// Ƚ���� �޾ƿͼ� ����ϴ� �뵵.

		for(int i = 0; i <= 10; i++) {
			Sum += i;
			if(Sum >= 20) {
				Cnt = i;
				break;
			}
		}
		System.out.println("Ƚ�� : " + Cnt);
		System.out.println("[ �� 4 ] ===============");
		
		
	}

}
