import java.util.Random;
public class Homework04BuffonNeedle { 
  public static double checkBN(){
    Random rand = new Random() ; 
    int yLow = rand.nextInt(3) ; 
    double alpha = Math.toRadians((double)rand.nextInt(181)) ; 
    int hits = 0 ; 
    int attempts = 0 ; 
    double yHigh = yLow + Math.sin(alpha) ; 
    while (attempts < 10000){ 
      if(yHigh >= 2) { 
        hits += 1 ; 
        attempts += 1 ; 
        yLow = rand.nextInt(3) ; 
        alpha = rand.nextInt(181) ; 
        yHigh = yLow + Math.sin(alpha) ; 
      } 
      else { 
        attempts += 1 ; 
        yLow = rand.nextInt(3) ; 
        alpha = rand.nextInt(181) ; 
        yHigh = yLow + Math.sin(alpha) ; 
      } 
    } 
    return attempts/hits ; 
  }
  
  public static void main(String[] args){
    System.out.println(checkBN());
}
}
