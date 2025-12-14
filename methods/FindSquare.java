class FindSquare {
int sqr(int a) {
	int squ = a*a;
	return squ;
}
}

class TestSquare {
public static void main(String[] args) {
	FindSquare f1= new FindSquare();
	int res=f1.sqr(6);
	System.out.println("Square of a number is "+res);
}
}
