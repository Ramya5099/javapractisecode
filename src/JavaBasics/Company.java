package JavaBasics;

import java.util.Arrays;

public class Company {

	//Acceptance criteria
	//WAF-write a function
	//getEmpdevices
	//input parameters:employeeName(string)
	//return: all the devices---Array-devicename(string)

	public String[] getEmployeeDevices(String empName) {
		System.out.println("getting employee devices for employee name:" +empName);
		
		String devices[]= new String[5];
		
		if (empName.equals("naveen")) {
				 devices[0]= "macbook pro";
				 devices[1]= "Ipad";
				 devices[2]="mouse";
				 devices[3]="Keyboard";
				 devices[4]= "Iphone14";
				 
	}
		else if(empName.equals("Aman")) {
			 devices[0]= "windows";
			 devices[1]= "Samsung 7";
			 devices[2]="mouse";
		}
		else
		{
			System.out.println("emp not found:" +empName);
		}
		return devices;
	}
	public static void main(String[] args) {
   
		 Company co= new Company();
		String d1[] =co.getEmployeeDevices("Aman");
				 
		
		System.out.println("emp devices count:" +d1.length);
		System.out.println(Arrays.toString(d1));
						
	}

}
