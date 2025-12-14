class VoteEligibility {
 String age(int a) {
	 if(a>=18) {
		 return "Eligible";
	 } else {
		 return "Not Eligible";
	 }
 }
}

class TestVoter {
public static void main(String[] args) {
	VoteEligibility v1 = new VoteEligibility ();
	String res= v1.age(22);
	System.out.println("Voter is "+res);
	}
}
