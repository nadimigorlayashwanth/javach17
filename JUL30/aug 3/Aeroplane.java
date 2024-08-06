class Aeroplane
{
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;
	
	Aeroplane()
	{
		
	}
	Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
	{
		this.company=company;
	    this.noOfSeats=noOfSeats;
        this.ticketPrice=ticketPrice;
        this.source=source;
        this.destination=destination;
		
	}
	Aeroplane(String company,String source,String destination)
	{
		this.company=company;
		this.source=source;
        this.destination=destination;
	}
	Aeroplane(String company,double ticketPrice,String source,String destination)
	{
		this.company=company;
        this.ticketPrice=ticketPrice;
        this.source=source;
        this.destination=destination;
	}
	
}


class Kerosene
{
	double price;
	int quantity;
	boolean quality;
	
	Kerosene()
	{
		
	}
	Kerosene(double price,int quantity,boolean quality)
	{
		this.price=price;
		this.quantity=quantity;
		this.quality=quality;
	}
	Kerosene(boolean quality)
	{
		this.quality=quality;
	}
	Kerosene(double price)
	{
	    this.price=price;	
	}
	
}



