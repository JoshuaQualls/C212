import java.util.Scanner;
public class P1 {

 static double sum = 0;
 static int count = 0;
 static double average = 0;
 static double max = 0;
 static double min = 0;
 static double range = 0;

 public static void getAverage() {
  average = sum / count;
 }

 public static void getSmallest(double a) {
  if (a < min || min == 0)
   min = a;
 }

 public static void getLargest(double a) {
  if (a > max || max == 0)
   max = a;
 }

 public static void getRange() {

  if (max != min)
   range = max - min;
  else
   range = 0;
 }

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Give a Number: ");
  String line = in .nextLine();
  while (!line.equals("bye")) {
   double newInput = Double.parseDouble(line);
   sum += newInput;
   count++;
   getAverage();
   getSmallest(newInput);
   getLargest(newInput);
   getRange();

   System.out.println("The Average is: " + average);
   System.out.println("The Smallest is: " + min);
   System.out.println("The Largest is: " + max);
   System.out.println("The Range is: " + range);

   System.out.print("Give another number: ");
   line = in .nextLine();
  }
 }
}