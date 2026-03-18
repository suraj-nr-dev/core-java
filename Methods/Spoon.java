class Spoon{
	static void details(double weight,double price,int length){
		System.out.println("Weight : "+weight);
		System.out.println("price : "+price);
		System.out.println("length : "+length);
		
		if(weight>=2 && weight<=5){
			System.out.println("Its Lite weight");
		}
		else{
			System.out.println("Too Heavy");
		}
		if(price>=80 && price<=199){
			System.out.println("Worth for buying");
		}else{
			System.out.println("Not Worth too high price");
		}
		if(length>=5 && length<=10){
			System.out.println("Length is worth");
		}else{
			System.out.println("Lenth is too high");
		}
	}
}