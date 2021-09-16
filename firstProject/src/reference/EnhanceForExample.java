package reference;

public class EnhanceForExample 
{
	public static void main(String[] args) 
	{
		// NullPointException = �����ϴ� ���� ���� �� �߻��ϴ� Error.
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
		System.out.println("=========�ٽ�==========");
		/* ***************************************************/
		// Enhanced for...
		
		/* ***************************************************/
		for(String str : strAry) {
			System.out.println(str);
		}
		System.out.println("=========�ٽ�==========");
		/* ***************************************************/
		int[] Arr = { 50, 70, 80, 60 };
		int Sum = 0;
		for(int Score : Arr) {
			Sum += Score;
		}
		System.out.println("�հ� = " + Sum);
		System.out.println("=========�ٽ�==========");
		/* ***************************************************/
		
		/* ***************************************************/
		double[] Score = new double[] { 4.2, 3.5, 2.8, 3.7 };
		double dblSum = 0.0, Avg;
		for(double score : Score ) {
			dblSum += score;
		}
		Avg = dblSum / Score.length;
		System.out.println("�հ� = " + dblSum);
		System.out.println("�л���� = " + Avg +  " �Դϴ�.");
		/* ***************************************************/
		
	}
}
