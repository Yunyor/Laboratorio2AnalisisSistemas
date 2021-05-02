package gt.edu.umg.ingenieria.sistemas.geometric_figures.service;

import gt.edu.umg.ingenieria.sistemas.geometric_figures.model.CircleEntity;
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

public class CircleService extends Abstractgeometric_figuresService {
     CircleEntity circulo = new CircleEntity();
    public CircleService() {
    }

    public CircleEntity CreateCircle(float radio, String clra, String clrba,String unidad) {
           circulo.setUnidad(unidad);
           circulo.setRadio(radio);     
          switch(Colores.valueOf(clra.toUpperCase())){
            case BLANCO:
                circulo.setAreacolor(Color.WHITE);
            break;
            case GRISCLARO:
                circulo.setAreacolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                circulo.setAreacolor(Color.GRAY);
            break;
            case GRISOSCURO:
                circulo.setAreacolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                circulo.setAreacolor(Color.BLACK);
            break;
            case ROJO:
                circulo.setAreacolor(Color.RED);
            break;
            case ROSADO:
                circulo.setAreacolor(Color.PINK);
            break;
            case ANARANJADO:
                circulo.setAreacolor(Color.ORANGE);
            break;
            case AMARILLO:
                circulo.setAreacolor(Color.YELLOW);
            break;
            case VERDE:
                circulo.setAreacolor(Color.GREEN);
            break;
            case LILA:
                circulo.setAreacolor(Color.MAGENTA);
            break;
            case TURQUESA:
                circulo.setAreacolor(Color.CYAN);
            break;
            case AZUL:
                circulo.setAreacolor(Color.BLUE);
            break;         
        }
         switch(Colores.valueOf(clrba.toUpperCase())){
            case BLANCO:
                circulo.setBordercolor(Color.WHITE);
            break;
            case GRISCLARO:
                circulo.setBordercolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                circulo.setBordercolor(Color.GRAY);
            break;
            case GRISOSCURO:
                circulo.setBordercolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                circulo.setBordercolor(Color.BLACK);
            break;
            case ROJO:
                circulo.setBordercolor(Color.RED);
            break;
            case ROSADO:
                circulo.setBordercolor(Color.PINK);
            break;
            case ANARANJADO:
                circulo.setBordercolor(Color.ORANGE);
            break;
            case AMARILLO:
                circulo.setBordercolor(Color.YELLOW);
            break;
            case VERDE:
                circulo.setBordercolor(Color.GREEN);
            break;
            case LILA:
                circulo.setBordercolor(Color.MAGENTA);
            break;
            case TURQUESA:
                circulo.setBordercolor(Color.CYAN);
            break;
            case AZUL:
                circulo.setBordercolor(Color.BLUE);
            break;  
        }
         return circulo;
    }
    @Override 
    public String getArea() {
        // TODO implement here
          //circulo.setArea();
          return String.valueOf(Math.PI*Math.pow(circulo.getRadio(),2))+circulo.getUnidad()+"²"; 
    }
    @Override 
    public String getPerimeter() {
        // TODO implement here
       
        return String.valueOf(2*Math.PI*circulo.getRadio())+circulo.getUnidad();
    }
    @Override
    public void getdrawFigure(Graphics g) {
        Graphics2D g2d =(Graphics2D) g; 
        g2d.setColor(circulo.getAreacolor()); 
        g2d.fillOval((int)(200-(circulo.getRadio()/2)),(int)(200-(circulo.getRadio()/2)), (int)circulo.getRadio(),(int) circulo.getRadio());
        g2d.setColor(circulo.getBordercolor());
        g2d.drawOval((int)(200-(circulo.getRadio()/2)),(int)(200-(circulo.getRadio()/2)), (int)circulo.getRadio(), (int)circulo.getRadio());
       
    }
    @Override
    public void getimage(String format) {
       BufferedImage bufferedImage = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
        Graphics2D g3d = bufferedImage.createGraphics();
        g3d.setColor(circulo.getAreacolor());
        g3d.fillOval((int)(200-(circulo.getRadio()/2)),(int)(200-(circulo.getRadio()/2)),(int)circulo.getRadio(), (int)circulo.getRadio());
        g3d.setColor(circulo.getBordercolor());
        g3d.drawOval((int)(200-(circulo.getRadio()/2)),(int)(200-(circulo.getRadio()/2)), (int)circulo.getRadio(), (int)circulo.getRadio());
        g3d.dispose(); 
        File file = new File("circulo."+format);
        switch(format){
            case "PNG":
                try {
                    ImageIO.write(bufferedImage, "png", file);
                } catch (IOException ex) {
                    Logger.getLogger(CircleService.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
            case "JPG":    
            try {
                ImageIO.write(bufferedImage, "jpg", file);
            } catch (IOException ex) {
                Logger.getLogger(CircleService.class.getName()).log(Level.SEVERE, null, ex);
            }  
            break;  
        }
    }

    @Override
    public void getcoordinates() {
        
    }

  

}