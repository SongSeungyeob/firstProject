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
		System.out.println("이름을 입력하세요 : ");
		String Name = Sc.nextLine();
		System.out.println("나이를 입력하세요 :");
		String Age = Sc.nextLine();
		
		if(Age.equals("")) Age = "0";
		int AgeInt = Integer.parseInt(Age);
		
		System.out.println("연락처를 입력하세요 :");
		String PNum = Sc.nextLine(); 
		
		System.out.println("[입력한 내용]");
		System.out.printf("이름 : %s,\t 나이 : %d,\t 연락처 : %s\n", Name, AgeInt, PNum);
		System.out.println("끝.");
		
	}

}
