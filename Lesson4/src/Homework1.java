
public class Homework1 {

	public static void main(String[] args) {
		String address = "https://vpl.bibliocommons.com/search?page=100&q=java&t=keyword";
		String beginCriteria = "page=";
		String endCriteria = "&q";

		int index1 = address.indexOf(beginCriteria);
		int index2 = address.indexOf(endCriteria);

		// Since index1 gets us to the beginning of "page=", add 5 to get past the equal sign
		index1 += 5;
		String pageValue = address.substring(index1, index2);
		
		System.out.println(pageValue);		
	}

}
