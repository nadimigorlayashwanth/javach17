class Owner
{
	String name="Yashwanmth";
	int age=2;
	String gender;
	
	Owner()
	{
		
	}
	
	Owner(String gender)
	{
		this.gender=gender;
	}
	public void screen()
	{
		System.out.println("Owner Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("gender:"+this.gender);

	}
}




