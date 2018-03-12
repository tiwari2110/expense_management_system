import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReference {

	
	public static void main(String[] args) {
		List<Person> listperson =new ArrayList<>();
		listperson.add(new Person("Akash", 25));
		listperson.add(new Person("Amit", 50));
		listperson.add(new Person("Raj", 53));
		listperson.add(new Person("Jay", 15));
		listperson.add(new Person("Bharat", 56));
		
      Collections.sort(listperson, Person :: compareAge);
      listperson.forEach(p -> System.out.println(p));
	}

}


class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static int compareAge(Person p1, Person p2) {
		Integer a = (Integer)p1.getAge();
		int res = a.compareTo(p2.getAge());
		return res;
	}
}