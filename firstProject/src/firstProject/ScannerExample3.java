package firstProject;
import java.util.Scanner;

public class ScannerExample3 
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("영어 점수를 입력하세요 : ");
		int English_Score = Sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int Math_Score = Sc.nextInt();
		Sc.nextLine();
		
		System.out.print("이름을 입력하세요 : ");
		String Name = Sc.nextLine();
		
		int Sum = English_Score + Math_Score;
		double Avg = (double)Sum / 2;
		System.out.printf("%s님의 영어, 수학점수의 합은 %d, 평균은 %.1f 입니다\n", Name, Sum, Avg);
		
		if(Sum >= 120) System.out.println(Name + "님은 합격입니다.");
		else System.out.println(Name + "님은 불합격입니다.");
		
	}
}
