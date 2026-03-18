class CoffeeRunner{
	public static void main(String[] args){
		String brand = "NesCoffee";
		String size = "Medium";
		String type = "Hot";
		int sugarLevel = 2;
		double price = 20;
		
		Coffee.details(brand,size,type,sugarLevel,price);
		
		Coffee.details("BRU","Medium","BlackCoffee",3,25);
	}
}