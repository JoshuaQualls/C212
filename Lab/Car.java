import javax.swing.JComponent;
import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Polygon;

public class Car extends JComponent {
  int width, height; 
  public Car(int width, int height) {
    this.width = width;
    this.height = height; 
  }
  
  int scale(int value) { 
    return (int) (this.width / 500.0 * value);  
  } 
  
  public void paintComponent(Graphics g) {
    int[] xPoints = {scale(180), scale(215), scale(285), scale(320)};
    int[] yPoints = {scale(250), scale(210), scale(210), scale(250)}; 
    g.setColor(Color.BLUE); 
    g.fillRect(scale(150), scale(250), scale(width), scale(height));
    g.fillPolygon(xPoints, yPoints, 4);
    g.setColor(Color.YELLOW);
    g.fillRect(scale(150), scale(260), scale(20), scale(20));
    g.setColor(Color.BLACK);
    g.fillOval(scale(180), scale(275), scale(40), scale(40));
    g.fillOval(scale(280), scale(275), scale(40), scale(40));
  }
}