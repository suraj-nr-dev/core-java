class DumbBellsRunner {
	public static void main(String[] args) {
		
		DumbBells dumbells1 = new DumbBells("Iron", 10, 2.5f, "Black", 2000f, true, "Kore", "India", 20, 2);
		System.out.println(dumbells1.material);
		System.out.println(dumbells1.weightKg);
		System.out.println(dumbells1.gripSize);
		System.out.println(dumbells1.color);
		System.out.println(dumbells1.pricePerSet);
		System.out.println(dumbells1.isAdjustable);
		System.out.println(dumbells1.brand);
		System.out.println(dumbells1.country);
		System.out.println(dumbells1.maxWeight);
		System.out.println(dumbells1.warranty);
		System.out.println("=========================================");
		
		DumbBells dumbells2 = new DumbBells("Rubber", 15, 3.0f, "Red", 3000f, false, "Nike", "USA", 30, 3);
		System.out.println(dumbells2.material);
		System.out.println(dumbells2.weightKg);
		System.out.println(dumbells2.gripSize);
		System.out.println(dumbells2.color);
		System.out.println(dumbells2.pricePerSet);
		System.out.println(dumbells2.isAdjustable);
		System.out.println(dumbells2.brand);
		System.out.println(dumbells2.country);
		System.out.println(dumbells2.maxWeight);
		System.out.println(dumbells2.warranty);
		System.out.println("=========================================");

		DumbBells dumbells3 = new DumbBells("Steel", 20, 3.5f, "Blue", 4000f, true, "Adidas", "Germany", 40, 4);
		System.out.println(dumbells3.material);
		System.out.println(dumbells3.weightKg);
		System.out.println(dumbells3.gripSize);
		System.out.println(dumbells3.color);
		System.out.println(dumbells3.pricePerSet);
		System.out.println(dumbells3.isAdjustable);
		System.out.println(dumbells3.brand);
		System.out.println(dumbells3.country);
		System.out.println(dumbells3.maxWeight);
		System.out.println(dumbells3.warranty);
		System.out.println("=========================================");

		
	}
}