package reference;

public class MethodExample3 
{
	public static void main(String[] args) 
	{
		int[] Arr = { 30, 40, 50, 60, 70 };
		System.out.println("Arr1ÀÇ ÇÕ : " + sumArray(Arr));
		System.out.println("Arr1ÀÇ Æò±Õ : " + avgArray(Arr));
		
		int[] Arr2 = { 30, 40 };
		System.out.println("Arr2ÀÇ ÇÕ : " + sumArray(Arr2));
		System.out.println("Arr2ÀÇ Æò±Õ : " + avgArray(Arr2));
		
		int[] Arr3 = { 33 , 44 , 55 , 66 };
		System.out.println("Arr3ÀÇ ÇÕ : " + sumArray(Arr3));
		System.out.println("Arr3ÀÇ Æò±Õ : " + avgArray(Arr3));
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
