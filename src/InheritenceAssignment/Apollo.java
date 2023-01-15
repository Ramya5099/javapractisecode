package InheritenceAssignment;

public class Apollo extends Hospitals{
	
	@Override
	public void Machinery(){
		 System.out.println("Hospitals ---machinery");
		 
	 }
   @Override
	public void Department() {
	 System.out.println("Hospitals ---Emergency Department");
	 
}
   public static void staff() {
	System.out.println( "Apollo ---Staff");
}
   public static void Outpatients() {
	   System.out.println( " Apollo---Outpatients");
   }
	

}
