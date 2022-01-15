
public class PBI extends RBI{

	public static void main(String[] args) {
		
// parent class reference and child class object allow only access of parent class methods
		
		RBI home = new PBI();
		home.HomeLoan();
		
		
	
		
	}
	
	public void HomeLoan()
	{
		
		System.out.println("home loan will be 8%");			
					
	}
	
	public void EMI()
	{
		
		System.out.println("EMI will be 2%");			
					
	}
	

	

}
