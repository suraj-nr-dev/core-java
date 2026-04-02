class InkPadRunner{
	public static void main(String[] args) {
		
		InkPad inkpad1 = new InkPad("Camlin", "Blue", 120, "Water-based", "Small", true, "Rectangle", "Plastic", 15, "Office");
		inkpad1.show();
		
		InkPad inkpad2 = new InkPad("Faber-Castell", "Black", 150, "Oil-based", "Medium", true, "Square", "Metal", 20, "Official Use");
		inkpad2.show();
		
		InkPad inkpad3 = new InkPad("Kores", "Red", 100, "Dye-based", "Large", false, "Rectangle", "Plastic", 18, "School");
		inkpad3.show();
	}
}