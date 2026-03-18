class FoodItem{
	
	static double getPriceByItem(String item){
		System.out.println("Executing getPriceByItem of arg item : " +item);
		
		if("dosa"==item){
			System.out.println("Price of dosa is 80");
			return 80.0;
		}
		if("idli"==item){
			System.out.println("Price of idli is 40");
			return 40.0;
		}
		if("burger"==item){
			System.out.println("Price of burger is 250");
			return 250.0;
		}
		if("briyani"==item){
			System.out.println("Price of briyani is 150");
			return 150.0;
		}
		if("pizza"==item){
			System.out.println("Price of pizza is 350");
			return 350.0;
		}
		
		else{
			System.out.println("Item not matching ");
		}
		return 0;
	}
}