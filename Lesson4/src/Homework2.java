
public class Homework2 {

	public static void main(String[] args) {
		String numOfResults = "Found 797 items";
		String valueBeforeResult = "Found ";
		String valueAfterResult = " items";
		
		int index1 = numOfResults.indexOf(valueBeforeResult);
		int index2 = numOfResults.indexOf(valueAfterResult);
		index1 +=6;
		
		String results = numOfResults.substring(index1, index2);
		int modResults = Integer.parseInt(results);
		modResults += 1;
		System.out.println(modResults);
	}

}
