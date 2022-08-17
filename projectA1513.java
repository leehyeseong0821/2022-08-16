package projectA16;
  
class Person2{
	String name;
	String id;
	
	public Person2(String name){
		this.name=name;
	}
}
class Student2 extends Person2{
	String grade;
	String department;
	
	public Student2(String name) {
		super(name);
	}
}

public class projectA1513 {

	public static void main(String[] args) {
		
		Person2 p;
		Student2 s = new Student2("이재문");
		p=s;
	System.out.println(p.name);

	}

}
