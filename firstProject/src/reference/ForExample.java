package reference;

public class ForExample {

	public static void main(String[] args) 
	{
		for(int i = 1 ; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("[ 끝 1 ] ===============");
		
		for(int i = 1; i <= 10 ;i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("[ 끝 2 ] ===============");
		
		int Sum = 0;
		for(int i = 1; i<=10; i++) {
			if(i % 2 == 1) {
				Sum += i;
			}
		}
		System.out.println("홀수들의 합계 = " + Sum);
		System.out.println("[ 끝 3 ] ===============");
		
		Sum = 0;
		int Cnt = 0;	// 횟수를 받아와서 출력하는 용도.

		for(int i = 0; i <= 10; i++) {
			Sum += i;
			if(Sum >= 20) {
				Cnt = i;
				break;
			}
		}
		System.out.println("횟수 : " + Cnt);
		System.out.println("[ 끝 4 ] ===============");
		
		
	}

}
