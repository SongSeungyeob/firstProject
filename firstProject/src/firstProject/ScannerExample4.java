package firstProject;
import java.util.Scanner;

public class ScannerExample4 
{
	public static void main(String[] args)
	{
		int Num1 = 100;
		String Num2 = "100";
		int Num2Int = Integer.parseInt(Num2);
		
		String Num3 = "12.25";
		double Num3db = Double.parseDouble(Num3);
		
		int Result = Num1 + Num2Int;
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ��� : ");
		String Name = Sc.nextLine();
		System.out.println("���̸� �Է��ϼ��� :");
		String Age = Sc.nextLine();
		
		if(Age.equals("")) Age = "0";
		int AgeInt = Integer.parseInt(Age);
		
		System.out.println("����ó�� �Է��ϼ��� :");
		String PNum = Sc.nextLine(); 
		
		System.out.println("[�Է��� ����]");
		System.out.printf("�̸� : %s,\t ���� : %d,\t ����ó : %s\n", Name, AgeInt, PNum);
		System.out.println("��.");
		
	}

}
