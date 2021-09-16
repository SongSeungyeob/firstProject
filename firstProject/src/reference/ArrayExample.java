package reference;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		int[] intAry = { 1, 2, 3, 4, 5 };
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		
		System.out.println("==========다시==========");
		intAry[0] = 6;
		intAry[1] = 7;
		intAry[2] = 8;
		intAry[3] = 9;
		intAry[4] = 10;
		for(int i = 0 ; i < 5; i++) {
			System.out.println(intAry[i]);
		}
		
		byte[] byteAry = { 1, 2, 3 };
		for(int i = 0 ; i < 3; i++) {
			System.out.println("byte 배열 : " + byteAry[i] + " ");
		}
		System.out.println();
		
		String[] StrAry = { "Hello", "World", "Nice" };
		for(int i = 0 ; i < 3; i++) {
			System.out.println("String 배열 : " + StrAry[i] + " ");
		}
		System.out.println();
		
		StrAry = new String[] { "Hong", "Kim", "Park" };
		for(int i = 0 ; i < 3; i++) {
			System.out.println("String 배열 : " + StrAry[i] + " ");
		}
		System.out.println();
		
		double[] dblAry;
		dblAry = new double[] { 1, 2.3 , 5 };
		for(int i = 0 ; i < 3; i++) {
			System.out.println("Double 배열 : " + dblAry[i] + " ");
		}
		System.out.println();
		
		float[] fltAry = new float[5];
		for(int i = 0 ; i < fltAry.length; i++) {
			System.out.println("Float 배열 : " + fltAry[i] + " ");
		}
	}

}
