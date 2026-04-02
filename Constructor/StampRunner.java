class StampRunner{
	public static void main(String[] args) {
		
		Stamp stamp1 = new Stamp("Approved", "Trodat", 300, "Blue", "Rectangle", "Medium", "Rubber", true, "Office", "Austria");
		stamp1.show();
		
		Stamp stamp2 = new Stamp("Paid", "Camlin", 150, "Red", "Square", "Small", "Plastic", false, "Shop", "India");
		stamp2.show();
		
		Stamp stamp3 = new Stamp("Confidential", "Kores", 250, "Black", "Round", "Large", "Rubber", true, "Official", "Germany");
		stamp3.show();
	}
}