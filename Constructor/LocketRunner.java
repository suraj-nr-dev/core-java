class LocketRunner{
	public static void main(String[] args) {
		
		
		Locket locket = new Locket(2.00,200,"12k", "Silver", "Gold", 3.8, false, "Malabar", 13, "Round");
		locket.show();
		
		Locket locket1 = new Locket(1.5, 1500, "10k", "Silver", "White", 2.8, false, "Malabar", 18, "Round");
		locket1.show();
		
		Locket locket2 = new Locket(3.2, 3500, "18k", "Gold", "Rose", 4.0, true, "Kalyan", 24, "Custom Design");
		locket1.show();
	}
}