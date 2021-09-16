package reference;

public class EnhanceForExample 
{
	public static void main(String[] args) 
	{
		// NullPointException = 참조하는 값이 없을 때 발생하는 Error.
		/* ***************************************************/
		String[] strAry;
		strAry = new String[5];
		strAry = new String[] { "Hong", "Park", "Choi", "Kim", "Hwang" };
		System.out.println(strAry.length);
		
		strAry[2] = "Hong";
		for(int i = 0 ; i < strAry.length; i++) {
			if(strAry[i].equals("Hong") == true) {
				System.out.printf("strAry[%d] : %s\n", i, strAry[i]);
			}
		}
		System.out.println("=========다시==========");
		/* ***************************************************/
		// Enhanced for...
		
		/* ***************************************************/
		for(String str : strAry) {
			System.out.println(str);
		}
		System.out.println("=========다시==========");
		/* ***************************************************/
		int[] Arr = { 50, 70, 80, 60 };
		int Sum = 0;
		for(int Score : Arr) {
			Sum += Score;
		}
		System.out.println("합계 = " + Sum);
		System.out.println("=========다시==========");
		/* ***************************************************/
		
		/* ***************************************************/
		double[] Score = new double[] { 4.2, 3.5, 2.8, 3.7 };
		double dblSum = 0.0, Avg;
		for(double score : Score ) {
			dblSum += score;
		}
		Avg = dblSum / Score.length;
		System.out.println("합계 = " + dblSum);
		System.out.println("학생평균 = " + Avg +  " 입니다.");
		/* ***************************************************/
		
	}
}
