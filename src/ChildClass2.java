
public class ChildClass2 extends ParentClass {

	public static void main(String[] args) {
		

		ParentClass obj3= new ParentClass();
		
		obj3.Sum();// parent class method only
	}

	
	public void Mult()
	{
		System.out.println("In mult");
	}
	public void white()
	{
		System.out.println("In mult");
	}
	
	public void green()
	{
		System.out.println("In mult");
		System.out.println("In green");

	}
	
	public void blue()
	{
		System.out.println("In mult");
	}
	
	

	
	public void Mult2()
	{
		System.out.println("In yellow");
		System.out.println("In blue");
		System.out.println("In green");


	}
}
