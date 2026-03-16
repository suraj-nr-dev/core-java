class Polindrome{
	public static void main(String[] args){
		String str = "java";
		String reversed = "ava";
		String temp = str;
		
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			reversed = ch + reversed;
		}
		if(reversed==str){
			System.out.println("Polindrome");
		}
		else{
			System.out.println("Not Polindrome");
		}
	}
}