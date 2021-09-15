package control;

import java.util.Scanner;

public class SongSenungYeob 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		boolean Calculator = true;
		System.out.println("========== [ 비트 연산자 계산기 ] ========== ");

		while (Calculator) {
			System.out.print("계산에 사용할 첫 번째 숫자를 입력하세요 : ");
			int Num1 = Sc.nextInt();
			System.out.print("계산에 사용할 두 번째 숫자를 입력하세요 : ");
			int Num2 = Sc.nextInt();
			int Oper;
			do {
				System.out.println("2개의 숫자를 연산할 연산자를 고르세요.");
				System.out.println("1.>> 2.<< 3.~ 4.^ 5.& 6.|");
				Oper = Sc.nextInt();
				if (1 <= Oper && Oper <= 6)
					break;
				System.out.println("[ Error : 잘못된 연산자 입력입니다 ]");
			} while (true);

			int Shift = 0;
			if (Oper == 1 || Oper == 2) {
				System.out.print("Shift할 칸 수를 입력해 주세요 : ");
				Shift = Sc.nextInt();
			}

			switch (Oper) {
			case 1:
				System.out.printf("%d 를 오른쪽으로 %d 칸 Shift 한 결과 = %d\n", Num1, Shift, Num1 >> Shift);
				System.out.printf("%d 를 오른쪽으로 %d 칸 Shift 한 결과 = %d\n", Num2, Shift, Num2 >> Shift);
				break;
			case 2:
				System.out.printf("%d 를 왼쪽으로 %d 칸 Shift 한 결과 = %d\n", Num1, Shift, Num1 << Shift);
				System.out.printf("%d 를 왼쪽으로 %d 칸 Shift 한 결과 = %d\n", Num2, Shift, Num2 << Shift);
				break;
			case 3:
				System.out.printf("%d 를 NOT 한 결과 = %d", Num1, ~Num1);
				System.out.printf("%d 를 NOT 한 결과 = %d", Num2, ~Num2);
				break;
			case 4:
				System.out.printf("%d ^ %d = %d 입니다.\n", Num1, Num2, Num1 ^ Num2);
				break;
			case 5:
				System.out.printf("%d & %d = %d 입니다.\n", Num1, Num2, Num1 & Num2);
				break;
			case 6:
				System.out.printf("%d | %d = %d 입니다.\n", Num1, Num2, Num1 | Num2);
				break;
			default:
				System.out.println("올바르지 않은 연산자 선택입니다. 다시 처음으로 돌아가겠습니다.");
				break;
			}

			do {
				System.out.print("계산기 사용을 종료하시려면 '0'번을, 계속 사용하시려면 '1'번을 눌러주세요 : ");
				int Use = Sc.nextInt();
				if (Use == 0) {
					System.out.println("계산기 사용을 종료합니다.");
					Calculator = false;
					break;
				} else if (Use == 1) {
					System.out.println("계산기 사용을 이어 가겠습니다.");
					break;
				} else {
					System.out.println("[ Error : 잘못된 입력입니다 ]");
				}
			} while (true);
		}
	}
}
