class RocketRunner{
	public static void main(String[] args) {
		
		Rocket rocket1 = new Rocket("PSLV", "Solid + Liquid", 44.0, 320000, "ISRO", "India", 4, 1750, false, "Satellite Launch");
		rocket1.show();
		
		Rocket rocket2 = new Rocket("Falcon 9", "Liquid Oxygen + RP-1", 70.0, 549000, "SpaceX", "USA", 2, 22800, true, "Orbital Launch");
		rocket2.show();
		
		Rocket rocket3 = new Rocket("GSLV Mk III", "Cryogenic", 43.5, 640000, "ISRO", "India", 3, 4000, false, "Heavy Lift");
		rocket3.show();
	}
}