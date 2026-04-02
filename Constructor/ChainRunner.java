class ChainRunner{
	public static void main(String[] args) {
		
		Chain chain1 = new Chain(10.5, 55000, "Gold", "Yellow", 24.0, "Rope", "Tanishq", 22, false, "Lobster Clasp");
		chain1.show();
		
		Chain chain2 = new Chain(6.2, 18000, "Silver", "White", 20.0, "Box", "Malabar", 18, true, "Spring Ring");
		chain2.show();
		
		Chain chain3 = new Chain(8.0, 30000, "Gold", "Rose", 22.5, "Curb", "Kalyan", 24, false, "Hook Clasp");
		chain3.show();
	}
}