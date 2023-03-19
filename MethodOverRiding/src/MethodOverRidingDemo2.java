// Constructor OverRiding by using inheritance.
class A
{
	public A()
	{
		System.out.println("In A");
	}
	public A(int a,int b)
	{
		System.out.println(5+6);
	}
}
class B extends A
{
	public B()
	{
		System.out.println("In B");
	}
	public B(int a,int b)
	{
		super(a,b);
		System.out.println(a+b);
	}
}


public class MethodOverRidingDemo2 {

	public static void main(String[] args) {
		
		B obj=new B();
		B obj1=new B(3,2);
	}

}
