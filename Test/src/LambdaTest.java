import java.util.ArrayList;
import java.util.List;

interface A1 {
	public void doSomething(int a, int b);
}
public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> list = new ArrayList<>();
		list.add("Ak");
		list.add("bv");
		
		list.forEach( name -> System.out.println(name));
		
		A1 a = (arg1, arg2) -> {
			int res = arg1+arg2;
			System.out.println(res);
			
		};
		a.doSomething(5, 5);
		
	}

}

