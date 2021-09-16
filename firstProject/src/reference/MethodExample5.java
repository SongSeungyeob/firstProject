package reference;

public class MethodExample5 
{
	public static void main(String[] args) 
	{
		int[] Arr = { 88, 67, 92, 73, 58 };
		System.out.println("譆歐高 : " + getMinValue(Arr));
		System.out.println("[ 部 1 ] ============================");
		
		int[] Arr2 = { 55, 82, 34, 19, 47, 89 };
		System.out.println("譆歐高 : " + getMinValue(Arr2));
		System.out.println("[ 部 2 ] ============================");
	}
	
	public static int getMinValue(int[] Arr)
	{
		int minValue = 987654321;
		for(int i = 0 ; i < Arr.length; i++) {
			minValue = minValue > Arr[i] ? Arr[i] : minValue;
		}
//		boolean isTrue = false;
//		for(int i = 0 ; i < Arr.length; i++) {
//			isTrue = minValue > Arr[i];
//			if(isTrue) {
//				minValue = Arr[i];                                                                                                                                                            
//			}
//		}
		return minValue;
	}

}
