package Oop_Inheritence;

public class Testcar {

	public static void main(String[] args) {
		BMW b= new BMW();
		b.start();
		b.stop();   //inherited from parent Car class
		b.refuel();  // inherited from parent Car class
		b.autoparking(); //individual class of BMW class
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		
		// top casting: Child class object can be referred by parent class reference variable
		
		 Car c1= new BMW();
		 c1.start();
		 c1.stop();
		 c1.refuel();
		 
		 //Down casting: parent class object can be referred by child class reference variable
		 
	       BMW b1= (BMW)new Car(); // will get Class cast Exception.
	        //we are converting car type variable into BMW class type
	}

}
