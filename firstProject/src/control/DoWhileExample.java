package control;

public class DoWhileExample 
{

	public static void main(String[] args)
	{
	      // Do..While
	      boolean run = false;
//	      while (run) {
//	         System.out.println("���๮1.");
//	      }
	      int cnt = 0;
	      
	      do {
	         cnt++;// if �� break ������ ���� �޶���
	         if(cnt % 2 == 0) {
	            continue;// ���� �������� �Ѿ��(skip)
	         }
	         System.out.println(cnt);
	         if(cnt >= 4) {
	            break;
	         }
//	         System.out.println("���๮2.");
	      } while (true);
	      System.out.println("��.");
	}

}
