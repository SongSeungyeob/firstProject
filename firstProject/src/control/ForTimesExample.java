package control;

public class ForTimesExample 
{
	public static void main(String[] args) 
	{
//		for(int j = 2; j <= 9; j++) {
//			int row = j;
//			System.out.println("====" + row + "´Ü====");
//			for(int i = 1;  i<= 9; i++) {
//				System.out.printf(" %d * %d = %d \n", row, i, (row * i));
//			}
//		}
//		System.out.println();
		for(int i = 2; i <= 9; i++) {
			System.out.print("====" +i + "´Ü====\t" );
		}
		System.out.println();
		for(int i = 1;  i<=9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t\t");
			}
			System.out.println();
		}
		
		String A = "ABCDEF";
		String B = "ABCD";
		System.out.println(A + "\t" + "ZYX");
		System.out.println(B + "\t" + "ZYX");
	}
}
