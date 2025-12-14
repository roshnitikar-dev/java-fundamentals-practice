class Num {
int numMax(int a, int b, int c) {
	if(a>=b && a>=c) {
		return a;
	} else if(b>=a && b>=c) {
		return b;
	} else {
		return c;
	}
}
}

class TestNum {
public static void main(String[] args) {
	Num n1= new Num();
	int res= n1.numMax(6, 8, 17);
	System.out.println("Maximum number = "+res);
}
}
