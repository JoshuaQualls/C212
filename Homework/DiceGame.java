import java.util.Random;

public class DiceGame {
  static Random rand = new Random();
  static int wins = 0;
  static int losses = 0;
  
  public static void play4Game(){
    int count = 0;
    for(int i = 0; i < 4; i++){
      int num = rand.nextInt((6-1)+1)+1;
      if(num == 6)
        count++;
    }
    if(count>0)
      wins++;
    else
      losses++;
  }
    public static void play24Game(){
    int count = 0;
    for(int i = 0; i < 24; i++){
      int n1 = rand.nextInt((6-1)+1)+1;
      int n2 = rand.nextInt((6-1)+1)+1;
      if(n1 == 6 && n2 == 6)
        count++;
    }
    if(count>0)
      wins++;
    else
      losses++;
  }
  
  public static void main(String[] args){
    for(int i = 0; i < 1000000; i++){
      play4Game();
      play24Game();
    }
    System.out.println("Wins: " + wins);
    System.out.println("Win percentage: " + (double)wins/2000000*100);
    System.out.println("Losses: " + losses);
    System.out.println("Loss Percentage: " + (double)losses/2000000*100.0);
  }
}