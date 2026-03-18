class Coffee{
	static void details(String brand,String size,String type,int sugarLevel,double price){
		
		System.out.println("Coffee Brand : "+brand);
		System.out.println("Coffee Cup Size : "+size);
		System.out.println("Type of Coffee : "+type);
		System.out.println("SugarLevel : "+sugarLevel);
		System.out.println("Price  : "+price);
		
		if(sugarLevel>=2 && sugarLevel<=5){
			System.out.println("Sugarlevel is okay");
		}else{
			System.out.println("Too much of Sugar");
		}
		if(price>=20 && price <=30){
			System.out.println("Price is okay..");
		}else{
			System.out.println("Price is too high");
		}
	}
}