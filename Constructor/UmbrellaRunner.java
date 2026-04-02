class UmbrellaRunner{
	public static void main(String[] args) {
		
		Umbrella umbrella1 = new Umbrella("Popy", 500, "Black", 42, "Polyester", true, "Straight", "Rain", 0.5, "Unisex");
		umbrella1.show();
		
		Umbrella umbrella2 = new Umbrella("John's Umbrella", 800, "Blue", 45, "Nylon", false, "Curved", "Windproof", 0.7, "Men");
		umbrella2.show();
		
		Umbrella umbrella3 = new Umbrella("Sun Guard", 650, "Pink", 40, "UV Coated", true, "Plastic Grip", "Sun", 0.4, "Women");
		umbrella3.show();
	}
}