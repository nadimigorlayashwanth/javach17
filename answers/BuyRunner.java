class BuyRunner{
	
	public static void main(String[]args) {
		Buy.product("lee",500);
		Buy.product("lee",-200);
		Buy.product("nike",1000);
		Buy.product("nike",-1000);
		Buy.product("fogg",50,"good",95);
		Buy.product("fogg",-50,"good",-95);
	    Buy.bookMovieTicket("Indian","mantriSquare",3,170);
	    Buy.bookMovieTicket("Indian","mantriSquare",-3,-170);
		Buy.buyEgg(40,6);
		Buy.buyEgg(40,-6);
		Buy.buyShampoo(400,250,"sunSilk","1 july");
		Buy.buyShampoo(-400,-250,"sunSilk","1 july");
		Buy.buyCake('9',"square","strawberry",350,50);
        Buy.buyCake('9',"square","strawberry",-350,-50);
		Buy.buyLaptop("hp",23654586,45000,250, 26.6,"windows",500,256);
		Buy.buyLaptop("hp",23654586,-45000,250 ,26.6,"windows",500,256);
		Buy.buySmartWatch("noise",3000,7,'s',50);
		Buy.buySmartWatch("noise",-3000,7,'s',50);
		}
}
