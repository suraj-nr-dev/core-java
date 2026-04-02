class BoomerRunner{
	public static void main(String[] args) {
		
		Boomer boomer1 = new Boomer("Wood", 30.5, 0.3, "V-Shape", "Brown", true, "AeroBoom", "Australia", 1200, "Beginner");
		boomer1.show();
		
		Boomer boomer2 = new Boomer("Plastic", 25.0, 0.2, "Tri-Blade", "Red", true, "SkyFly", "USA", 900, "Intermediate");
		boomer2.show();
		
		Boomer boomer3 = new Boomer("Carbon Fiber", 28.0, 0.25, "Hook", "Black", false, "ProSpin", "Germany", 2500, "Advanced");
		boomer3.show();
	}
}