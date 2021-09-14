package firstProject;
// firstProject.ScannerExample 이 FullName
import java.util.Scanner;

public class ScannerExample 
{
	public static void main(String[] args)
	{
		/* 
		 * Scanner의 Fullname = java.util.Scanner
		 * = java package에 util package에 들어있는 Scanner.
		 */
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요...");
		String name = scn.nextLine();
		
		System.out.println("나이를 입력하세요...");
		int age = scn.nextInt();
		scn.nextLine();
		
		System.out.println("취미를 입력하세요...");
		String hobby = scn.nextLine();
		
		System.out.println("[입력한 값]");
		System.out.printf("이름 : %s, 나이 : %d, 취미 : %s\n", name, age, hobby);
	}
}
