import java.awt.Graphics;
import javax.swing.JFrame;

public class HW02 {
  public static void main(String[] args) {
    JFrame a = new JFrame(); 
    int width, height;
    width = 200;
    height= 50;
    a.setVisible(true); 
    a.setSize(500, 500); 
    Car b = new Car(width, height);
    a.add(b);
  }
}
