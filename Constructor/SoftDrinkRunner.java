class SoftDrinkRunner{
	public static void main(String[] args) {
		
		SoftDrinks softdrink1 = new SoftDrinks("Coca-Cola", "Coca-Cola", 40, 500, "Cola", true, "Bottle", 53, "Dark Brown", "USA");
		softdrink1.show();
		
		SoftDrinks softdrink2 = new SoftDrinks("Pepsi", "Pepsi", 35, 500, "Cola", true, "Can", 50, "Dark Brown", "USA");
		softdrink2.show();
		
		SoftDrinks softdrink3 = new SoftDrinks("Sprite", "Coca-Cola", 40, 750, "Lemon", true, "Bottle", 45, "Clear", "USA");
		softdrink3.show();
	}
}