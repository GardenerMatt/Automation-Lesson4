
public class Homework4 {

	public static void main(String[] args) {
		String forward = "AbCdEfGhIj", backward = "";
		for (int i=forward.length()-1; i >= 0; i--){
			// System.out.println(forward.charAt(i));
			backward = backward + forward.charAt(i);
		}
		System.out.println(backward);
	}

}
