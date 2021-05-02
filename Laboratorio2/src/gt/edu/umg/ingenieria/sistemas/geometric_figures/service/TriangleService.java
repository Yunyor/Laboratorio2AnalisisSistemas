package gt.edu.umg.ingenieria.sistemas.geometric_figures.service;

import gt.edu.umg.ingenieria.sistemas.geometric_figures.model.TriangleEntity;
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

public class TriangleService extends Abstractgeometric_figuresService {
    TriangleEntity triangulo = new TriangleEntity();
    public TriangleService() {
    }

    public TriangleEntity CreateTriangle(float base, float height, String clra, String clrba,String unidad) {
         triangulo.setBase(base);
        triangulo.setHeight(height);
        triangulo.setUnidad(unidad);
          switch(Colores.valueOf(clra.toUpperCase())){
            case BLANCO:
                triangulo.setAreacolor(Color.WHITE);
            break;
            case GRISCLARO:
                triangulo.setAreacolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                triangulo.setAreacolor(Color.GRAY);
            break;
            case GRISOSCURO:
                triangulo.setAreacolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                triangulo.setAreacolor(Color.BLACK);
            break;
            case ROJO:
                triangulo.setAreacolor(Color.RED);
            break;
            case ROSADO:
                triangulo.setAreacolor(Color.PINK);
            break;
            case ANARANJADO:
                triangulo.setAreacolor(Color.ORANGE);
            break;
            case AMARILLO:
                triangulo.setAreacolor(Color.YELLOW);
            break;
            case VERDE:
                triangulo.setAreacolor(Color.GREEN);
            break;
            case LILA:
                triangulo.setAreacolor(Color.MAGENTA);
            break;
            case TURQUESA:
                triangulo.setAreacolor(Color.CYAN);
            break;
            case AZUL:
                triangulo.setAreacolor(Color.BLUE);
            break;         
        }
         switch(Colores.valueOf(clrba.toUpperCase())){
            case BLANCO:
                triangulo.setBordercolor(Color.WHITE);
            break;
            case GRISCLARO:
                triangulo.setBordercolor(Color.LIGHT_GRAY);
            break;
            case GRIS:
                triangulo.setBordercolor(Color.GRAY);
            break;
            case GRISOSCURO:
                triangulo.setBordercolor(Color.DARK_GRAY);
            break;
            case NEGRO:
                triangulo.setBordercolor(Color.BLACK);
            break;
            case ROJO:
                triangulo.setBordercolor(Color.RED);
            break;
            case ROSADO:
                triangulo.setBordercolor(Color.PINK);
            break;
            case ANARANJADO:
                triangulo.setBordercolor(Color.ORANGE);
            break;
            case AMARILLO:
                triangulo.setBordercolor(Color.YELLOW);
            break;
            case VERDE:
                triangulo.setBordercolor(Color.GREEN);
            break;
            case LILA:
                triangulo.setBordercolor(Color.MAGENTA);
            break;
            case TURQUESA:
                triangulo.setBordercolor(Color.CYAN);
            break;
            case AZUL:
                triangulo.setBordercolor(Color.BLUE);
            break;  
        }
         return triangulo;
    }
     @Override 
       public String getArea() {
        // TODO implement here
          return String.valueOf(triangulo.getBase()*triangulo.getHeight())+triangulo.getUnidad()+"²";  
    }

     @Override 
       public String getPerimeter() {
        // TODO implement here
          return String.valueOf((triangulo.getHeight()*2)+(triangulo.getBase()*2))+triangulo.getUnidad();
    }
    @Override
    public void getdrawFigure(Graphics g) {
        g.setColor(triangulo.getAreacolor());
        int xpoints[] = {(int)(200-(triangulo.getBase()/2)), (int)(200), (int)(200+(triangulo.getBase()/2))};
        int ypoints[] = {(int)(200+(triangulo.getHeight()/2)), (int)(200-triangulo.getHeight()), (int)(200+(triangulo.getHeight()/2))};
        int npoints = 3;
        g.drawPolygon(xpoints, ypoints, npoints);
        g.setColor(triangulo.getBordercolor());
        g.fillPolygon(xpoints, ypoints, npoints); 
    }

    @Override
    public void getimage(String format) {
         BufferedImage bufferedImage = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
           Graphics2D g3d = bufferedImage.createGraphics();
           g3d.setColor(triangulo.getAreacolor());
           g3d.fillRect((int)(200-(triangulo.getHeight()/2)), (int)(200-(triangulo.getBase())),(int) triangulo.getHeight(),(int) triangulo.getBase());
           g3d.setColor(triangulo.getBordercolor());
           g3d.drawRect((int)(200-(triangulo.getHeight()/2)), (int)(200-(triangulo.getBase())), (int)triangulo.getHeight(), (int)triangulo.getBase());
           g3d.dispose();
            File file = new File("triangulo."+format);
        switch(format){
            case "PNG":
                try {
                    ImageIO.write(bufferedImage, "png", file);
                } catch (IOException ex) {
                    Logger.getLogger(TriangleService.class.getName()).log(Level.SEVERE, null, ex);
                }
            break;
            case "format":    
            try {
                ImageIO.write(bufferedImage, "jpg", file);
            } catch (IOException ex) {
                Logger.getLogger(TriangleService.class.getName()).log(Level.SEVERE, null, ex);
            }  
            break;  
        }
    }

    @Override
    public void getcoordinates() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}