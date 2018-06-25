
public class person {
	String name;
	int age;
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String [] args) {
		person p1 = new person("Halil", 30);
		
		Object o1 = new person("Emre", 25);
		
		person p2 = (person) o1;//casting
		
		System.out.println(p2.age);
		System.out.println(p2.getAge());
		
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		p1.setAge(age);
//		p1.setName(name);
//		p1.getAge();
//		p1.getName();
//		System.out.println(p1);//p1.toSting()
//		System.out.println(new person("Halil", 30));
//		
//		//System.out.println(o1.name);
//		System.out.println(o1);
				
	}
	
	

}
