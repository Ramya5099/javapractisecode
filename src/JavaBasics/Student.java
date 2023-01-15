package JavaBasics;

public class Student {
	//AC : 0-100;
			// WAF(write a function): pass the student name(string) as input parameter
			// return student marks(int)
			//else print a message-- student not found-return?
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student:" +studentName);
		int marks= -1;
		if (studentName.equals("aman"))
		{
			return 90;
			
		}
		else if(studentName.equals("Rekha"))
		{
			return 95;
		}
		else if(studentName.equals("Ajith"))
				{
					return 100;
				}
	   else 
		{
			System.out.println("student name is not found..."+studentName);
			return -1;
		}
}

	

	
	public static void main(String[] args) {
	 Student st = new Student();
	 int m1=st.getStudentMarks("Aman");
	 		System.out.println(m1);

	}

	}
