package control;

public class ConditionExe 
{
	public static void main(String[] args)
	{
//		/*
//		 * * 2개의 정수형 변수를 선언해서 60 , 70을 담는다. 2개의 수를 합한 결과가 100점이 넘으면 합격, 아니면 불합격
//		 */
//		int Num1 = 60;
//		int Num2 = 70;
//		int Sum = Num1 + Num2;
//
//		if (Sum >= 100)
//			System.out.println("합격");
//		else
//			System.out.println("불합격");
//		System.out.println("첫번째 끝.");
//
//		/*
//		 * * 2개의 수를 곱해서 짝수이면 짝수인지 판단.
//		 */
//		int Multiple = Num1 * Num2;
//		if (Multiple % 2 == 0)
//			System.out.println("짝수입니다.");
//		else
//			System.out.println("홀수입니다.");
//		System.out.println("두번째 끝.");
//
//		/*
//		 * * Num1 을 10으로 나눈 결과값이 2의 배수이면 2의 배수라고, 3의 배수이면 3의 배수라고 출력 2와 3의 공배수이면, 2의 배수,
//		 * 3의배수 입니다.
//		 */
//		Num1 /= 10;
//		if (Num1 % 2 == 0 && Num1 % 3 == 0) {
//			System.out.println("2와 3의 공배수 입니다.");
//		} else if (Num1 % 2 == 0) {
//			System.out.println("2의 배수입니다.");
//		} else if (Num1 % 3 == 0) {
//			System.out.println("3의배수입니다.");
//		} else {
//			System.out.println("2의 배수도, 3의 배수도 아닙니다.");
//		}
//
//		int Num3 = 9;
//		if (Num3 % 2 == 0 && Num3 % 3 == 0) {
//			System.out.println("2와 3의 공배수입니다.");
//		} else if (Num3 % 2 == 0) {
//			System.out.println("2의 배수입니다.");
//		} else if (Num3 % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		} else {
//			System.out.println("2의 배수도, 3의 배수도 아닙니다.");
//		}
//		
//		double randomValue = Math.random() * 6;
//		System.out.println(randomValue);
		
//		int randomValue2 = (int)(Math.random() * 6) + 1;
//		System.out.println(randomValue2);
//		
//		switch (randomValue2) {
//		case 1:
//			System.out.println("1이 나왔습니다.");
//			break;
//		case 2:
//			System.out.println("2가 나왔습니다");
//			break;
//		case 3:
//			System.out.println("3이 나왔습니다.");
//			break;
//		case 4:
//			System.out.println("4가 나왔습니다.");
//			break;
//		case 5:
//			System.out.println("5가 나왔습니다.");
//			break;
//		default:
//			System.out.println("6이 나왔습니다.");
//		}
//		
//		switch(randomValue2) {
//		default : 
//			System.out.println(randomValue2 + "이(가) 나왔습니다.");
//		}
		
		int randomScore = (int)(Math.random() * 100);
		System.out.println("점수 = " + randomScore);
		System.out.println("If - Else 결과 ========================");
		if(randomScore >= 90) {
			System.out.println("A학점 입니다.");
		} else if(randomScore >= 80) {
			System.out.println("B학점 입니다.");
		} else if(randomScore >= 70) {
			System.out.println("C학점 입니다.");
		} else if(randomScore >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다");
		}
		
		System.out.println("Switch- Case 결과 ====================");
		randomScore /= 10;
		switch(randomScore) {
		case 9 :
			System.out.println("A학점입니다.");
			break;
		case 8 :
			System.out.println("B학점입니다");
			break;
		case 7 :
			System.out.println("C학점입니다.");
			break;
		case 6 :
			System.out.println("D학점입니다.");
			break;
			default :
				System.out.println("F학점입니다.");
		}
		
		System.out.println("5번 끝 !!");
	}
}
