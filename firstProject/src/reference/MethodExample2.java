package reference;

public class MethodExample2 {

	public static void main(String[] args) 
	{		
		int a = 45, b = 77;
		Calculate_Sum(a, b);
		Calculate_Sum(20, 30);
		multiple(20, 30);
		multiple(10, 1000);
		getArea(3.5);
		getArea(5.5);
		getArea(10);
		int Res = getMax(a, b);
		System.out.println(a + " �� " + b + " �߿� �� ū �� : " + Res);
		System.out.println("����� : " + Divide(5 , 3));
	}
	
	public static void Calculate_Sum(int a, int b)
	{
		int Sum = a + b;
		System.out.println("�� ���� �� = " + Sum);
	}
	
	public static void multiple(int a, int b) 
	{
		int Multi = a * b;
		System.out.println("�� ���� �� = " + Multi);
	}
	
	public static void getArea(double Len)
	{
		double Area = Len * Len;
		System.out.println("�� ���� ���̰� " + Len + " �� ���簢���� ���� = " + Area);
	}
	
	public static int getMax(int A, int B) 
	{ 
		return A >= B ? A : B;
	}
	
	public static double Divide(int A ,int B)
	{
		return (double)A / B;
	}
}
