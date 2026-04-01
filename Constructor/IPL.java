class IPL {
	
	String teamName;
	int matches;
	float runRate;
	String captain;
	int points;
	boolean qualified;
	String coach;
	String country;
	int trophies;
	int ranking;

	IPL(String teamName,int matches,float runRate,String captain,int points,boolean qualified,String coach,
	String country,int trophies,int ranking){
		
		this.teamName = teamName;
		this.matches = matches;
		this.runRate = runRate;
		this.captain = captain;
		this.points = points;
		this.qualified = qualified;
		this.coach = coach;
		this.country = country;
		this.trophies = trophies;
		this.ranking = ranking;

		System.out.println("Updating the this keyword ....");
	}
}