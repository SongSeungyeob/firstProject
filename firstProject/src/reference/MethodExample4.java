package reference;

public class MethodExample4 
{
	public static void main(String[] args) 
	{
		int[] Scores = { 88, 67, 92, 73, 58 };
		System.out.println("�ִ� : " + getMaxValue(Scores));
		System.out.println("[ �� 1 ] ==================");
		
		int[] Arr = { 55, 82, 34, 19, 47, 89 };
		System.out.println("�ִ� : " + getMaxValue(Arr));
		System.out.println("[ �� 2 ] ==================");
		
		
	}
	
	public static int getMaxValue(int[] Arr) 
	{
		int maxValue = 0;
		boolean isTrue = false; 
		for(int i = 0 ; i < Arr.length; i++) {
			isTrue = maxValue < Arr[i];
			if(isTrue) {
				maxValue = Arr[i];
			}
		}
		return maxValue;
	}
}
