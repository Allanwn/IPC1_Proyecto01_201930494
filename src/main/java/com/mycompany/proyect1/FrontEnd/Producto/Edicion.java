/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyect1.FrontEnd.Producto;

import com.mycompany.proyect1.BackEnd.util.Util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Edicion extends javax.swing.JFrame {

    /**
     * Creates new form Edicion
     */
    
    private ArrayList<String[]> listaProductos = new ArrayList<>();
    
    public Edicion() {


        initComponents();
        cargarProd();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel14 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton14 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel53.setText("Nombre");

        jLabel54.setText("Precio");

        jLabel55.setText("Stock");

        jTextField40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField40KeyTyped(evt);
            }
        });

        jTextField41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField41KeyTyped(evt);
            }
        });

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton14.setText("Guardar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel56.setText("Edicion Producto");

        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 180, Short.MAX_VALUE)
                            .addComponent(jTextField40)
                            .addComponent(jTextField41)
                            .addComponent(jButton14)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel56)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel56)
                .addGap(36, 36, 36)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14)
                    .addComponent(jButton3))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      
        /// nueva edicion 
        guardarDatosProducto();
        
    
        
    }//GEN-LAST:event_jButton14ActionPerformed


       private void guardarDatosProducto() {
        int indiceSeleccionado = jComboBox1.getSelectedIndex();

        if (indiceSeleccionado >= 0) {
            // Actualizar los datos en la lista
            String[] producto = listaProductos.get(indiceSeleccionado);
            producto[1] = jTextField40.getText(); // Actualizar precio
            producto[2] = jTextField41.getText();  // Actualizar stock

            // Sobrescribir el archivo con los nuevos datos
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(Util.miRuta+"/productos.txt"))) {

                for (String[] prod : listaProductos) {
                    bw.write(String.join(";", prod)); // Escribe cada producto como línea
                    bw.newLine();
                }
                
                JOptionPane.showMessageDialog(this, "Datos guardados exitosamente.");

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
            }
        }
    }


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Productos pro = new Productos();

        pro.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        mostrarDatosProducto();
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField40KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField40KeyTyped
     
        
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c !='.') { // Permite solo dígitos
            evt.consume(); // Ignora la entrada
        }
        
    }//GEN-LAST:event_jTextField40KeyTyped

    private void jTextField41KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField41KeyTyped
       
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) { // Permite solo dígitos
            evt.consume(); // Ignora la entrada
        }
        
    }//GEN-LAST:event_jTextField41KeyTyped



    private void cargarProd() {
        
        try (BufferedReader br = new BufferedReader(new FileReader(Util.miRuta+"/productos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 3) {
                    listaProductos.add(datos); // Almacena toda la línea dividida
                    jComboBox1.addItem(datos[0]); 
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar el archivo: " + e.getMessage());
        }
      
    }

    private void mostrarDatosProducto() {
        
        int indiceSeleccionado = jComboBox1.getSelectedIndex();
        if (indiceSeleccionado >= 0) {
            String[] producto = listaProductos.get(indiceSeleccionado);
            jTextField40.setText(producto[1]); // Precio
            jTextField41.setText(producto[2]);  // Stock
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    // End of variables declaration//GEN-END:variables
}
