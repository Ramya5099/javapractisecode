package JALAAcademyInheritence;

public class TestClass {

	public static void main(String[] args) {
		AClass ac = new AClass();
		ac.m1();
		ac.m2();
		ac.m3();

		BClass bc = new BClass();
		bc.m1();
		bc.m4();
		bc.m5();

		

		ClassC cc = new ClassC();
		cc.m6();
		cc.m7();
		
	BClass b= (BClass) new AClass();
	b.m1();
	}

}
