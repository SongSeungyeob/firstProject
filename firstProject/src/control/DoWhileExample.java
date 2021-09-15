package control;

public class DoWhileExample 
{

	public static void main(String[] args)
	{
	      // Do..While
	      boolean run = false;
//	      while (run) {
//	         System.out.println("실행문1.");
//	      }
	      int cnt = 0;
	      
	      do {
	         cnt++;// if 밑 break 밑으로 가면 달라짐
	         if(cnt % 2 == 0) {
	            continue;// 다음 순번으로 넘어간다(skip)
	         }
	         System.out.println(cnt);
	         if(cnt >= 4) {
	            break;
	         }
//	         System.out.println("실행문2.");
	      } while (true);
	      System.out.println("끝.");
	}

}
