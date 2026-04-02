class Locker{
	
	int lockerNumber;
	String location;
	double capacity;
	String material;
	boolean isOccupied;
	String securityType;
	double rentPerYear;
	String bankName;
	String sizeType;
	int accessCode;
	
	Locker(int lockerNumber,String location,double capacity,String material,
	       boolean isOccupied,String securityType,double rentPerYear,
	       String bankName,String sizeType,int accessCode){
		
		this.lockerNumber = lockerNumber;
		this.location = location;
		this.capacity = capacity;
		this.material = material;
		this.isOccupied = isOccupied;
		this.securityType = securityType;
		this.rentPerYear = rentPerYear;
		this.bankName = bankName;
		this.sizeType = sizeType;
		this.accessCode = accessCode;
		
		System.out.println("=======Executing the Constructor=====");
	}
	
	void show(){
		
		System.out.println("---------Accessing instance var in method--------");
		
		System.out.println("Locker Number : " + lockerNumber);
		System.out.println("Location : " + location);
		System.out.println("Capacity : " + capacity);
		System.out.println("Material : " + material);
		System.out.println("Is Occupied : " + isOccupied);
		System.out.println("Security Type : " + securityType);
		System.out.println("Rent Per Year : " + rentPerYear);
		System.out.println("Bank Name : " + bankName);
		System.out.println("Size Type : " + sizeType);
		System.out.println("Access Code : " + accessCode);
	}
}