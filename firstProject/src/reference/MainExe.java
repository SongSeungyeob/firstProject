package reference;
import java.util.Scanner;

public class MainExe 
{
	public static void main(String[] args) 
	{
		//1. �л������� 2.�л��̸��Է� 3.��� 4. ����
		String[] Student = null;
		while(true) {
			ForPrint("[ Select Menu ]"); 
			ForPrint("1. �л� �� ���� 2. �л� �̸� �Է� 3. ��� 4. ����"); 
			int Menu = Input_I_Data();
			
			if(Menu == 1) {
				ForPrint("������ �л��� ���� �Է��� �ּ��� : ");
				int Num = Input_I_Data();
				Student = new String[Num];
			} else if(Menu == 2) {
				if(Student == null) {
					System.out.println("[ ERROR ] - �л��� ������ �Է����ּ���.");
					continue;
				}
				ForPrint("�л��� �̸��� �Է��� �ּ���"); 
				Make_Student_Name(Student);
			} else if(Menu == 3) {
				if(Student == null) {
					System.out.println("[ ERROR ] - �л��� ������ �Է����ּ���.");
					continue;
				}
				ForPrint("�л��� �̸��� ����ϰڽ��ϴ�.");
				for(int i = 0 ; i <Student.length; i++) {
					ForPrint(Student[i]); 
				}
			} else if(Menu == 4) {
				ForPrint("�����ϰڽ��ϴ�.");
				break;
			}
		}
		System.out.println("# ���� #");
	}
	
	public static void Make_Student_Name(String[] Arr) {
		for(int i = 0 ; i <Arr.length; i++) {
			Arr[i] = Input_Str_Data();
		}
	}
	
	public static void ForPrint(String Msg) {
		System.out.println(Msg);
	}
	
	public static int Input_I_Data() {
		Scanner Sc = new Scanner(System.in);
		return Sc.nextInt();
	}
	
	public static String Input_Str_Data() {
		Scanner Sc = new Scanner(System.in);
		return Sc.nextLine();
	}
}