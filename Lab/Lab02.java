import java.awt.Graphics;
import javax.swing.JFrame;

public class Lab02 {
  public static void main(String[] args) {
    JFrame a = new JFrame(); 
    int width = 200, height = 50; 
    a.setVisible(true); 
    a.setSize(width+300, height+450); 
    Car b = new Car(width, height); 
    a.add(b);     
  }
}