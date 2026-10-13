package overloading;

public class nonstatol {
	public static void main(String args[]) {
		nonstatol obj=new nonstatol();
		obj.mathsop();
		obj.mathsop(3,9);
		obj.mathsop(13.19,9);
		System.out.println("Concatenation:"+obj.mathsop("Combining", "strings"));	
		}
	
	public void mathsop()
	{
		String a="Basics";
		System.out.println("Mathematical Operations:"+a);
	}

	public void mathsop(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	public void mathsop(double a,int b)
	{
		System.out.println("Subtraction:"+(a-b));
	}
	public String mathsop(String a,String b)
	{
		return a+b;
	}
	
	
}

