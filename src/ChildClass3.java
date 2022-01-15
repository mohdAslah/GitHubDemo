
public class ChildClass3 extends ParentClass {

	public static void main(String[] args) {
		

		ChildClass3 obj3= new ChildClass3();
		
		obj3.Sum();// parent class method only
		obj3.Mult();
	}

	
	
	public void Mult()
	{
		System.out.println("In mult");
	}
}
