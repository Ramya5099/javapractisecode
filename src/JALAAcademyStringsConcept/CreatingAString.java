package JALAAcademyStringsConcept;

public class CreatingAString {

	public static void main(String[] args) {
		String s = "hello this is my first java code";
		System.out.println(s);

		// Concatenation
		String s1 = "Hello";
		String j = "Java";
		String k = "java";
		String u = "Java Program";
		String upper ="hi";
		String lower= "HI";
		System.out.println(s1 + j);
		// Length of the string
		System.out.println(s.length());
		// Index of a char
		System.out.println(s.indexOf('e'));
		// String comparision

		System.out.println(j == k);
		System.out.println(j.equals(k));
		// Trim the spaces
		String m = "  hello";
		System.out.println(m.trim());
		// EqualsIgnoreCase
		System.out.println(j.equalsIgnoreCase(k));
		// extracting a string
		System.out.println(s.substring(2));

		// split
		String st = "Selenium_python_java_dotnet";
		String sp[] = st.split("_");
		System.out.println(sp[0]);
		// starts and ends with
		System.out.println(s.startsWith("h"));
		System.out.println(s.endsWith("s"));
		// Compareto

		System.out.println(j.compareTo(u));

		// replace

		String h2 = "hello world";
		System.out.println(h2.replace(" ", ""));
		//Upper and lower case
		System.out.println(upper.toLowerCase());
		System.out.println(lower.toUpperCase());


	}

}
