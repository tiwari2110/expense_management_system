import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	List<EmployeeInner> ei = new ArrayList<>();
	ei.add(new EmployeeInner("Akash", 25));
	ei.add(new EmployeeInner("Amit", 26));
	ei.add(new EmployeeInner("Kush", 26));
	
	Predicate<EmployeeInner> pre = new Predicate<EmployeeInner>() {
		
		@Override
		public boolean test(EmployeeInner t) {
			return (t.getAge()<26);
		}
	};
	
	for (EmployeeInner employeeInner : ei) {
		if(pre.test(employeeInner))
		{
			System.out.println(employeeInner.toString());
		}
		
	}
	
	Predicate<EmployeeInner> preEmp = (p) -> p.getAge() < 26 ;
	ei.forEach(p -> {
		if (preEmp.test(p)) {
			System.out.println(p.toString());
		}
	});
	
	}

	
	
}

class EmployeeInner {
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	
	public EmployeeInner() {
		super();
	}

	public EmployeeInner(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeInner [name=" + name + ", age=" + age + "]";
	}
	
}