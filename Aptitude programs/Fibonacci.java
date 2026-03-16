class Fibonacci{
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		int num = 10;
		
		for(int i=0; i<num; i++){
			System.out.println(a);
			int temp = a + b;
			System.out.println(" " +temp);
			a = b;
			b = temp;
		}
		
	}
}