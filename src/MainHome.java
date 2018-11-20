
public class MainHome {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		method1();
		testmethod();
		TestClass1.BananaJuice();
		System.out.println("Here is the truth: " + TestClass1.OrangeJuice());
		System.out.print(TestClass1.StrawberryJuice());
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
