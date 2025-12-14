class Greeting {
	String printGreet(String s1) {
		String greet = "Hello "+s1;
		return greet;
	}
}

class TestGreeting {
	public static void main (String[] args) {
		Greeting g1= new Greeting();
		String msg=g1.printGreet("Avni");
		System.out.println(msg);
		
	}
}

