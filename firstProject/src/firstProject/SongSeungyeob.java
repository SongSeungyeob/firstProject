package firstProject;
import java.util.Scanner;

public class SongSeungyeob 
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("[ 3���� ���ڸ� �Է¹ް� �հ� ��� ���ϱ� ]");
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int Num1 = Sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int Num2 = Sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int Num3 = Sc.nextInt(); Sc.nextLine();
		
		int Sum = Num1 + Num2 + Num3;
		double Avg = (double)Sum / 3;
		System.out.printf("3���� ������ �� = %d �̰� ����� %.2f �Դϴ�.\n\n", Sum, Avg);
		
		System.out.println("[ 2���� ���ڿ��� �Է¹ް� ������ Ȯ���ϱ� ]");
		System.out.print("ù ��° ���ڿ��� �Է��ϼ��� : ");
		String Str1 = Sc.nextLine();
		System.out.print("�� ��° ���ڿ��� �Է��ϼ��� : ");
		String Str2 = Sc.nextLine();
		
		if(Str1.equals(Str2)) System.out.println("2���� ���ڿ��� ������ ���ڿ��Դϴ�.");
		else System.out.println("2���� ���ڿ��� ���� �ٸ� ���ڿ� �Դϴ�.");
	}
}
