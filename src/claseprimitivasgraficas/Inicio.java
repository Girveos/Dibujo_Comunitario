/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseprimitivasgraficas;

import Modelos.Circulo;
import Modelos.Cuadrado;
import Modelos.Imagen;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author pipet
 */
public class Inicio extends javax.swing.JFrame {
        int posicion_altura = 0;
        int posicion_largo = 0;
        int dimension = 20;
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        //segundaFranja(this.dimension);
        //tercera_franja(this.dimension);
        //primeraFranja();
        /*this.lienzo1.setSize(700,1000);
        Cuadrado C1 = new Cuadrado(10, 10, Color.black, Color.red, 90);
        this.lienzo1.getFiguras().add(C1);
        Circulo C2 = new Circulo(10, 10, Color.white, Color.black, 90);
        this.lienzo1.getFiguras().add(C2);
        Imagen IM1 = new Imagen(23, 27,"src/Imagenes/Tesla.png", 64, 64);
        this.lienzo1.getFiguras().add(IM1);
        */
    }
    
    public void segundaFranja (int dimension){
        int IndicadorAltura = 100;
        int IndicadorAncho = 0;
        int []dibujo = {1,2,2,2,0,0,0,0,0,0,2,2,2,2,2,1,1,2,2,2,0,0,0,0,0,0,2,2,0,0,2,1,1,0,2,2,0,0,0,0,0,0,2,0,0,0,0,1,1,0,0,2,2,0,0,0,0,2,2,0,0,0,0,1,1,0,0,2,2,2,2,2,2,2,2,2,0,0,2,1,1,0,2,2,1,1,1,1,1,1,1,1,2,2,2,1,}; 
        for(int i = 0;i<96;i++){
            if (dibujo[i]== 0){
               Cuadrado cuadrado= new Cuadrado(IndicadorAncho,IndicadorAltura, null, Color.white, dimension); 
               this.lienzo1.getFiguras().add(cuadrado);
            } else if (dibujo[i]== 1){
               Cuadrado cuadrado= new Cuadrado(IndicadorAncho,IndicadorAltura, null, Color.black, dimension); 
               this.lienzo1.getFiguras().add(cuadrado);
            } else if (dibujo[i]== 2){
                Cuadrado cuadrado= new Cuadrado(IndicadorAncho,IndicadorAltura, null, Color.green, dimension); 
                this.lienzo1.getFiguras().add(cuadrado);
            } else {
                Cuadrado cuadrado= new Cuadrado(IndicadorAncho,IndicadorAltura, null, Color.pink, dimension); 
                this.lienzo1.getFiguras().add(cuadrado);
        }
            IndicadorAncho += dimension;
            if(IndicadorAncho >=320){
                IndicadorAncho = 0;
                IndicadorAltura += dimension;
            }
        }
    }

    public void tercera_franja(int dimension){
        int [] colores = {0,1,1,1,3,3,1,3,3,1,3,3,1,1,1,0,0,0,1,3,3,3,1,3,3,1,3,3,3,1,0,0,0,0,1,3,3,3,3,3,3,3,3,3,3,1,0,0,0,0,0,1,3,3,3,3,3,3,3,3,1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0};
        int index = 0;
        for(int filas = 220; filas < 320;filas += dimension){
            for(int columnas = 0;columnas <320 ; columnas = columnas += dimension){
                int color = colores[index];
                if(color == 0){
                Cuadrado cuadrado1= new Cuadrado(columnas,filas, null, Color.white, dimension);
                this.lienzo1.getFiguras().add(cuadrado1);
                }else if(color == 1){
                Cuadrado cuadrado1= new Cuadrado(columnas,filas, null, Color.black, dimension);
                this.lienzo1.getFiguras().add(cuadrado1);    
                }
                else if(color == 2){
                Cuadrado cuadrado1= new Cuadrado(columnas,filas, null, Color.green, dimension);
                this.lienzo1.getFiguras().add(cuadrado1);    
                }else{
                Cuadrado cuadrado1= new Cuadrado(columnas,filas, null, Color.pink, dimension);
                this.lienzo1.getFiguras().add(cuadrado1);    
                }
                index++;
            }
        }
    }
    public void pintarRecuadroNegro(int posicion_altura,int posicion_largo,int dimension){
        Cuadrado cuadrado1= new Cuadrado(posicion_altura,posicion_largo, null, Color.black, dimension);
        this.lienzo1.getFiguras().add(cuadrado1); 
    }
    
    public void primeraFranja(){
        int lado = 20;
        int []dibujo ={0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,2,2,2,2,0,0,1,1,0,0,0,0,0,1,0,0,2,2,2,2,0,0,0,0,1,0,0,0,1,0,0,2,2,2,2,2,2,0,0,0,0,1,0,0,1,0,2,2,0,0,0,0,2,2,0,0,0,1,0};
        int k = 0;
        for (int i = 0; i < 100; i=i+lado) {
            for (int j = 0; j < 320; j=j+lado) {
                if (dibujo[k] == 0){
                    Cuadrado cuadrado = new Cuadrado(j, i, Color.MAGENTA, Color.WHITE, lado);
                    this.lienzo1.getFiguras().add(cuadrado);
                }else if (dibujo[k] == 1){
                    Cuadrado cuadrado = new Cuadrado(j, i, Color.MAGENTA, Color.BLACK, lado);
                    this.lienzo1.getFiguras().add(cuadrado);
                }else if (dibujo[k] == 2){
                    Cuadrado cuadrado = new Cuadrado(j, i, Color.MAGENTA, Color.GREEN, lado);
                    this.lienzo1.getFiguras().add(cuadrado);
                }else {
                    Cuadrado cuadrado = new Cuadrado(j, i, Color.MAGENTA, Color.PINK, lado);
                    this.lienzo1.getFiguras().add(cuadrado);
                }
                k++;
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienzo1 = new claseprimitivasgraficas.Lienzo();
        jButtonNegro = new javax.swing.JButton();
        jButtonBlanco = new javax.swing.JButton();
        jButtonVerde = new javax.swing.JButton();
        jButtonPiel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonPielDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonNegro.setText("Negro");
        jButtonNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNegroActionPerformed(evt);
            }
        });

        jButtonBlanco.setText("Blanco");
        jButtonBlanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBlancoActionPerformed(evt);
            }
        });

        jButtonVerde.setText("Verde");
        jButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerdeActionPerformed(evt);
            }
        });

        jButtonPiel.setText("Piel");
        jButtonPiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPielActionPerformed(evt);
            }
        });

        jLabel1.setText("Según el boton que se elija");

        jLabel2.setText("el recuardo será pintado :)");

        jButtonPielDelete.setText("Borrar");
        jButtonPielDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPielDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzo1Layout.createSequentialGroup()
                .addContainerGap(433, Short.MAX_VALUE)
                .addGroup(lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(lienzo1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonPielDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonPiel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(97, 97, 97))
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lienzo1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jButtonNegro)
                .addGap(4, 4, 4)
                .addComponent(jButtonBlanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPiel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPielDelete)
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lienzo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBlancoActionPerformed
        // TODO add your handling code here:
        if(this.posicion_largo== 320){
            this.posicion_largo = 0;
            this.posicion_altura += 20;
        }
        else if(this.posicion_altura != 320 && this.posicion_largo != 320){
        Cuadrado nuevoCuadrado  = new Cuadrado(this.posicion_largo,this.posicion_altura,null, Color.WHITE,this.dimension);
        this.posicion_largo+=20;
        Graphics g = lienzo1.getGraphics();
        this.lienzo1.DibujarCuadrado(g, nuevoCuadrado);
        }
        
    }//GEN-LAST:event_jButtonBlancoActionPerformed

    private void jButtonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNegroActionPerformed
        // TODO add your handling code here:
        if(this.posicion_largo== 320){
            this.posicion_largo = 0;
            this.posicion_altura += 20;
        }
        else if(this.posicion_altura != 320 && this.posicion_largo != 320){
        Cuadrado nuevoCuadrado  = new Cuadrado(this.posicion_largo,this.posicion_altura,null, Color.BLACK,this.dimension);
        this.posicion_largo+=20;
        Graphics g = lienzo1.getGraphics();
        this.lienzo1.DibujarCuadrado(g, nuevoCuadrado);
        }
    }//GEN-LAST:event_jButtonNegroActionPerformed

    private void jButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerdeActionPerformed
       // TODO add your handling code here:
        if(this.posicion_largo== 320){
            this.posicion_largo = 0;
            this.posicion_altura += 20;
        }
        else if(this.posicion_altura != 320 && this.posicion_largo != 320){
        Cuadrado nuevoCuadrado  = new Cuadrado(this.posicion_largo,this.posicion_altura,null, Color.GREEN,this.dimension);
        this.posicion_largo+=20;
        Graphics g = lienzo1.getGraphics();
        this.lienzo1.DibujarCuadrado(g, nuevoCuadrado);
        }
    }//GEN-LAST:event_jButtonVerdeActionPerformed

    private void jButtonPielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPielActionPerformed
        // TODO add your handling code here:
        if(this.posicion_largo== 320){
            this.posicion_largo = 0;
            this.posicion_altura += 20;
        }
        else if(this.posicion_altura != 320 && this.posicion_largo != 320){
        Cuadrado nuevoCuadrado  = new Cuadrado(this.posicion_largo,this.posicion_altura,null, Color.PINK,this.dimension);
        this.posicion_largo+=20;
        Graphics g = lienzo1.getGraphics();
        this.lienzo1.DibujarCuadrado(g, nuevoCuadrado);
        }
    }//GEN-LAST:event_jButtonPielActionPerformed

    private void jButtonPielDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPielDeleteActionPerformed
        // TODO add your handling code here:
        if(this.posicion_largo == 0){
            this.posicion_largo = 320;
            this.posicion_altura -= 20;
        }
        if(this.posicion_largo > 0){
            this.posicion_largo -= 20;
        Cuadrado nuevoCuadrado  = new Cuadrado(this.posicion_largo,this.posicion_altura,null,Color.WHITE,this.dimension);
        Graphics g = lienzo1.getGraphics();
        this.lienzo1.DibujarCuadrado(g, nuevoCuadrado);
        }
    }//GEN-LAST:event_jButtonPielDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBlanco;
    private javax.swing.JButton jButtonNegro;
    private javax.swing.JButton jButtonPiel;
    private javax.swing.JButton jButtonPielDelete;
    private javax.swing.JButton jButtonVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private claseprimitivasgraficas.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables
}
