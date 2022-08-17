package projectA16;
 
class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	public int getWeight() {
		return weight;
		
	}
}
class Student1 extends Person{
	public void set() {
		age= 30;
		name = "홍길동";
		height = 175;
//		weight = 99;
		setWeight(99);
	}
}


public class projectA1511 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.set();
		System.out.println("나이:"+s.age);
		System.out.println("이름:"+s.name);
		System.out.println("키:"+s.height);
		System.out.println("몸무게:"+s.getWeight());
	}

}
