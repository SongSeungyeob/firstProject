package firstProject;

public class StringExample {
//	byte < short < int < long < float < double
	public static void main(String[] args) {
		int age = 28;
		String name = "������";
		
	
		long myAge = age; // �ڵ�����ȯ(promotion)
		age = (int) myAge; // ��������ȯ(casting)
		
//		age = "ȫ�浿";
//		name = 20;
		System.out.println(name + "�� ���̴� " + age );
		
	}
}
