package JavaBasics;

public class StringConcept {

	public static void main(String[] args) {
		// String -Is a class-default class-always write 'S' as Capital
		//String will be concatinated with anything
		String s="hello this is my first java code";
		System.out.println(s);
         
		String s1="100";
         System.out.println(s1+10);
         String x="hello";
         String y="Selenium";
         
         int a=100;
         int b=200;
         System.out.println(x+y+a+b); //HelloSelenium100200
         
         System.out.println(a+b+x+y); //300helloselenium
         
        char c1='t';
         System.out.println(x+c1);
         
         byte b1=30;
         System.out.println(y+b1);
}
}