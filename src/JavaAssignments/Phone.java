package JavaAssignments;

public class Phone {
	String name;
	String color;
	String type;
	public static void main(String[] args) {

		Phone p1 =new Phone();
		p1.name= "Apple";
		p1.color= "Rose gold";
		p1.type= "big";
		
		Phone p2 =new Phone();
		p2.name= "Samsung";
		p2.color= "purple";
		p2.type= "Medium";
		

		Phone p3 =new Phone();
		p3.name= "Nokia";
		p3.color= "Red";
		p3.type= "Small";
		
		Phone p4 =new Phone();
		p4.name= "Oppo";
		p4.color= "Black";
		p4.type= "big";
		
		Phone p5 =new Phone();
		p5.name= "One Plus";
		p5.color= "Moonstone Black";
		p5.type= "Medium";
		
		
		System.out.println(p1.name + " "+p1.color+ " "+ p1.type);
		System.out.println(p2.name + " "+p2.color+ " "+ p2.type);
		System.out.println(p3.name + " "+p3.color+ " "+ p3.type);
		System.out.println(p4.name + " "+p4.color+ " "+ p4.type);
		System.out.println(p5.name + " "+p5.color+ " "+ p5.type);

		System.out.println("............");
		
	p2=p4;
		
		System.out.println(p1.name + " "+p1.color+ " "+ p1.type);
		System.out.println(p2.name + " "+p2.color+ " "+ p2.type);
		System.out.println(p3.name + " "+p3.color+ " "+ p3.type);
		System.out.println(p4.name + " "+p4.color+ " "+ p4.type);
		System.out.println(p5.name + " "+p5.color+ " "+ p5.type);
		
		System.out.println("............");

	p4=p5;
		
		System.out.println(p1.name + " "+p1.color+ " "+ p1.type);
		System.out.println(p2.name + " "+p2.color+ " "+ p2.type);
		System.out.println(p3.name + " "+p3.color+ " "+ p3.type);
		System.out.println(p4.name + " "+p4.color+ " "+ p4.type);
		System.out.println(p5.name + " "+p5.color+ " "+ p5.type);

		System.out.println("............");
		
	p5=p1;
		
		System.out.println(p1.name + " "+p1.color+ " "+ p1.type);
		System.out.println(p2.name + " "+p2.color+ " "+ p2.type);
		System.out.println(p3.name + " "+p3.color+ " "+ p3.type);
		System.out.println(p4.name + " "+p4.color+ " "+ p4.type);
		System.out.println(p5.name + " "+p5.color+ " "+ p5.type);

			
		System.out.println("............");

	p1=p3;
		
		System.out.println(p1.name + " "+p1.color+ " "+ p1.type);
		System.out.println(p2.name + " "+p2.color+ " "+ p2.type);
		System.out.println(p3.name + " "+p3.color+ " "+ p3.type);
		System.out.println(p4.name + " "+p4.color+ " "+ p4.type);
		System.out.println(p5.name + " "+p5.color+ " "+ p5.type);
		
	    System.out.println("............");
	
	p5=p3;
	
	    System.out.println(p1.name + " "+p1.color+ " "+ p1.type);
	    System.out.println(p2.name + " "+p2.color+ " "+ p2.type);
	    System.out.println(p3.name + " "+p3.color+ " "+ p3.type);
	    System.out.println(p4.name + " "+p4.color+ " "+ p4.type);
	    System.out.println(p5.name + " "+p5.color+ " "+ p5.type);
	
	    System.out.println("............");
	
	p1=p4;
	    
	    System.out.println(p1.name + " "+p1.color+ " "+ p1.type);
	    System.out.println(p2.name + " "+p2.color+ " "+ p2.type);
	    System.out.println(p3.name + " "+p3.color+ " "+ p3.type);
	    System.out.println(p4.name + " "+p4.color+ " "+ p4.type);
	    System.out.println(p5.name + " "+p5.color+ " "+ p5.type);
	
	    System.out.println("............");
	
	
}
}