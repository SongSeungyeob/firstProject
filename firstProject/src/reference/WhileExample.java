package reference;

public class WhileExample 
{
	public static void main(String[] args) 
	{
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		
		//1 ~ 10 Â¦¼ö¸¸ Ãâ·Â.
		i = 1;
		boolean run = true;
		while(run) {
			if(i == 10) {
				run = false;
			}
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		while(true) {
			if(i == 11) {
				break;
			}
		}
	}
}
