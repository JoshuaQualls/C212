import java.util.Scanner;
public class Homework01 {
  
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter the first time: ");
    String t1 = in.nextLine();
    int t1H = Integer.parseInt(t1.substring(0,2));
    int t1M = Integer.parseInt(t1.substring(3));
    int t1T = t1H * 60 + t1M;
    
    System.out.print("Enter the second time: ");
    String t2 = in.nextLine();
    int t2H = Integer.parseInt(t2.substring(0,2));
    int t2M = Integer.parseInt(t2.substring(3));
    int t2T = t2H * 60 + t2M;
    
    int difference = (t2T - t1T + 1440) % 1440;
    int hours = difference / 60;
    int minutes = difference % 60;
    
    
    /*
    System.out.println(t1H);
    System.out.println(t1M);
    System.out.println(t1T);
    System.out.println(t2H);
    System.out.println(t2M);
    System.out.println(t2T);
    System.out.println(difference);
    System.out.println(hours);
    System.out.println(minutes);
    */
    
    System.out.println(hours + " hours and " + minutes + " minutes.");
    
  }
  
}