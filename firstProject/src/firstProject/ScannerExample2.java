package firstProject;
import java.util.Scanner;

public class ScannerExample2 
{
	public static void main(String[] args)
	{
		// ���� : ����� �Է� 
		Scanner Sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է��ϼ��� : ");
		int Num1 = Sc.nextInt();
		System.out.print("�� ��° ���� �Է��ϼ��� : ");
		int Num2 = Sc.nextInt();
		System.out.println(Num1 + " + " + Num2 + " = " + (Num1 + Num2));
	}
}
