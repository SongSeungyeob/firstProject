package control;

public class ConditionExe 
{
	public static void main(String[] args)
	{
//		/*
//		 * * 2���� ������ ������ �����ؼ� 60 , 70�� ��´�. 2���� ���� ���� ����� 100���� ������ �հ�, �ƴϸ� ���հ�
//		 */
//		int Num1 = 60;
//		int Num2 = 70;
//		int Sum = Num1 + Num2;
//
//		if (Sum >= 100)
//			System.out.println("�հ�");
//		else
//			System.out.println("���հ�");
//		System.out.println("ù��° ��.");
//
//		/*
//		 * * 2���� ���� ���ؼ� ¦���̸� ¦������ �Ǵ�.
//		 */
//		int Multiple = Num1 * Num2;
//		if (Multiple % 2 == 0)
//			System.out.println("¦���Դϴ�.");
//		else
//			System.out.println("Ȧ���Դϴ�.");
//		System.out.println("�ι�° ��.");
//
//		/*
//		 * * Num1 �� 10���� ���� ������� 2�� ����̸� 2�� ������, 3�� ����̸� 3�� ������ ��� 2�� 3�� ������̸�, 2�� ���,
//		 * 3�ǹ�� �Դϴ�.
//		 */
//		Num1 /= 10;
//		if (Num1 % 2 == 0 && Num1 % 3 == 0) {
//			System.out.println("2�� 3�� ����� �Դϴ�.");
//		} else if (Num1 % 2 == 0) {
//			System.out.println("2�� ����Դϴ�.");
//		} else if (Num1 % 3 == 0) {
//			System.out.println("3�ǹ���Դϴ�.");
//		} else {
//			System.out.println("2�� �����, 3�� ����� �ƴմϴ�.");
//		}
//
//		int Num3 = 9;
//		if (Num3 % 2 == 0 && Num3 % 3 == 0) {
//			System.out.println("2�� 3�� ������Դϴ�.");
//		} else if (Num3 % 2 == 0) {
//			System.out.println("2�� ����Դϴ�.");
//		} else if (Num3 % 3 == 0) {
//			System.out.println("3�� ����Դϴ�.");
//		} else {
//			System.out.println("2�� �����, 3�� ����� �ƴմϴ�.");
//		}
//		
//		double randomValue = Math.random() * 6;
//		System.out.println(randomValue);
		
//		int randomValue2 = (int)(Math.random() * 6) + 1;
//		System.out.println(randomValue2);
//		
//		switch (randomValue2) {
//		case 1:
//			System.out.println("1�� ���Խ��ϴ�.");
//			break;
//		case 2:
//			System.out.println("2�� ���Խ��ϴ�");
//			break;
//		case 3:
//			System.out.println("3�� ���Խ��ϴ�.");
//			break;
//		case 4:
//			System.out.println("4�� ���Խ��ϴ�.");
//			break;
//		case 5:
//			System.out.println("5�� ���Խ��ϴ�.");
//			break;
//		default:
//			System.out.println("6�� ���Խ��ϴ�.");
//		}
//		
//		switch(randomValue2) {
//		default : 
//			System.out.println(randomValue2 + "��(��) ���Խ��ϴ�.");
//		}
		
		int randomScore = (int)(Math.random() * 100);
		System.out.println("���� = " + randomScore);
		System.out.println("If - Else ��� ========================");
		if(randomScore >= 90) {
			System.out.println("A���� �Դϴ�.");
		} else if(randomScore >= 80) {
			System.out.println("B���� �Դϴ�.");
		} else if(randomScore >= 70) {
			System.out.println("C���� �Դϴ�.");
		} else if(randomScore >= 60) {
			System.out.println("D���� �Դϴ�.");
		} else {
			System.out.println("F���� �Դϴ�");
		}
		
		System.out.println("Switch- Case ��� ====================");
		randomScore /= 10;
		switch(randomScore) {
		case 9 :
			System.out.println("A�����Դϴ�.");
			break;
		case 8 :
			System.out.println("B�����Դϴ�");
			break;
		case 7 :
			System.out.println("C�����Դϴ�.");
			break;
		case 6 :
			System.out.println("D�����Դϴ�.");
			break;
			default :
				System.out.println("F�����Դϴ�.");
		}
		
		System.out.println("5�� �� !!");
	}
}
