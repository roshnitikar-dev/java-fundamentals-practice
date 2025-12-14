class Calci {
int addition(int a, int b) {
	int sum= a+b;
	return sum;
}
int substraction(int a, int b) {
	int sub = a-b;
	return sub;
}
int multiplication(int a, int b) {
	int multiplication = a*b;
	return multiplication;
}
}


class TestCalci {
public static void main(String[] args) {
	Calci c1= new Calci();
	int addi= c1.addition(6, 5);
	int subs=c1.substraction(7, 6);
	int multip=c1.multiplication(6, 4);
	
	System.out.println("Addition= "+addi);
	System.out.println("Subtraction= "+subs);
	System.out.println("Multiplication= "+multip);
}
}
