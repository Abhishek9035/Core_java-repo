//Method OverLoading.There is no need of inheritance.

class A
{
	int i;
	int j;
	public void add()
	{
		System.err.println(i+j);
	}

	public void add(int i,int j)
	{
		System.err.println(i+j);
	}
	
	public void add(int i,int j,int k)
	{
		System.err.println(i+j+k);
	}

}
public class MethodOverLoadingDemo2 {

	public static void main(String[] args) {
		
		A obj=new A();
		obj.i=9;
		obj.j=10;
		obj.add();
		obj.add(45,55);
		obj.add(500,400,300);
		
		
	}

}
