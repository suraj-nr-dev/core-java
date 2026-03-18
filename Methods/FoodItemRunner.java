class FoodItemRunner{

public static void main(String [] args){
	
	String item = "dosa";
	System.out.println("The price of the item : "+item);
	
	double price = FoodItem.getPriceByItem(item);
	
	
	price = FoodItem.getPriceByItem("idli");
	price = FoodItem.getPriceByItem("burger");
	price = FoodItem.getPriceByItem("briyani");
	price = FoodItem.getPriceByItem("pizza");
	
	

	
	
	
}
}