package bishal;

public class StrComparison {

	public static void main(String[] args) {
		String s1="bishal";
		String s2="Bishal";
		String s3="bishal";
		String s4="neel";
		System.out.println(s1.equals(s2));//here s2 starts with capital letter so it returns false
		System.out.println(s1.equals(s3));//here it returns true 
		System.out.println(s1==s3);//because both have same reference so it will return true
		System.out.println(s1.compareTo(s2));//returns true when first string is greater than the second string
		System.out.println(s2.compareTo(s1));//will return negative integer

	}

}
