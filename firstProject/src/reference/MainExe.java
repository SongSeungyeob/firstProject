package reference;
import java.util.Scanner;

public class MainExe 
{
	public static void main(String[] args) 
	{
		//1. 학생수지정 2.학생이름입력 3.출력 4. 종료
		String[] Student = null;
		while(true) {
			ForPrint("[ Select Menu ]"); 
			ForPrint("1. 학생 수 지정 2. 학생 이름 입력 3. 출력 4. 종료"); 
			int Menu = Input_I_Data();
			
			if(Menu == 1) {
				ForPrint("지정할 학생의 수를 입력해 주세요 : ");
				int Num = Input_I_Data();
				Student = new String[Num];
			} else if(Menu == 2) {
				if(Student == null) {
					System.out.println("[ ERROR ] - 학생의 수부터 입력해주세요.");
					continue;
				}
				ForPrint("학생의 이름을 입력해 주세요"); 
				Make_Student_Name(Student);
			} else if(Menu == 3) {
				if(Student == null) {
					System.out.println("[ ERROR ] - 학생의 수부터 입력해주세요.");
					continue;
				}
				ForPrint("학생의 이름을 출력하겠습니다.");
				for(int i = 0 ; i <Student.length; i++) {
					ForPrint(Student[i]); 
				}
			} else if(Menu == 4) {
				ForPrint("종료하겠습니다.");
				break;
			}
		}
		System.out.println("# 종료 #");
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