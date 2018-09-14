import java.util.Scanner;

public class AllPrime {

 public static boolean checkNumber(int a) {
  for (int i = 2; i < a; i++) {
   if (a % i == 0)
    return false;
  }
  return true;
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Give a Number: ");
  int input = in .nextInt();

  for (int i = 1; i <= input; i++) {
   if (checkNumber(i))
    System.out.println(i);
  }
 }
}