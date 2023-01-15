package JALAAcademyStringsConcept;

public class NumbersToStringConvert {

	public static void main(String[] args) {
		int number = 1234;
		int intobj = 3456;
		String str = String.valueOf(number);
		System.out.println(str);
		StringBuilder sb = new StringBuilder();
		sb.append(intobj);
		String s = sb.toString();
		System.out.println(s);
	}

}
