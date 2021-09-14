package firstProject;
import java.util.Scanner;

public class ScannerExample2 
{
	public static void main(String[] args)
	{
		// 변수 : 사용자 입력 
		Scanner Sc = new Scanner(System.in);
		System.out.print("첫 번째 값을 입력하세요 : ");
		int Num1 = Sc.nextInt();
		System.out.print("두 번째 값을 입력하세요 : ");
		int Num2 = Sc.nextInt();
		System.out.println(Num1 + " + " + Num2 + " = " + (Num1 + Num2));
	}
}
