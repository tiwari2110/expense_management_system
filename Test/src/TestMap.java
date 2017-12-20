import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Akash",25, "Mumbai");
		Employee e2 = new Employee("Aakash",25, "Mumbai");
		
		Map<Employee, String> map = new HashMap<>();
		map.put(e1,"Akash");
		map.put(e2, "Kunal");
		
		for (Entry<Employee, String> e : map.entrySet()) {
			System.out.println(e.getKey().toString());
			System.out.println(e.getValue());
		}
	}

}
