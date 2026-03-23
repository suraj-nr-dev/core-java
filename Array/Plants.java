class Plants{
	public static void main(String [] args){
	String[] plantNames = {
    "Neem", "Tulsi", "Aloe Vera", "Bamboo", "Rose",
    "Sunflower", "Jasmine", "Lavender", "Mint", "Coriander",
    "Curry Leaf", "Banana Plant", "Mango Tree", "Coconut Tree",
    "Peepal", "Banyan", "Money Plant", "Snake Plant",
    "Spider Plant", "Fern", "Hibiscus", "Papaya Plant",
    "Guava Plant", "Tomato Plant", "Potato Plant"
		};
		
		int size = plantNames.length;
		System.out.println("The length of Plants Names : " +size);
		
		for(int start = 0; start<size; start++){
			
			String ref = plantNames[start];
			
			System.out.println("The Plant Names @ pos : " +ref);
		}
	}
}