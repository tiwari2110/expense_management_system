
public class MethodHiding {
	public static void main(String[] args) {
		A a = new B();
		a.test();
	}

	
}

class A {
	public static void test(){
		System.out.println("A.test()");
	}
}

class B extends A {
	
	public static void test() {
		System.out.println("B.test()");
	}
}