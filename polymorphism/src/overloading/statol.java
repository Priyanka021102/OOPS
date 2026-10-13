package overloading;
public class statol {
	public static void main(String args[]) {
		statol.mathsop();
		statol.mathsop(3,9);
		statol.mathsop(13.19,9);
		System.out.println("Concatenation:"+statol.mathsop("Combining", "strings"));
	}
	public static void mathsop()
	{
		String a="Basics";
		System.out.println("Mathematical Operations:szaq"+a);
	}

	public static void mathsop(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	public static void mathsop(double a,int b)
	{
		System.out.println("Subtraction:"+(a-b));
	}
	public static String mathsop(String a,String b)
	{
		return a+b;
	}
}

