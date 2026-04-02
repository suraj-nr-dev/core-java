class SpecsRunner{
	public static void main(String[] args) {
		 
		
		Specs specs = new Specs(2500, "RayBan", "Full Frame", "Anti Glare", "Black", 52, true, "Metal", "Round", "Unisex");
		specs.show();
		
		Specs specs1 = new Specs(1800, "Lenskart", "Half Frame", "Blue Cut", "Brown", 50, true, "Plastic", "Rectangle", "Men");
		specs1.show();
		
		Specs specs2 = new Specs(3200, "Titan Eye+", "Rimless", "UV Protection", "Silver", 54, false, "Fiber", "Square", "Women");
		specs2.show();
	}
}