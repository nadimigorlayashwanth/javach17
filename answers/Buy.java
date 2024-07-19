class Buy {
	
	public static void product(String brand,double price) {
		System.out.println("running product in Buy");
		System.out.println("brand="+brand);
	    System.out.println("price="+price); 
		if (price>=900 && price<=2000) {
			System.out.println("price is valid");
		}
		else  {
			System.out.println("price is not valid");
		}
	}
	
		public static void product(String name,int quantity,String quality,double price ) {
	    System.out.println("running product in Buy");
		System.out.println("name="+name);
		System.out.println("quantity="+quantity);
		System.out.println("quality="+quality);
		System.out.println("price="+price);
		
		if (price>=90 && price<=200) {
			System.out.println("price is valid");
		}
		else  {
			System.out.println("price is not valid");
		}
	}	
	
	public static void bookMovieTicket(String name,String theatreName,int quantity,double price) {
		System.out.println("running bookMovieTicket in Buy");
		System.out.println("name="+name);
		System.out.println("theatreName="+theatreName);
		System.out.println("quantity="+quantity);
		System.out.println("price="+price);
		if (price>=150 && price<=300) {
			System.out.println("price is valid");
		}
		else  {
			System.out.println("price is not valid");
		}
	}
	
	public static void buyEgg(int total,double pricePerEgg) {
		System.out.println("running buyEgg in Buy");
		System.out.println("total="+total);
		System.out.println("pricePerEgg="+pricePerEgg);
		if (pricePerEgg>=5.5 && pricePerEgg<=7) {
			System.out.println("this is valid Egg price");
		}
		else  {
			System.out.println("this is not valid Egg price");
		}
	}		
	
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate) {
		System.out.println("running buyShampoo in Buy");
		System.out.println("quantityInMl="+quantityInMl);
		System.out.println("price="+price);
		System.out.println("brand="+brand);
		System.out.println("manfDate="+manfDate);
		if (price>=200 && price<=300) {
			System.out.println("price is valid");
		}
		else  {
			System.out.println("price is not valid");
		}
	}
	
	public static void buyCake(char size,String type,String flavour,double cost,int quantity) {
		System.out.println("running buyCake in Buy");
		System.out.println("size="+size);
		System.out.println("type="+type);
		System.out.println("flavour="+flavour);
		System.out.println("cost="+cost);
		System.out.println("quantity="+quantity);
		if (cost>=200 && cost<=300) {
			System.out.println("cost is valid");
		}
		else  {
			System.out.println("cost is not valid");
		}
	}
	
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int hardDiskSize,int ramSize) {
		System.out.println("running buyLaptop in Buy");
		System.out.println("brand="+brand);
		System.out.println("serialNo="+serialNo);
		System.out.println("price="+price);
		System.out.println("batteryCapacity="+batteryCapacity);
		System.out.println("screenSize="+screenSize);
		System.out.println("os="+os);
		System.out.println("hardDiskSize="+hardDiskSize);
		System.out.println("ramSize="+ramSize);
		if (price>=40000 && price<=50000) {
			System.out.println("price is valid");
		}
		else  {
			System.out.println("price is not valid");
		}
	}
	
	public static void buySmartWatch(String brand,double price,int colour,char type,int mode) {
		System.out.println("running buySmartWatch in Buy");
		System.out.println("brand="+brand);
		System.out.println("price="+price);
		System.out.println("colour="+colour);
		System.out.println("type="+type);
		System.out.println("mode="+mode);
		
		if (price>=3000 && price<=4000) {
			System.out.println("price is valid");
		}
		else  {
			System.out.println("price is not valid");
		}
	}	
}