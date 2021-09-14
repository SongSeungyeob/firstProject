package firstProject;

public class BooleanExample {

	public static void main(String[] args) 
	{
		boolean isOK = true;
		//isOK = false;
		isOK = 15 > 10;
		
		boolean isTeenager = false; 
		
		if(isOK) isTeenager = true;
		if(isTeenager) System.out.println("청소년입니다.");
		System.out.println("end of prog");
	}

}
