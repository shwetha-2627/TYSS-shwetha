package collections;

abstract class Electronics {

	  public abstract void brand();
	  
}

class Laptop extends Electronics{
	
	public String name;
	
	public Laptop(String name) {
		
		this.name=name;
		
	}

	public void brand()
	{
		System.out.println("this laptop brand name is : " +name);
	}
}

class Lenovo extends Laptop
{
	public Lenovo(String name) {
		super(name);
	}
	public static void main(String [] args) {
	Laptop lenovoLaptop = new Laptop("LENOVO");
	
	lenovoLaptop.brand() ;
	}
}
