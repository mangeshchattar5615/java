

 class Bike {
 void run()
 {
	 System.out.println("Running");
 }
 class Splender extends Bike
 {
	 void run()
	 {
		System.out.println("Running safy with 60km");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
Bike b= new Splender();
b.run();
}

