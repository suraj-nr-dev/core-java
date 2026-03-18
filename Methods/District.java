class District{
 static void run(){
	 System.out.println("Bengaluru");
 }
 static void taxing(){
	 System.out.println("District collecting Tax");
 }
 static void measure(){
	 System.out.println("Land measuring");
 }
 static void collect(){
	 System.out.println("Collecting the Land Records");
 }
 static void revenue(){
	 System.out.println("Revenue Department");
 }
 static void budget(){
	 System.out.println("Budget allocation");
 }
 public static void main(String[] args){
	 Country.run();
	 State.run();
	 run();
	 taxing();
	 measure();
	 collect();
	 revenue();
	 budget();
	 
 }
}