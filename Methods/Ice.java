class Ice{
	static void details(String brand,String flavour,double price,int calories){
		System.out.println("Brand : "+brand);
		System.out.println("Flavour : "+flavour);
		System.out.println("Price : "+price);
		System.out.println("Calories : "+calories);
		
		if(price>=25 && price<=60){
			System.out.println("Price is Worth");
		}else{
			System.out.println("Too high price");
		}
		if(calories>=250 && calories<=450){
			System.out.println("Calories is okay...");
		}
		else{
			System.out.println("Too much Calories..");
		}
		
		
	}
}