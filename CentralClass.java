package JavaTheHut;

//import java.awt.Color;
//import java.awt.Graphics; 
//import java.awt.Image;
//import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.*;
import java.io.File; 
import java.io.IOException; 
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class CentralClass implements KeyListener{
    public static JFrame jf = new JFrame("Window One");
    public static ImageMake background = new ImageMake("back1");
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
    public void keyTyped(KeyEvent e){
        if(e.getKeyCode == KeyEvent.VK_UP){
            ;
        }else if(e.getKeyCode == KeyEvent.VK_DOWN){
            ;
        }else if(e.getKeyCode == KeyEvent.VK_LEFT){
            ;
        }else if(e.getKeyCode == KeyEvent.VK_RIGHT){
            ;
        }
    }
    public void keyPressed(KeyEvent e){
        
    }
    public void keyReleased(KeyEvent e){
        
    }
    static class ImageMake extends Component{
        int x = 0;
        int y = 0;
        
        Image img = null;
        public ImageMake(String src){
            make(src);
        }
        public void make(String src){
            try{
                img = ImageIO.read(new File(CentralClass.class.getResource(src).getPath()));
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        public int getX2(){
            return x;
        }
        public int getY2(){
            return y;
        }
        public void setX2(int x2){
            x = x2;
        }
        public void setY2(int y2){
            y = y2;
        }
    }
}
