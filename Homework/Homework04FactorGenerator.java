import java.util.Scanner;

public class Homework04FactorGenerator{
  static int numberToFactor;
  
  public Homework04FactorGenerator(int numberToFactor){
    this.numberToFactor = numberToFactor;
  }
  
  public static void getFactors() { 
    for(int i = 2; i <= numberToFactor ; i++){
      if(numberToFactor % i == 0)
        System.out.println(i);
    }
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Give a Number to Factor: ");
    int number = in.nextInt();
    Homework04FactorGenerator x = new Homework04FactorGenerator(number);
    x.getFactors();
  }
}
    
