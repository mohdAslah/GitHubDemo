
public class NormalClass extends BaseClass{

	public static void main(String[] args) {
		
		//base class reference and base class object: can access only methods of base
		
		//BaseClass obj1= new BaseClass();
		//obj1.Sub();
		//obj1.Sum();
		
		//Child  class reference and child class object: can access  methods of base and child both
		
		//NormalClass obj1= new NormalClass();
		
		//obj1.Sine();
		//obj1.Cos();
		//obj1.Sub();
		//obj1.Sum();
		
		//Child  class reference and base class object: not possible(cant create object for parent)
		
		//NormalClass obj1 =new BaseClass();
		
		//base  class reference and child class object: can access only methods of base

		BaseClass obj1= new NormalClass();
		
		obj1.Sub();
		obj1.Sum();
		
	}
	
	
	public void Sine()
	{
		
		System.out.println("In Trigno method sin");
	}
	
	public void Cos()
	{
		
		System.out.println("In Trigno method cos");
	}

}
