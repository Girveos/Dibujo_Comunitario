/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.Color;

/**
 *
 * @author pipet
 */
public class Circulo extends FiguraEstandar{
    private int radio;

    public Circulo() {
        super(0, 0, null, null);
    }

    

    public Circulo( int x, int y, Color borde, Color colorRelleno,int radio) {
        super(x, y, borde, colorRelleno);
        this.radio = radio;
    }

    

    /**
     * @return the radio
     */
    public int getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }
    
}
