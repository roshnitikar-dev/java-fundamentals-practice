class Factorial {
  int findFactorial(int a) {
    int fact=1;
    while(a>0) {
      fact = fact*a;
      a--;
    }
    return fact;
  }
}

class TestFactorial {
  public static void main(String[] args) 
  {
    Factorial f1= new Factorial();
    int res= f1.findFactorial(6);

  System.out.println("Factorial = " +res);
  }
}
