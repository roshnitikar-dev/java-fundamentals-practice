class Calculator {

int addTwo(int a,int b ) {
	int sum=a+b;
	return sum;
}
}

class TestCalculator {
public static void main(String[] args) {
	Calculator c1= new Calculator();
	int res=c1.addTwo(6, 5);
	System.out.println("Sum of two numbers is "+res);
}
}
