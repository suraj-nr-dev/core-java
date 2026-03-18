class RingRunner{
	public static void main(String[] args){
		double wt = 5;
		double diameter = 2; 
		double cost = 80000;
		int noOfStones = 1;
		boolean isGold = true;
		
		Ring.details(wt,diameter,cost,noOfStones,isGold);
		
		System.out.println("------------------");
		Ring.details(2,3,40000,2,false);
		

	}
}