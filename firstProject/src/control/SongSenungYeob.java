package control;

import java.util.Scanner;

public class SongSenungYeob 
{
	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in);
		boolean Calculator = true;
		System.out.println("========== [ ��Ʈ ������ ���� ] ========== ");

		while (Calculator) {
			System.out.print("��꿡 ����� ù ��° ���ڸ� �Է��ϼ��� : ");
			int Num1 = Sc.nextInt();
			System.out.print("��꿡 ����� �� ��° ���ڸ� �Է��ϼ��� : ");
			int Num2 = Sc.nextInt();
			int Oper;
			do {
				System.out.println("2���� ���ڸ� ������ �����ڸ� ������.");
				System.out.println("1.>> 2.<< 3.~ 4.^ 5.& 6.|");
				Oper = Sc.nextInt();
				if (1 <= Oper && Oper <= 6)
					break;
				System.out.println("[ Error : �߸��� ������ �Է��Դϴ� ]");
			} while (true);

			int Shift = 0;
			if (Oper == 1 || Oper == 2) {
				System.out.print("Shift�� ĭ ���� �Է��� �ּ��� : ");
				Shift = Sc.nextInt();
			}

			switch (Oper) {
			case 1:
				System.out.printf("%d �� ���������� %d ĭ Shift �� ��� = %d\n", Num1, Shift, Num1 >> Shift);
				System.out.printf("%d �� ���������� %d ĭ Shift �� ��� = %d\n", Num2, Shift, Num2 >> Shift);
				break;
			case 2:
				System.out.printf("%d �� �������� %d ĭ Shift �� ��� = %d\n", Num1, Shift, Num1 << Shift);
				System.out.printf("%d �� �������� %d ĭ Shift �� ��� = %d\n", Num2, Shift, Num2 << Shift);
				break;
			case 3:
				System.out.printf("%d �� NOT �� ��� = %d", Num1, ~Num1);
				System.out.printf("%d �� NOT �� ��� = %d", Num2, ~Num2);
				break;
			case 4:
				System.out.printf("%d ^ %d = %d �Դϴ�.\n", Num1, Num2, Num1 ^ Num2);
				break;
			case 5:
				System.out.printf("%d & %d = %d �Դϴ�.\n", Num1, Num2, Num1 & Num2);
				break;
			case 6:
				System.out.printf("%d | %d = %d �Դϴ�.\n", Num1, Num2, Num1 | Num2);
				break;
			default:
				System.out.println("�ùٸ��� ���� ������ �����Դϴ�. �ٽ� ó������ ���ư��ڽ��ϴ�.");
				break;
			}

			do {
				System.out.print("���� ����� �����Ͻ÷��� '0'����, ��� ����Ͻ÷��� '1'���� �����ּ��� : ");
				int Use = Sc.nextInt();
				if (Use == 0) {
					System.out.println("���� ����� �����մϴ�.");
					Calculator = false;
					break;
				} else if (Use == 1) {
					System.out.println("���� ����� �̾� ���ڽ��ϴ�.");
					break;
				} else {
					System.out.println("[ Error : �߸��� �Է��Դϴ� ]");
				}
			} while (true);
		}
	}
}
