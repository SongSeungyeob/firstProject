package control;
import java.util.Scanner;

public class WhileExample2
{

	public static void main(String[] args) 
	{
		String name = "송승엽";
		String age = "28";
		String phone = "010-1234-5678";
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 이름 2. 나이 3. 연락처 4. 종료");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.println("이름 : " + name);
			} else if(menu == 2) {
				System.out.println("나이 : " + age);
			} else if(menu == 3) {
				System.out.println("연락처 : " + phone);
			} else {
				System.out.println("종료");
				break;
			}
			System.out.println();
		}
		System.out.println("끝");
	}

}
