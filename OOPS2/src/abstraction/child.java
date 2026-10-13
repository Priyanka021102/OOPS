package abstraction;

public class child extends parent{
	public static void main(String args[]) {
	child obj=new child();
	obj.normalmethod();
	obj.abstractmethod();
	}
	
	public void abstractmethod() {
		System.out.println("Non-static Abstarct Method (Void) in Child Class");
	}

}
 