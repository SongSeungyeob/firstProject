package firstProject;
// firstProject.ScannerExample �� FullName
import java.util.Scanner;

public class ScannerExample 
{
	public static void main(String[] args)
	{
		/* 
		 * Scanner�� Fullname = java.util.Scanner
		 * = java package�� util package�� ����ִ� Scanner.
		 */
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���...");
		String name = scn.nextLine();
		
		System.out.println("���̸� �Է��ϼ���...");
		int age = scn.nextInt();
		scn.nextLine();
		
		System.out.println("��̸� �Է��ϼ���...");
		String hobby = scn.nextLine();
		
		System.out.println("[�Է��� ��]");
		System.out.printf("�̸� : %s, ���� : %d, ��� : %s\n", name, age, hobby);
	}
}
