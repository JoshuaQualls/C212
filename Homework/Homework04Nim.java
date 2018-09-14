import java.util.Random;
import java.util.Scanner;

public class Homework04Nim {
  static Random rand = new Random();
  static int pileSize, choosePlayer, intelligence, lastPicked, halfPile;
  

 public static void computerChooseNumber() {
  int num = 0;
  if (intelligence == 1) {
   for (int i = halfPile; i <= halfPile; i--) {
    if ((pileSize - i) % power(i) == 0) {
     pileSize -= i;
     num = i;
     break;
    }
   }
  } else {
    num = rand.nextInt((halfPile - 1) + 1) + 1;
    pileSize -= num;
  }
 lastPicked = 0;
 choosePlayer = 1;
 System.out.println("The Computer chose: " + num);
 System.out.println("There are " + pileSize + " marbles left");
}

public static void humanChooseNumber(int a) {
 pileSize -= a;
 lastPicked = 1;
 choosePlayer = 0;
 System.out.println("You chose: " + a);
 System.out.println("There are " + pileSize + " marbles left");
}

public static int power(int a) {
 int power = 2;
 while (power < a) {
  power *= 2;
 }
 power /= 2;
 a = power - 1;
 return a;
}

public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 Random r = new Random();
 
 pileSize = r.nextInt(100 + 1);
 choosePlayer = r.nextInt(1 - 0 + 1);
 intelligence = r.nextInt(1 - 0 + 1);
 lastPicked = 0;
 halfPile = pileSize / 2;
 
 System.out.println("There are " + pileSize + " marbles");
 
 while (pileSize > 0) {
  if (choosePlayer == 0) {
   System.out.println("The computer's turn");
   computerChooseNumber();
  } else {
   System.out.print("Select a number between 1 and " + pileSize / 2);
   int number = in .nextInt();
   humanChooseNumber(number);
  }
 }
 if (lastPicked == 0) {
  System.out.println("The computer won");
 } else {
  System.out.println("You won");
 }
}
}
