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
		
		System.out.println("=======다시1=======");
		cnt = 0;
		for(int i = 1 ; i <= 10; i += 2) {
			cnt += 1;
			System.out.printf("Cnt : %d\n", cnt);
		}
		System.out.println("반복문 끝.");
		System.out.println("===================");
		
		System.out.println("=======다시2=======");
		/* Math.random() * 10 = 0 ~ 9 까지의 숫자, + 1을 붙이면 1 ~ 10 까지의 숫자. */
		
		int tempValue = 0;
		for(int i = 1; i <= 5; i++) {
			tempValue += (int)(Math.random() * 10) + 1;
			System.out.printf("%d번째 값 = %d\n", i , tempValue);
		}
		System.out.println("Sum : " + tempValue);
		System.out.println("반복문 끝.");
		System.out.println("===================");
	}
}
