package reference;

public class ArrayExample2 
{
	public static void main(String[] args) 
	{
		/* ***************************************** */
		int[] Scores = new int[10];
		for(int i = 0 ; i< Scores.length ; i++) {
			int randomValue = (int)(Math.random() * 10) + 1;
			Scores[i] = randomValue;
		}
		
		for(int i = 0 ; i < Scores.length; i++) {
			System.out.printf("scores[%d] => %d\n", i, Scores[i]);
		}
		System.out.println("[ �� 1 ] =====================");
		/* ***************************************** */
		
		/* ***************************************** */
		int Sum = 0;
		for(int i = 0 ; i <Scores.length; i++) {
			Sum += Scores[i];
		}
		System.out.println("�迭�� �հ� : " + Sum);
		System.out.println("[ �� 2 ] =====================");
		/* ***************************************** */
		
		/* ***************************************** */
		Sum = 0;
		for(int i = 0 ; i <Scores.length; i++) {
			if(Scores[i] <= 5) {
				continue;
			}
			Sum += Scores[i];
		}
		System.out.println("5���� ū ������ �հ� : " + Sum);
		System.out.println("[ �� 3 ] =====================");
		/* ***************************************** */
		
		/* ***************************************** */
		Sum = 0;
		for(int i = 1 ; i < Scores.length; i += 2) {
			Sum += Scores[i];
		}
		System.out.println("¦����°�� �����ϴ� ������ �հ� : " + Sum);
		System.out.println("[ �� 4 ] =====================");
		/* ***************************************** */
		
	}
}
