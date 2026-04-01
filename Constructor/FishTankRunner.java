class FishTankRunner {
	public static void main(String [] args){
		
		FishTank tank1 = new FishTank("Rectangle", 50, 40.5f, "Tempered", 10.5f, true, "Aqua", "India", 5000, 2);
		System.out.println(tank1.shape);
		System.out.println(tank1.capacity);
		System.out.println(tank1.waterLevel);
		System.out.println(tank1.glassType);
		System.out.println(tank1.weight);
		System.out.println(tank1.hasFilter);
		System.out.println(tank1.brand);
		System.out.println(tank1.country);
		System.out.println(tank1.price);
		System.out.println(tank1.warrantyYears);
		
		System.out.println("=========================================");
		
		FishTank tank2 = new FishTank("Round", 30, 25.0f, "Normal", 8.0f, false, "Ocean", "India", 3000, 1);
		System.out.println(tank2.shape);
		System.out.println(tank2.capacity);
		System.out.println(tank2.waterLevel);
		System.out.println(tank2.glassType);
		System.out.println(tank2.weight);
		System.out.println(tank2.hasFilter);
		System.out.println(tank2.brand);
		System.out.println(tank2.country);
		System.out.println(tank2.price);
		System.out.println(tank2.warrantyYears);
		
		System.out.println("=========================================");
		
		FishTank tank3 = new FishTank("Square", 40, 30.0f, "Acrylic", 9.5f, true, "BlueWave", "India", 4000, 2);
		System.out.println(tank3.shape);
		System.out.println(tank3.capacity);
		System.out.println(tank3.waterLevel);
		System.out.println(tank3.glassType);
		System.out.println(tank3.weight);
		System.out.println(tank3.hasFilter);
		System.out.println(tank3.brand);
		System.out.println(tank3.country);
		System.out.println(tank3.price);
		System.out.println(tank3.warrantyYears);
		
		System.out.println("=========================================");
		
		FishTank tank4 = new FishTank("Rectangle", 60, 50.0f, "Tempered", 12.0f, true, "Aqua", "India", 7000, 3);
		System.out.println(tank4.shape);
		System.out.println(tank4.capacity);
		System.out.println(tank4.waterLevel);
		System.out.println(tank4.glassType);
		System.out.println(tank4.weight);
		System.out.println(tank4.hasFilter);
		System.out.println(tank4.brand);
		System.out.println(tank4.country);
		System.out.println(tank4.price);
		System.out.println(tank4.warrantyYears);
		
		System.out.println("=========================================");
		
		FishTank tank5 = new FishTank("Round", 20, 15.0f, "Normal", 5.0f, false, "MiniAqua", "India", 2000, 1);
		System.out.println(tank5.shape);
		System.out.println(tank5.capacity);
		System.out.println(tank5.waterLevel);
		System.out.println(tank5.glassType);
		System.out.println(tank5.weight);
		System.out.println(tank5.hasFilter);
		System.out.println(tank5.brand);
		System.out.println(tank5.country);
		System.out.println(tank5.price);
		System.out.println(tank5.warrantyYears);
		
		System.out.println("=========================================");
	}
}