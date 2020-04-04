
public class NullExcep {
	public static void main(String args[]) {
		try {
			String a = "ABC"; // null value
			System.out.println(a.charAt(5));

		} 
		catch (Exception e) {
			System.out.println("NullPointerException..");
		}
	}

}
