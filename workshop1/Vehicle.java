package workshop1;

public class Vehicle {
	 
		void run(){
		    System.out.println("running...");
		    
		}  
		}  
		class Bike extends Vehicle{  
		void accelerate(){
		    System.out.println("accelerating...");
		    
		}  
		}  
		class Bike_2 extends Bike{  
		void nitro(){
		    System.out.println("accelerating with nitro...");
		    
		}  
		}  
		class Main{  
		public static void main(String args[]){  
		Bike_2 b=new Bike_2();  
		b.run();  
		b.accelerate(); 
		b.nitro();
		

	}

}
