package reference;
import java.util.Scanner;

public class AppMain 
{
	public static void main(String[] args) 
	{
		int[] Scores = null;
		
		while(true) {
			showMenu();
			int menu = readInt("��ȣ�� �����ϼ��� >> ");
			if(menu == 1) {
				int N = createStudent();
				Scores = new int[N];
			}  else if(menu == 2) {
				inputValue(Scores);
			} else if(menu == 3) {
				showList(Scores);
			} else if(menu == 4) {
				analysis(Scores);
			} else if(menu == 5) {
				break;
			}
		}
		System.out.println("# ���� #");
	}
	
	public static void showMenu() {
		System.out.println("1: �л��ο� ���� 2: �л������Է� 3: ��ü����Ʈ 4: �м� : ���, �ְ��� 5: ����");
	}
	
	public static int createStudent() {
		int N = readInt("�л����� �Է��ϼ���.");
		return N;
	}
	
	public static void inputValue(int[] Arr) {
		if(Arr == null) return;
		for(int i = 0 ; i < Arr.length; i++) {
			Arr[i] = readInt("�л� ������ �Է��ϼ���.");
		}
	}
	
	public static void showList(int[] Arr) {
		if(Arr == null) return;
		for(int i = 0 ; i < Arr.length; i++) {
			System.out.printf("Scores[%d]  => %d\n", i, Arr[i]);
		}
	}
	
	public static void analysis(int[] Arr) {
		if(Arr == null) return;
		int maxValue = 0;
		int Sum = 0;
		for(int i = 0 ; i <Arr.length; i++) {
			maxValue = maxValue < Arr[i] ? Arr[i] : maxValue;
			Sum += Arr[i];
		}
		double Avg = (double) Sum / Arr.length;
		System.out.printf("��� : %f , �ְ� : %d\n", Avg, maxValue);
	}
	
	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
	}
}