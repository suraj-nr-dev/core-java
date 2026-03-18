class ChickenRunner{
	public static void main(String[] args){
		double weight = 500;
		int calories = 550;
		int protein = 125;
		double price = 140;
	
		Chicken.details(weight,calories,protein,price);
		
		Chicken.details(300,400,80,100);
	}
}