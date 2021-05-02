package gt.edu.umg.ingenieria.sistemas.geometric_figures.model;

import java.awt.Color;
import java.util.*;

public abstract class Abstractgeometric_figuresEntity {

    public Abstractgeometric_figuresEntity() {
    }

    private Color areacolor;

    private Color bordercolor;
    
    private String unidad;
    
  

  
    public Color getAreacolor() {
        // TODO implement here
        return this.areacolor;
    }

    public void setAreacolor(Color Areacolor) {
        // TODO implement here
        this.areacolor=Areacolor;
    }

    public Color getBordercolor() {
        // TODO implement here
        return this.bordercolor;
    }

    public void setBordercolor(Color bordercolor) {
        // TODO implement here
        this.bordercolor=bordercolor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

}
