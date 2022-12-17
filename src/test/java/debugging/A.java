package debugging;

public class A {

	public static void main(String[] args) {
		
		A a = new A();
		a.demo();
		System.out.println("In main");
	}
	
	public void demo() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}

}
