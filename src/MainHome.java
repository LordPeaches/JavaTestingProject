
public class MainHome {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		method1();
		testmethod();
	}
	
	public static void testmethod() {
		System.out.println("Just a little test, ignore me");
		System.out.println(method2() + " is your answer");
	}
	
	public static void method1() {
		System.out.println("This is method1");
	}
	
	public static int method2() {
		int x = 7 + 12;
		return x;
	}
}
