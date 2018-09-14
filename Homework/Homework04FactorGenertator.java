import java.util.Scanner;

public class Homework04FactorGenertator{
  int numberToFactor;
  
  FactorGenerator(int numberToFactor){
    this.numberToFactor = numberToFactor;
  }
  
  public static int getFactors() { 
    int n = numberToFactor;
    int last = 0; 
    if (n<=1) { 
      return 1; 
    } 
    for(int i=2; i<=n; i++)
    { 
      if(n%i==0){ 
      System.out.println(i + "| " + n); 
      System.out.println(" -----"); 
      last = i; } 
    } 
    if (last != 0) { 
      return getFactors(n/last); 
    } 
    else { 
      return 1; 
    } 
  }
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    Homework04FactorGenerator x = new Homework04FactorGenerator(number);
    x.getFactor();
    in.close();
  }
    
