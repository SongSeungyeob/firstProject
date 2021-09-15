package control;

public class ConditionExample 
{
	public static void main(String[] args)
	{
		int score = 50;
		if(score >= 60) System.out.println("합격입니다.");
		else System.out.println("불합격입니다.");
		
		/* 
		 * 90점 이상이면 A
		 * 80점 이상이면 B
		 * 70점 이상이면 C
		 * 60점 이상이면 D
		 * 그 외의 점수면 F
		 * */
		
		if(score >= 90) System.out.println("A학점");
		else if(score >= 80) System.out.println("B학점");
		else if(score >= 70) System.out.println("C학점");
		else if(score >= 60) System.out.println("D학점");
		else System.out.println("F학점");
		
		System.out.println("끝.");
	}
}
