package control;

public class WhileExe 
{
	public static void main(String[] args) 
	{
		/* while 구문을 사용해서 1 ~ 10까지 출력 */
		int Num = 1;
		while(Num <= 10) {
			System.out.print(Num + " ");
			Num++;
		}
		System.out.println();
		System.out.println("[ 끝1 ] ====================");
		
		/* while 구문을 사용해서, 1 ~ 10중 짝수 출력 */
		Num = 1;
		while(Num <= 10) {
			if(Num % 2 == 0) {
				System.out.print(Num + " ");
			}
			Num++;
		}
		System.out.println();
		System.out.println("[ 끝2 ] ====================");
		
		Num = 1;
		while(Num <= 10) {
			if(Num % 2 == 1) {
				System.out.print(Num + " ");
			}
			Num++;
		}
		System.out.println();
		System.out.println("[ 끝3 ] ====================");
		
		Num = 1;
		int Sum = 0;
		while(Num <= 10) {
			Sum += Num;
			Num++;
		}
		System.out.println("합계 : " + Sum);
		System.out.println("[ 끝4 ] ====================");
	}
}
