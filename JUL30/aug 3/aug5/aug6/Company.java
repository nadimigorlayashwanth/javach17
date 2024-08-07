class Company
{
	int id=098;
	String name="institute";
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer(50000);
	
	Company(String location)
	{
		this.location=location;
	}
	
	public void show()
	{
		System.out.println("company id:"+this.id);
		System.out.println("company name:"+this.name);
		System.out.println("company location:"+this.location);
		softwareEngineer.show();	
	}
	
	
}