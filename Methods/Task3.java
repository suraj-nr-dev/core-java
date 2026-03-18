class Company{
	static void generate(){
		System.out.println("Company generating business");
	}
}
class CEO{
	static void supervise(){
		System.out.println("CEO is Supervise of the Company");
	}
}
class Executive{
	static void executive(){
		System.out.println("Executive of Company");
	}
}
class Director{
	static void decision(){
		System.out.println("Decision Maker of Company");
	}
}
class SeniourManager{
	static void coOrdinate(){
		System.out.println("SeniourManager is coOrdinator of company & Team");
	}
}
class Manager{
	static void manage(){
		System.out.println("Manager manages the Team");
		Team.develop();
	}
}
class Team{
	static void develop(){
		System.out.println("Team Develop the Projects");
	}
}
class TeamLead{
	static void guide(){
		System.out.println("TeamLead guide the Team");
	}
}
class SeniorEngineer{
	static void design(){
		System.out.println("Engineer Design the projects");
	}
}
class Engineer{
	static void code(){
		System.out.println("Coding Job");
	}
}
class Task3{
public static void main(String[] args){
	Company.generate();
	CEO.supervise();
	Executive.executive();
	Director.decision();
	SeniourManager.coOrdinate();
	Manager.manage();
	TeamLead.guide();
	SeniorEngineer.design();
	Engineer.code();
}
}