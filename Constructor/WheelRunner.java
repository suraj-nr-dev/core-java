class WheelRunner {
	public static void main(String[] args) {
		
		Wheel wheel1 = new Wheel("Alloy", 15, 7.5f, "Steel", 8.5f, true, "MRF", "Car", 4000, 5);
		System.out.println(wheel1.type);
		System.out.println(wheel1.radius);
		System.out.println(wheel1.thickness);
		System.out.println(wheel1.material);
		System.out.println(wheel1.weight);
		System.out.println(wheel1.isTubeless);
		System.out.println(wheel1.brand);
		System.out.println(wheel1.vehicleType);
		System.out.println(wheel1.price);
		System.out.println(wheel1.durability);
		System.out.println("=========================================");
		
		Wheel wheel2 = new Wheel("Steel", 14, 6.5f, "Iron", 9.0f, false, "Apollo", "Bike", 3000, 4);
		System.out.println(wheel2.type);
		System.out.println(wheel2.radius);
		System.out.println(wheel2.thickness);
		System.out.println(wheel2.material);
		System.out.println(wheel2.weight);
		System.out.println(wheel2.isTubeless);
		System.out.println(wheel2.brand);
		System.out.println(wheel2.vehicleType);
		System.out.println(wheel2.price);
		System.out.println(wheel2.durability);
		System.out.println("=========================================");

		Wheel wheel3 = new Wheel("Alloy", 16, 8.0f, "Aluminum", 7.5f, true, "CEAT", "Car", 5000, 6);
		System.out.println(wheel3.type);
		System.out.println(wheel3.radius);
		System.out.println(wheel3.thickness);
		System.out.println(wheel3.material);
		System.out.println(wheel3.weight);
		System.out.println(wheel3.isTubeless);
		System.out.println(wheel3.brand);
		System.out.println(wheel3.vehicleType);
		System.out.println(wheel3.price);
		System.out.println(wheel3.durability);
		System.out.println("=========================================");

	
	}
}