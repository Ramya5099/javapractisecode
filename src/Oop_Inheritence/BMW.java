package Oop_Inheritence;

public class BMW extends Car{
	
	public BMW() 
	{
		System.out.println("BMW constructor");

	}
	@Override
	public void start() {
	
		System.out.println("BMW car---start");
		}
	public void autoparking() {
		System.out.println( "BMW--auto parking");

	}
	
}
