class Key{
	static void details(double weight,int size,String matrial,int quantity){
		System.out.println("Weight : "+weight);
		System.out.println("Size : "+size);
		System.out.println("Material : "+matrial);
		System.out.println("Quantity : "+quantity);
		
		if(weight>=3 && weight<=8){
			System.out.println("Key Weight is Okay..");
		}else{
			System.out.println("Too high weight");
		}
		if(size>=5 && size<=8){
			System.out.println("Key length is okay..");
		}else{
			System.out.println("Too much long length");
		}
	}
}