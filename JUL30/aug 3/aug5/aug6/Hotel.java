
class Hotel
{
	String name="balaji";
	Owner owner=new Owner("male");
	
	public void screen()
	{
		System.out.println("Hotel Name:"+this.name);
		owner.screen();
	}
	
}