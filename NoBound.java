
public class NoBound {
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt("z");
		int c = a / b;
		System.out.println("The quotient is "+c);
		}
}
