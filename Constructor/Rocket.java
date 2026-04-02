class Rocket{
	
	String name;
	String fuelType;
	double height;
	double weight;
	String manufacturer;
	String country;
	int stages;
	double payloadCapacity;
	boolean isReusable;
	String missionType;
	
	Rocket(String name,String fuelType,double height,double weight,
	       String manufacturer,String country,int stages,
	       double payloadCapacity,boolean isReusable,String missionType){
		
		this.name = name;
		this.fuelType = fuelType;
		this.height = height;
		this.weight = weight;
		this.manufacturer = manufacturer;
		this.country = country;
		this.stages = stages;
		this.payloadCapacity = payloadCapacity;
		this.isReusable = isReusable;
		this.missionType = missionType;
		
		System.out.println("=======Executing the Constructor=====");
	}
	
	void show(){
		
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Name : " + name);
		System.out.println("Fuel Type : " + fuelType);
		System.out.println("Height : " + height);
		System.out.println("Weight : " + weight);
		System.out.println("Manufacturer : " + manufacturer);
		System.out.println("Country : " + country);
		System.out.println("Stages : " + stages);
		System.out.println("Payload Capacity : " + payloadCapacity);
		System.out.println("Reusable : " + isReusable);
		System.out.println("Mission Type : " + missionType);
	}
}