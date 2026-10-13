package overriding;

public class child extends parent{
	public static void main(String args[]) {
		
		parent obj1=new parent();
		System.out.println("Area of Circle:"+obj1.nonstator(4,4));
		parent obj2=new child();
		System.out.println("Area of Rectangle:"+obj2.nonstator(100,90));
	}
	
	public int nonstator(int a,int b) {
		System.out.println("Overriding(Non-Static Method) in Child Class");
		return a*b;
	}
}
