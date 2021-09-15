package control;

public class DoWhileExe 
{
	public static void main(String[] args) 
	{
		boolean run = true;
		int Num = 0;
		do {
			Num++;
			System.out.print(Num + " ");
			if(Num == 10) run = false;
		} while(run);
        System.out.println();
		System.out.println("[ 끝 1 ] ================");
		
		Num = 0;
		run = true;
		do {
			Num++;
			if(Num % 2 == 1) {
				continue;
			}
			System.out.print(Num + " ");
			if(Num == 10) break;
		} while(run);
        System.out.println();
		System.out.println("[ 끝 2 ] ================");
		
		int Sum = 0;
		Num = 0;
		run = true;
		do {
			Num++;
			if(Num >= 10)  {
				break;
			}
			if(Num % 2 == 0) {
				continue;
			}
			Sum += Num;
		} while(run);
		
		System.out.println("홀수들의 합 = " + Sum);
		System.out.println("[ 끝 3 ] ================");
		
		Sum = 0;
		int Cnt = 0;
		while(true) {
			int RandomNum = (int)(Math.random() * 10) + 1;
			Sum += RandomNum;
			Cnt++;
			if(Sum >= 100) { 
				break;
			}
		}
		System.out.println(Sum + " 은(는) " + Cnt + "번 만에 만들어졌습니다.");
		System.out.println("[ 끝 4 ] ================");
	}

}
