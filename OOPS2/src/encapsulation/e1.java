package encapsulation;

public class e1 {
	
	private int password;
	
	public void set(int n) {
		password=n;
	}
	
	public void get() {
		System.out.println("PASSWORD:"+password);
	}
	
	public static void staticmethod() {
		System.out.println("Static Methods in Encapsulation can be used without accessing the variables");
	}

}
