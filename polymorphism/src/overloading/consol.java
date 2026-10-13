package overloading;

public class consol {
	public static void main(String args[]) {
		consol obj=new consol();
		consol obj1=new consol(3,9);
		consol obj2=new consol(13.19,9);
		System.out.println("The End.");
	}
	public consol()
	{
		String a="Basics";
		System.out.println("Mathematical Operations:"+a);
	}

	public consol(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	public consol(double a,int b)
	{
		System.out.println("Subtraction:"+(a-b));
	}
}
