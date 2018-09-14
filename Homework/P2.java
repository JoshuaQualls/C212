import java.util.Scanner;

public class P2 {

 static int count = 0;
 static double sum = 0;
 static double sumOSq = 0;
 static double average = 0;
 static double standardDeviation = 0;


 public static void getAverage() {
  average = sum / count;
 }

 public static void getStandardDeviation() {
  standardDeviation = Math.sqrt(
                                (sumOSq - 
                                 ((1 / count) * 
                                  Math.pow(sum, 2))) / 
                                (count - 1));
 }


 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Give a Number: ");
  String line = in .nextLine();
  while (!line.equals("bye")) {
   double newInput = Double.parseDouble(line);

   sum += newInput;
   sumOSq += Math.pow(newInput, 2);
   count++;
   getAverage();
   getStandardDeviation();

   System.out.println("The Average is: " + average);
   System.out.println("The Sum is: " + sum);
   System.out.println("The Sum of Squares is: " + sumOSq);
   System.out.println("The Standard Deviation is: " + standardDeviation);

   System.out.print("Give another Number: ");
   line = in .nextLine();
  }
 }
}