package control;
import java.util.Scanner;

public class WhileExample2
{

	public static void main(String[] args) 
	{
		String name = "�۽¿�";
		String age = "28";
		String phone = "010-1234-5678";
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1. �̸� 2. ���� 3. ����ó 4. ����");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("�̸� : " + name);
			} else if(menu == 2) {
				System.out.println("���� : " + age);
			} else if(menu == 3) {
				System.out.println("����ó : " + phone);
			} else {
				System.out.println("����");
				break;
			}
			System.out.println();
		}
		System.out.println("��");
	}

}
