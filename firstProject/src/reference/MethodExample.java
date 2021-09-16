package reference;

public class MethodExample {

	public static void main(String[] args) 
	{	
		double w1 = 72.4, h1 = 175;
		checkBMI(w1, h1);
		double w2 = 65.7, h2 = 163.4;
		checkBMI(w2, h2);
		checkBMI(76, 186);
	}

	public static void checkBMI(double weight, double height) 
	{
		// �񸸵� ��� = ������ / (Ű * Ű)
		double BMI = weight / (height * height);
		if(BMI < 18.5) {
			System.out.println("��ü��.");
		} else if(18.5 <= BMI && BMI < 23) {
			System.out.println("����.");
		} else if(23 <= BMI && BMI < 25) {
			System.out.println("��ü��.");
		} else if(25 <= BMI && BMI < 30) {
			System.out.println("��");
		} else {
			System.out.println("���� ���� !!!!!");
		}
	}
}
