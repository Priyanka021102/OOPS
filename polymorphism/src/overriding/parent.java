package overriding;

public class parent {
	
	public int nonstator(int a,int b) {
		System.out.println("Overriding(Non-Static Method) in Parent Class");
		return a*b;
	}
}
