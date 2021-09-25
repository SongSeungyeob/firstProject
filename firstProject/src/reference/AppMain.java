package reference;
import java.util.Scanner;

public class AppMain 
{
	public static void main(String[] args) 
	{
		int[] Scores = null;
		
		while(true) {
			showMenu();
			int menu = readInt("번호를 선택하세요 >> ");
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
		System.out.println("# 종료 #");
	}
	
	public static void showMenu() {
		System.out.println("1: 학생인원 지정 2: 학생점수입력 3: 전체리스트 4: 분석 : 평균, 최고점 5: 종료");
	}
	
	public static int createStudent() {
		int N = readInt("학생수를 입력하세요.");
		return N;
	}
	
	public static void inputValue(int[] Arr) {
		if(Arr == null) return;
		for(int i = 0 ; i < Arr.length; i++) {
			Arr[i] = readInt("학생 점수를 입력하세요.");
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
		System.out.printf("평균 : %f , 최고값 : %d\n", Avg, maxValue);
	}
	
	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
	}
}