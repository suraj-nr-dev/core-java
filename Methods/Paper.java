class Paper{
	static void details(double height,double weight,double cost,boolean goodQuality, double width){
		System.out.println("height : "+height);
		System.out.println("weight : "+weight);
		System.out.println("cost : "+cost);
		System.out.println("Good Quality ? : "+goodQuality);
		System.out.println("width : "+width);
		
		if(height>=10 && height<=25){
			System.out.println("Height is perfect");
		}else{
			System.out.println("Height too high");
		}
		if(weight>=10 && weight<=30){
			System.out.println("Weight is Okay..");
		}else{
			System.out.println("Too high weight");
		}
		
	}
}