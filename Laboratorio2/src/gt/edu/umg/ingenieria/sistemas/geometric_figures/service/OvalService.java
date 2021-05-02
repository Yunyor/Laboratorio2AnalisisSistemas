package gt.edu.umg.ingenieria.sistemas.geometric_figures.service;
import gt.edu.umg.ingenieria.sistemas.geometric_figures.model.CircleEntity;
import gt.edu.umg.ingenieria.sistemas.geometric_figures.model.OvalEntity;
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

public class OvalService extends Abstractgeometric_figuresService {
     OvalEntity ovalado = new OvalEntity();
    public OvalService() {
    }

    public OvalEntity CreateOval(float radio1, float radio2, String clra, String clrba, String unidad) {
          ovalado.setUnidad(unidad);
           ovalado.setRadio1(radio1);
           ovalado.setRadio2(radio2);
          switch(Colores.valueOf(clra.toUpperCase())){
            case BLANCO:
                ovalado.setAreacolor(Color.WHITE);
            break;
            case GRISCLARO:
                ovalado.setAreacolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                ovalado.setAreacolor(Color.GRAY);
            break;
            case GRISOSCURO:
                ovalado.setAreacolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                ovalado.setAreacolor(Color.BLACK);
            break;
            case ROJO:
                ovalado.setAreacolor(Color.RED);
            break;
            case ROSADO:
                ovalado.setAreacolor(Color.PINK);
            break;
            case ANARANJADO:
                ovalado.setAreacolor(Color.ORANGE);
            break;
            case AMARILLO:
                ovalado.setAreacolor(Color.YELLOW);
            break;
            case VERDE:
                ovalado.setAreacolor(Color.GREEN);
            break;
            case LILA:
                ovalado.setAreacolor(Color.MAGENTA);
            break;
            case TURQUESA:
                ovalado.setAreacolor(Color.CYAN);
            break;
            case AZUL:
                ovalado.setAreacolor(Color.BLUE);
            break;         
        }
         switch(Colores.valueOf(clrba.toUpperCase())){
            case BLANCO:
                ovalado.setBordercolor(Color.WHITE);
            break;
            case GRISCLARO:
                ovalado.setBordercolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                ovalado.setBordercolor(Color.GRAY);
            break;
            case GRISOSCURO:
                ovalado.setBordercolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                ovalado.setBordercolor(Color.BLACK);
            break;
            case ROJO:
                ovalado.setBordercolor(Color.RED);
            break;
            case ROSADO:
                ovalado.setBordercolor(Color.PINK);
            break;
            case ANARANJADO:
                ovalado.setBordercolor(Color.ORANGE);
            break;
            case AMARILLO:
                ovalado.setBordercolor(Color.YELLOW);
            break;
            case VERDE:
                ovalado.setBordercolor(Color.GREEN);
            break;
            case LILA:
                ovalado.setBordercolor(Color.MAGENTA);
            break;
            case TURQUESA:
                ovalado.setBordercolor(Color.CYAN);
            break;
            case AZUL:
                ovalado.setBordercolor(Color.BLUE);
            break;  
        }
         return ovalado;
    }
     @Override 
    public String getArea() {
        // TODO implement here
          //ovalado.setArea();
          return String.valueOf(ovalado.getRadio1()*ovalado.getRadio2()*Math.PI)+ovalado.getUnidad()+"²"; 
    }
    @Override 
    public String getPerimeter() {
        // TODO implement here

        return String.valueOf(Math.PI*(3*(ovalado.getRadio1()+ovalado.getRadio2())-Math.sqrt((3*ovalado.getRadio1()+ovalado.getRadio2())*(ovalado.getRadio1()+3*ovalado.getRadio2()))));
    }
    @Override
    public void getdrawFigure(Graphics g) {
        Graphics2D g2d =(Graphics2D) g; 
        g2d.setColor(ovalado.getAreacolor()); 
        g2d.fillOval((int)(200-(ovalado.getRadio1()/2)),(int)(200-(ovalado.getRadio2()/2)), (int)ovalado.getRadio1(),(int) ovalado.getRadio2());
        g2d.setColor(ovalado.getBordercolor());
        g2d.drawOval((int)(200-(ovalado.getRadio1()/2)),(int)(200-(ovalado.getRadio2()/2)), (int)ovalado.getRadio1(), (int)ovalado.getRadio2());
       
    }

    @Override
    public void getimage(String format) {
        BufferedImage bufferedImage = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
        Graphics2D g3d = bufferedImage.createGraphics();
        g3d.setColor(ovalado.getAreacolor());
        g3d.fillOval((int)(200-(ovalado.getRadio1()/2)),(int)(200-(ovalado.getRadio1()/2)),(int)ovalado.getRadio1(), (int)ovalado.getRadio2());
        g3d.setColor(ovalado.getBordercolor());
        g3d.drawOval((int)(200-(ovalado.getRadio1()/2)),(int)(200-(ovalado.getRadio1()/2)), (int)ovalado.getRadio1(), (int)ovalado.getRadio2());
        g3d.dispose(); 
        File file = new File("ovalado."+format);
        switch(format){
            case "PNG":
                try {
                    ImageIO.write(bufferedImage, "png", file);
                } catch (IOException ex) {
                    Logger.getLogger(OvalService.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
            case "JPG":    
            try {
                ImageIO.write(bufferedImage, "jpg", file);
            } catch (IOException ex) {
                Logger.getLogger(OvalService.class.getName()).log(Level.SEVERE, null, ex);
            }  
            break;  
        }
    }

    @Override
    public void getcoordinates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}