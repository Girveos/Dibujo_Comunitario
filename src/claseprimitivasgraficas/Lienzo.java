/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseprimitivasgraficas;

import Modelos.Circulo;
import Modelos.Cuadrado;
import Modelos.FiguraGeometrica;
import Modelos.Imagen;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

/**
 *
 * @author pipet
 */
public class Lienzo extends javax.swing.JPanel {
    private LinkedList<FiguraGeometrica> figuras;
    /**
     * Creates new form Lienzo
     */
    public Lienzo() {
        initComponents();
        this.figuras = new LinkedList<>();
    }

    @Override
    public void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.
        DibujarFigura(grphcs);
    }
    public void DibujarFigura(Graphics grphcs){
        for(FiguraGeometrica Actual : this.figuras){
            if(Actual instanceof Cuadrado){
                DibujarCuadrado(grphcs,(Cuadrado)Actual);
            }else if(Actual instanceof Circulo){
                DibujarCirculo(grphcs,(Circulo)Actual);
            }else if(Actual instanceof Imagen){
                DibujarImagen(grphcs,(Imagen)Actual);
            }
        }
    }
    
    public void DibujarCuadrado(Graphics grphcs, Cuadrado miCuadrado){
        grphcs.setColor(miCuadrado.getColorRelleno());
        grphcs.fillRect(miCuadrado.getX(),miCuadrado.getY(),miCuadrado.getLado(),miCuadrado.getLado());
        
        grphcs.setColor(miCuadrado.getBorde());
        grphcs.drawRect(miCuadrado.getX(),miCuadrado.getY(),miCuadrado.getLado(),miCuadrado.getLado());
        
    }
    public void DibujarCirculo(Graphics grphcs, Circulo miCirculo){
        grphcs.setColor(miCirculo.getColorRelleno());
        grphcs.fillOval(miCirculo.getX(),miCirculo.getY(),miCirculo.getRadio(),miCirculo.getRadio());
        
        grphcs.setColor(miCirculo.getBorde());
        grphcs.fillOval(miCirculo.getX(),miCirculo.getY(),miCirculo.getRadio(),miCirculo.getRadio());
        
    }
    public void DibujarImagen(Graphics grphcs,Imagen miImagen){
        Toolkit t = Toolkit.getDefaultToolkit();
        Image imagen = t.getImage(miImagen.getRuta());
        grphcs.drawImage(imagen, miImagen.getX(),miImagen.getY(),miImagen.getAncho(),miImagen.getAlto(),this);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return the figuras
     */
    public LinkedList<FiguraGeometrica> getFiguras() {
        return figuras;
    }

    /**
     * @param figuras the figuras to set
     */
    public void setFiguras(LinkedList<FiguraGeometrica> figuras) {
        this.figuras = figuras;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
