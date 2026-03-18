class Chicken{
	static void details(double weight,int calories,int protein,double price){
		System.out.println("Weight : "+weight);
		System.out.println("Calories : "+calories);
		System.out.println("Protein : "+protein);
		System.out.println("price : "+price);
		
		
		if(calories>=250 && calories<=600){
			System.out.println("Calories is okay ...");
		}
		else
		{
			System.out.println("Too much of Cal");
		}
		if(protein>=125 && protein<=150){
			System.out.println("Protein is okay..");
		}
		else{
			System.out.println("Too much Protein not good");
		}
		if(price>=100 && price<=140){
			System.out.println("Price is oky for "+weight+" grams");
		}
		else{
			System.out.println("Price is too high");
		}
	}
}