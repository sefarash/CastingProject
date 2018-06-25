
public class Engineer extends person {
	
	int trainingId;

	public Engineer(String name, int age,int trainingId) {
		super(name, age);
		this.trainingId = trainingId;
		
	}

	public int getTrainingId() {
		return trainingId;
	}
	
	public void design(String things) {
		System.out.println("Designing: " + things);
	}

	@Override
	public String toString() {
		return "Engineer [trainingId=" + trainingId + ", name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		
		Engineer e1 = new Engineer("Halil",30,12934);
		person p1 = new Engineer("Adam",40,4343423);
		Object o1 = new Engineer("JOhn",90,555555);
		boolean b1 = o1 instanceof Object;
		boolean b2 = o1 instanceof person;
		boolean b3 = o1 instanceof Engineer;
		boolean b4 = o1 instanceof Cat;
		System.out.println(b3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b4);
		
		//Duck d = (Duck)e1;//does not compile
		
//		p1 = e1;
		e1=(Engineer)p1;
//		e1=(Engineer) o1;
//		o1= p1;
//		p1=(person) o1;
//		o1=e1;
//		System.out.println(e1);
//		e1.design("TV");
//		System.out.println(p1.getName());
//		System.out.println(p1.toString());
		System.out.println(e1.trainingId);
		
		
		
		
		
	}
	
	
	

}
