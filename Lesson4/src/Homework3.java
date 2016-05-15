
public class Homework3 {

	public static void main(String[] args) {
		String fiveWords = "Java for Dummies Quick Reference";
		
		int indexBegin = fiveWords.indexOf(" ");
		int indexEnd = fiveWords.lastIndexOf(" ");
		String middleWords = fiveWords.substring(indexBegin+1, indexEnd);
		// System.out.println(middleWords);
		
		int subIndexBegin = middleWords.indexOf(" ");
		int subIndexEnd = middleWords.lastIndexOf(" ");
		String thirdWord = middleWords.substring(subIndexBegin+1, subIndexEnd);
		
		System.out.println(thirdWord);
	}

}
