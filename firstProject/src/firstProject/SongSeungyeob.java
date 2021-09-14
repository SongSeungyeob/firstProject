package firstProject;
import java.util.Scanner;

public class SongSeungyeob 
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("[ 3개의 숫자를 입력받고 합과 평균 구하기 ]");
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int Num1 = Sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int Num2 = Sc.nextInt();
		System.out.print("세 번째 숫자를 입력하세요 : ");
		int Num3 = Sc.nextInt(); Sc.nextLine();
		
		int Sum = Num1 + Num2 + Num3;
		double Avg = (double)Sum / 3;
		System.out.printf("3개의 숫자의 합 = %d 이고 평균은 %.2f 입니다.\n\n", Sum, Avg);
		
		System.out.println("[ 2개의 문자열을 입력받고 같은지 확인하기 ]");
		System.out.print("첫 번째 문자열을 입력하세요 : ");
		String Str1 = Sc.nextLine();
		System.out.print("두 번째 문자열을 입력하세요 : ");
		String Str2 = Sc.nextLine();
		
		if(Str1.equals(Str2)) System.out.println("2개의 문자열은 동일한 문자열입니다.");
		else System.out.println("2개의 문자열은 서로 다른 문자열 입니다.");
	}
}
