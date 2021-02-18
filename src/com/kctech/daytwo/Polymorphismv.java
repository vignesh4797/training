package com.kctech.daytwo;
////over loading
class Polymorphismv 
{
	int a,b;
	
	public void method() {
		System.out.println("im method");
	}
	
	public int method(int a, int b)
	{
		this.a = a;
		this.b = b;
		return (a * b);
	}
	public static void main(String[] args) {
		Polymorphismv ne = new Polymorphismv();
		ne.method();
		System.out.println(ne.method(3,4));
	}
}

/*public class Polymorphismv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
