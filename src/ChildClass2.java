
public class ChildClass2 extends ParentClass {

	public static void main(String[] args) {
		

		ParentClass obj3= new ParentClass();
		
		obj3.Sum();// parent class method only
	}

	
	public void Mult()
	{
		System.out.println("In mult");
	}
	
	public void Mult2()
	{
		System.out.println("In mult");
	}
}
