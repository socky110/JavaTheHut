import java.awt.Color;
import java.awt.Graphics; 
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File; 
import java.io.IOException; 
import javax.imageio.ImageIO;
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
    public void init(){
        
    }
    static class ImageMake{
        int x = 0;
        int y = 0;
        
        Image img = null;
        public ImageMake(String src){
            create(src);
        }
        public void create(String src){
            try{
                img = ImageIO.read(new File(CentralClass.class.getResource(src)));
            }catch(IOExcepton e){
                e.printStackTrace();
            }
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public void setX(int x1){
            x = x1;
        }
        public void setY(int y2){
            y = y2;
        }
    }
}
