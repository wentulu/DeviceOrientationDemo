public class Operator{


	public static void main(String[] args){
		int a = 9;
		double b = 0.99;
		System.out.println("result = "+(a+b));
		try{
			System.out.println("result = "+(a/0));
		}catch(Exception e){
			System.out.println("bunengwei0");
		}
		System.out.println("result = "+(b/0));
	}
}