class SoftwareEngineer
{
	String name="puru";
	int experience=8;
	String designation="developer";
	double salary;
	
	public void show()
	{
		System.out.println("Engineer Name:"+this.name);
		System.out.println("Experience:"+this.experience);
		System.out.println("Designation:"+this.designation);
		System.out.println("Salary:"+this.salary);

	}
	SoftwareEngineer(double salary)
	{
	     this.salary=salary;	
	}
	
}




