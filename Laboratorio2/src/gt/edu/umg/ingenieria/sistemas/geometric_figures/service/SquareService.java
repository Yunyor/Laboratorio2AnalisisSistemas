package gt.edu.umg.ingenieria.sistemas.geometric_figures.service;

import gt.edu.umg.ingenieria.sistemas.geometric_figures.model.SquareEntity;
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

public class SquareService extends Abstractgeometric_figuresService {
    SquareEntity cuadrado = new SquareEntity();

    public SquareService() {
    }

    public SquareEntity CreateSquare(float side, String clra, String clrba,String unidad) {
        cuadrado.setUnidad(unidad);
         cuadrado.setSide(side);     
          switch(Colores.valueOf(clra.toUpperCase())){
            case BLANCO:
                cuadrado.setAreacolor(Color.WHITE);
            break;
            case GRISCLARO:
                cuadrado.setAreacolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                cuadrado.setAreacolor(Color.GRAY);
            break;
            case GRISOSCURO:
                cuadrado.setAreacolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                cuadrado.setAreacolor(Color.BLACK);
            break;
            case ROJO:
                cuadrado.setAreacolor(Color.RED);
            break;
            case ROSADO:
                cuadrado.setAreacolor(Color.PINK);
            break;
            case ANARANJADO:
                cuadrado.setAreacolor(Color.ORANGE);
            break;
            case AMARILLO:
                cuadrado.setAreacolor(Color.YELLOW);
            break;
            case VERDE:
                cuadrado.setAreacolor(Color.GREEN);
            break;
            case LILA:
                cuadrado.setAreacolor(Color.MAGENTA);
            break;
            case TURQUESA:
                cuadrado.setAreacolor(Color.CYAN);
            break;
            case AZUL:
                cuadrado.setAreacolor(Color.BLUE);
            break;         
        }
         switch(Colores.valueOf(clrba.toUpperCase())){
            case BLANCO:
                cuadrado.setBordercolor(Color.WHITE);
            break;
            case GRISCLARO:
                cuadrado.setBordercolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                cuadrado.setBordercolor(Color.GRAY);
            break;
            case GRISOSCURO:
                cuadrado.setBordercolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                cuadrado.setBordercolor(Color.BLACK);
            break;
            case ROJO:
                cuadrado.setBordercolor(Color.RED);
            break;
            case ROSADO:
                cuadrado.setBordercolor(Color.PINK);
            break;
            case ANARANJADO:
                cuadrado.setBordercolor(Color.ORANGE);
            break;
            case AMARILLO:
                cuadrado.setBordercolor(Color.YELLOW);
            break;
            case VERDE:
                cuadrado.setBordercolor(Color.GREEN);
            break;
            case LILA:
                cuadrado.setBordercolor(Color.MAGENTA);
            break;
            case TURQUESA:
                cuadrado.setBordercolor(Color.CYAN);
            break;
            case AZUL:
                cuadrado.setBordercolor(Color.BLUE);
            break;  
        }
         return cuadrado;
    }
    @Override 
    public String getArea() {
        // TODO implement here
     
          return String.valueOf(cuadrado.getSide()*cuadrado.getSide())+cuadrado.getUnidad()+"²"; 
    }
    @Override 
    public String getPerimeter() {
        // TODO implement here
       
        return String.valueOf(cuadrado.getSide()*4)+cuadrado.getUnidad();
    }
    @Override
    public void getdrawFigure(Graphics g) {
            g.setColor(cuadrado.getAreacolor());
            g.fillRect((int)(200-(cuadrado.getSide()/2)), (int)(200-(cuadrado.getSide()/2)),(int) cuadrado.getSide(), (int)cuadrado.getSide());
            g.setColor(cuadrado.getBordercolor());
            g.drawRect((int)(200-(cuadrado.getSide()/2)), (int)(200-(cuadrado.getSide()/2)),(int) cuadrado.getSide(), (int)cuadrado.getSide());
    }

    @Override
    public void getimage(String format) {
      BufferedImage bufferedImage = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
        Graphics2D g3d = bufferedImage.createGraphics();
        g3d.setColor(cuadrado.getAreacolor());
        g3d.fillRect((int)(200-(cuadrado.getSide()/2)), (int)(200-(cuadrado.getSide()/2)),(int) cuadrado.getSide(),(int) cuadrado.getSide());
        g3d.setColor(cuadrado.getBordercolor());
        g3d.drawRect((int)(200-(cuadrado.getSide()/2)), (int)(200-(cuadrado.getSide()/2)),(int) cuadrado.getSide(), (int)cuadrado.getSide());
        g3d.dispose(); 
         File file = new File("cuadrado."+format);
        switch(format){
            case "PNG":
                try {
                    ImageIO.write(bufferedImage, "png", file);
                } catch (IOException ex) {
                    Logger.getLogger(SquareService.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
            case "JPG":    
            try {
                ImageIO.write(bufferedImage, "jpg", file);
            } catch (IOException ex) {
                Logger.getLogger(SquareService.class.getName()).log(Level.SEVERE, null, ex);
            }  
            break;  
        }
    
    }

    @Override
    public void getcoordinates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}