package gt.edu.umg.ingenieria.sistemas.geometric_figures.service;

import gt.edu.umg.ingenieria.sistemas.geometric_figures.model.RectangleEntity;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class RectangleService extends Abstractgeometric_figuresService {
    RectangleEntity rectangulo = new RectangleEntity();
    public RectangleService() {
    }

    public RectangleEntity CreateRectangle(float base, float height, String clra, String clrba,String unidad) {
        rectangulo.setBase(base);
        rectangulo.setHeight(height);
        rectangulo.setUnidad(unidad);
          switch(Colores.valueOf(clra.toUpperCase())){
            case BLANCO:
                rectangulo.setAreacolor(Color.WHITE);
            break;
            case GRISCLARO:
                rectangulo.setAreacolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                rectangulo.setAreacolor(Color.GRAY);
            break;
            case GRISOSCURO:
                rectangulo.setAreacolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                rectangulo.setAreacolor(Color.BLACK);
            break;
            case ROJO:
                rectangulo.setAreacolor(Color.RED);
            break;
            case ROSADO:
                rectangulo.setAreacolor(Color.PINK);
            break;
            case ANARANJADO:
                rectangulo.setAreacolor(Color.ORANGE);
            break;
            case AMARILLO:
                rectangulo.setAreacolor(Color.YELLOW);
            break;
            case VERDE:
                rectangulo.setAreacolor(Color.GREEN);
            break;
            case LILA:
                rectangulo.setAreacolor(Color.MAGENTA);
            break;
            case TURQUESA:
                rectangulo.setAreacolor(Color.CYAN);
            break;
            case AZUL:
                rectangulo.setAreacolor(Color.BLUE);
            break;         
        }
         switch(Colores.valueOf(clrba.toUpperCase())){
            case BLANCO:
                rectangulo.setBordercolor(Color.WHITE);
            break;
            case GRISCLARO:
                rectangulo.setBordercolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                rectangulo.setBordercolor(Color.GRAY);
            break;
            case GRISOSCURO:
                rectangulo.setBordercolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                rectangulo.setBordercolor(Color.BLACK);
            break;
            case ROJO:
                rectangulo.setBordercolor(Color.RED);
            break;
            case ROSADO:
                rectangulo.setBordercolor(Color.PINK);
            break;
            case ANARANJADO:
                rectangulo.setBordercolor(Color.ORANGE);
            break;
            case AMARILLO:
                rectangulo.setBordercolor(Color.YELLOW);
            break;
            case VERDE:
                rectangulo.setBordercolor(Color.GREEN);
            break;
            case LILA:
                rectangulo.setBordercolor(Color.MAGENTA);
            break;
            case TURQUESA:
                rectangulo.setBordercolor(Color.CYAN);
            break;
            case AZUL:
                rectangulo.setBordercolor(Color.BLUE);
            break;  
        }
         return rectangulo;
    }
     @Override 
       public String getArea() {
        // TODO implement here
          return String.valueOf(rectangulo.getBase()*rectangulo.getHeight())+rectangulo.getUnidad()+"²";  
    }
      
       @Override 
       public String getPerimeter() {
        // TODO implement here
          return String.valueOf((rectangulo.getHeight()*2)+(rectangulo.getBase()*2))+rectangulo.getUnidad();
    }
    @Override
    public void getdrawFigure(Graphics g) {
        g.setColor(rectangulo.getAreacolor());
        g.fillRect((int)(200-(rectangulo.getHeight()/2)), (int)(200-(rectangulo.getBase()/2)),(int)( rectangulo.getHeight()), (int)(rectangulo.getBase()));
        g.setColor(rectangulo.getBordercolor());
        g.drawRect((int)(200-(rectangulo.getHeight()/2)), (int)(200-(rectangulo.getBase()/2)), (int)(rectangulo.getHeight()),(int)( rectangulo.getBase()));
    }

    @Override
    public void getimage(String format) {
       BufferedImage bufferedImage = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
           Graphics2D g3d = bufferedImage.createGraphics();
           g3d.setColor(rectangulo.getAreacolor());
           g3d.fillRect((int)(200-(rectangulo.getHeight()/2)), (int)(200-(rectangulo.getBase()/2)),(int)( rectangulo.getHeight()), (int)(rectangulo.getBase()));
           g3d.setColor(rectangulo.getBordercolor());
           g3d.drawRect((int)(200-(rectangulo.getHeight()/2)), (int)(200-(rectangulo.getBase()/2)), (int)(rectangulo.getHeight()),(int)( rectangulo.getBase()));
           g3d.dispose();
           
      File file = new File("rectangulo."+format);
        switch(format){
            case "PNG":
                try {
                    ImageIO.write(bufferedImage, "png", file);
                } catch (IOException ex) {
                    Logger.getLogger(RectangleService.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
            case "JPG":    
            try {
                ImageIO.write(bufferedImage, "jpg", file);
            } catch (IOException ex) {
                Logger.getLogger(RectangleService.class.getName()).log(Level.SEVERE, null, ex);
            }  
            break;  
        }
    }

    @Override
    public void getcoordinates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}