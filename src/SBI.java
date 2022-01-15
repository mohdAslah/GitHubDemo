
public class SBI extends RBI {

	public static void main(String[] args) {
	//Note: child class reference and child class object: you can access all the methods
// from parent and child but in case of same method name only child method will be called.
		
		SBI home= new SBI();
		
		home.HomeLoan();
		

	}
	
	public void HomeLoan()
	{
		
		System.out.println("home loan will be 3%");			
					
		
	}
	
	

}
