package firstProject;
import java.util.Scanner;

public class ScannerExample3 
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int English_Score = Sc.nextInt();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int Math_Score = Sc.nextInt();
		Sc.nextLine();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String Name = Sc.nextLine();
		
		int Sum = English_Score + Math_Score;
		double Avg = (double)Sum / 2;
		System.out.printf("%s���� ����, ���������� ���� %d, ����� %.1f �Դϴ�\n", Name, Sum, Avg);
		
		if(Sum >= 120) System.out.println(Name + "���� �հ��Դϴ�.");
		else System.out.println(Name + "���� ���հ��Դϴ�.");
		
	}
}
