//constructor overloading

class Student1
{
	String name;
	public Student1()
	{
		System.out.println("Myself Abhishek");
	}
	public Student1(String name)
	{
		this.name=name;
		System.out.println("Myself "+name);
	}
	
}


public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		
		Student1 obj=new Student1();
		Student1 obj2=new Student1("ravi");

	}

}
