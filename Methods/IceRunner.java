class IceRunner{
	public static void main(String[] args){
		String brand = "Amul";
		String flavour = "Chocolate";
		double cost = 45;
		int calories = 350;
		
		Ice.details(brand,flavour,cost,calories);
		
		Ice.details("Amul","Vanila",50,270);
	}
}