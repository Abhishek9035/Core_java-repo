//Method OverRiding works by using inheritance.

class Student1
{
	int marks;
	public void Student1marks()
	{
		System.out.println("98");
	}
	public void Student1marks(int marks) {
		this.marks=marks;
		System.out.println(70);
	}
}
class Student2 extends Student1
{
	public void Student2marks()
	{
		super.Student1marks();
		//super.Student1marks(89);
		System.out.println("76");
	}
}
public class MethodOverRidingDemo1 
{	
	public static void main(String[] args) {
		
		Student2 obj=new Student2();
		obj.Student2marks();
		obj.Student1marks(90);
	}
}
