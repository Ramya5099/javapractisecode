package JavaBasics;

public class Car {

	String name;
	String color;
	double price;
	String type;
	
	public static void main(String[] args) {

		Car c1= new Car();
		c1.name= "BMW";
		c1.color= "Red";
		c1.price=12.33;
		c1.type="sedan";
		
		Car c2= new Car();
		
		c2.name= "Mini Cooper";
		//c2.color= "Red";
		c2.price=33.33;
		c2.type="small";
		
		
		System.out.println(c1.name + " "+ c1.color + " " + c1.price + " "+ c1.type);
		System.out.println(c2.name + " "+ c2.price + " "+ c2.type);

	}

}
