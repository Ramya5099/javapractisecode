package JavaAssignments;

public class Student {

	public static void main(String[] args) {
		int marks=95;
		switch(marks)
		{
		case 90:
			System.out.println("Aman marks:"+ marks);
			break;
		case 95:
			System.out.println("Rekha marks:"+ marks);
			break;
		case 100:
			System.out.println("Ajith marks:"+ marks);
			break;
			default:
				System.out.println("Student not found");
				break;
			
		}

	}

}
