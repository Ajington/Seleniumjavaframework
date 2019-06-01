package Demo;

public class Exceptionhandlinedemo {

	public static void main(String[] args) {
		try {
		demo();
	}
		catch(Exception e)
		{
			System.out.println("This is catch statement");
			e.printStackTrace();
		}
		finally {
			System.out.println("All done");
		}
	}
	
	public static void demo() {
		
		System.out.println("This is try statement");
		int i=1/0;
		
	}
}
