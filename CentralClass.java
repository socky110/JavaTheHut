import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class CentralClass{
    public static JFrame jf = new JFrame("Window One");
    
    public CentralClass(){
        this.init();
    }
    public static void main(String[] useless){
        jf.setSize(500, 500);
        jf.setBackground(Color.ORANGE);
        jf.setVisible(true);
        new CentralClass();
    }
    public
}
