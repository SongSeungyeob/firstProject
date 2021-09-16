package reference;

public class MethodExample3 
{
	public static void main(String[] args) 
	{
		int[] Arr = { 30, 40, 50, 60, 70 };
		System.out.println("Arr1�� �� : " + sumArray(Arr));
		System.out.println("Arr1�� ��� : " + avgArray(Arr));
		
		int[] Arr2 = { 30, 40 };
		System.out.println("Arr2�� �� : " + sumArray(Arr2));
		System.out.println("Arr2�� ��� : " + avgArray(Arr2));
		
		int[] Arr3 = { 33 , 44 , 55 , 66 };
		System.out.println("Arr3�� �� : " + sumArray(Arr3));
		System.out.println("Arr3�� ��� : " + avgArray(Arr3));
	}
	
	public static int sumArray(int[] Arr) 
	{
		int Sum = 0;
		for(int num : Arr) {
			Sum += num;
		}
		return Sum;
	}
	
	public static double avgArray(int[] Arr)
	{
		int Sum = sumArray(Arr);
		return (double)Sum / Arr.length;
	}
}
