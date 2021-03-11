package VICKY;




interface A
{
	
	void show();
}

public class Eas {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		//A obj;
		
		A obj = () -> System.out.println("hello");
	
		
		//System.out.println("hello1111");
		obj.show();
		
		
		
	}

}
