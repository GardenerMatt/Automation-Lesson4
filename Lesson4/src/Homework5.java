
public class Homework5 {

	public static void main(String[] args) {
		String letters = "Hi how are";
		System.out.println(letters.length() - letters.replaceAll("a|e|i|o|u|", "").length());
	}

}
