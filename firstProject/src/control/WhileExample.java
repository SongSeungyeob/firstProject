package control;

public class WhileExample 
{
	public static void main(String[] args) 
	{
		 int i = 1;
		 while(i <= 10) {
			 System.out.printf("i의 값은 %d\n", i);
			 i++;
		 }
		 
		 boolean run = true;
		 int cnt = 0;
		 while(run) {
			 cnt = (int) (Math.random() * 10) + 1;
			 System.out.println(cnt);
			 if(cnt == 8) {
				 run = false;
			 }
		 }
		 
		 while(true) {
			 cnt = (int)(Math.random() * 10) + 1;
			 System.out.println(cnt);
			 if(cnt == 8) {
				 break;
			 }
		 }
		 System.out.println("끝.");
	}

}
