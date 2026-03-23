class CarModels{
	public static void main(String [] args) {
		
		String[] carModels = {
    "Tesla Model S", "Tesla Model 3", "Tesla Model X", "Tesla Model Y",
    "BMW X5", "BMW 3 Series", "Audi A4", "Audi Q7", "Mercedes C-Class",
    "Mercedes E-Class", "Toyota Fortuner", "Toyota Camry", "Honda City",
    "Honda Civic", "Hyundai Creta", "Hyundai i20", "Kia Seltos",
    "Kia Sonet", "Mahindra Thar", "Mahindra XUV700", "Maruti Swift",
    "Maruti Baleno", "Skoda Octavia", "Volkswagen Polo", "Ford Mustang"
		};
		
		int size = carModels.length;
		System.out.println("The length of car models : " +size);
		
		for(int start = 0; start<size; start++){
			
			String ref = carModels[start];
			
			System.out.println("The car models @ pos : " +ref);
		}
		
	}
}