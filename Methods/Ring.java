class Ring{
	static void details(double weight,double diameter , double cost , int noOfStones,boolean isGold){
		System.out.println("weight : "+weight);
		System.out.println("diameter : "+diameter);
		System.out.println("cost : "+cost);
		System.out.println("noOfStones : "+noOfStones);
		System.out.println("Is this Gold ? : "+isGold);
		
		if(weight>=4 && weight<=8){
			System.out.println("valid weight");
		}else{
			System.out.println("Too heavy");
		}
		if(diameter>=5 && diameter<=10){
			System.out.println("valid diameter");
		}else{
			System.out.println("Not valid diameter");
		}
		if(cost>=15000 && cost<=100000){
			System.out.println("Cost is Worth");
		}else{
			System.out.println("Too high price");
		}
		if(noOfStones>=1 && noOfStones<=3){
			System.out.println("Min stone okay ");
		}else{
			System.out.println("Too much stone...");
		}
		if(isGold=true){
			System.out.println("Pure Gold take it...");
		}else{
			System.out.println("Not a gold");
		}
	}
}