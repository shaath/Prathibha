package day10;

public class TryCatchEg {

	public static void main(String[] args) {
		
		try{
			int res = 100/10;
			System.out.println("Result "+res);
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("This is exception handling code");
		

	}

}
