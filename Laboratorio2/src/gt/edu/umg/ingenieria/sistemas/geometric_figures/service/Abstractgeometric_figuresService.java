package gt.edu.umg.ingenieria.sistemas.geometric_figures.service;

import java.awt.Graphics;
import java.util.*;

public abstract class Abstractgeometric_figuresService {

    public Abstractgeometric_figuresService() {
    }

    public String getArea() {
        // TODO implement here
        return null;
    }

    public String getPerimeter() {
        // TODO implement here
        return null;
    }

    public abstract void getdrawFigure(Graphics g);

    public abstract void getimage(String format);

    public abstract void getcoordinates();

}