class PhoneRunner
{
public static void main(String[] args)
{
		System.out.println("Running main method in paint Runner");
		
		Phone.purchase("Nippon Paints");
		Phone.purchase("Nippon Paints","Blue");
		
		Phone.purchase("Nippon Paints",12534.4);
		
		Phone.purchase("Blue","Arcylic",12534.4);
}
}