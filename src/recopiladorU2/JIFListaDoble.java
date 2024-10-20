package recopiladorU2;

import listaDobleEnlazada.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

public class JIFListaDoble extends javax.swing.JInternalFrame {

    private ListaDobleLibros listaDoble;
    private Trabajo libro;
    public JIFListaDoble() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        isbnField = new JTextField();
        tituloField = new JTextField();
        autorField = new JTextField();
        posicionField = new JTextField();
        isbnLabel = new JLabel("ISBN:");
        tituloLabel = new JLabel("TITULO:");
        autorLabel = new JLabel("AUTOR:");
        posicionLabel = new JLabel("POSICION:");
        resultTxtA = new JTextArea();
        crearButton = new JButton("CREAR");
        insertarInicioButton = new JButton("INSERTAR INICIO");
        insertarFinalButton = new JButton("INSERTAR FINAL");
        insertarEnPosicionButton = new JButton("INSERTAR EN POSICION");
        quitarInicioButton = new JButton("QUITAR INICIO");
        quitarFinalButton = new JButton("QUITAR FINAL");
        quitarEnPosicionButton = new JButton("QUITAR EN POSICION");
        modificarButton = new JButton("MODIFICAR");
        cantidadDeLibrosButton = new JButton("CANTIDAD");
        vaciarListaButton = new JButton("VACIAR");
        destruirListaButton = new JButton("DESTRUIR");
        mostrarButton = new JButton("MOSTRAR ELEMENTOS");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("L I S T A   D O B  L E");
        setVisible(true);


        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                crearButtonActionPerformed(e);
            }
        });

        insertarInicioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                insertarInicioButtonActionPerformed(e);
            }
        });

        insertarFinalButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarFinalButtonActionPerformed(e);
            }
        });

        insertarEnPosicionButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                insertarEnPosicionButtonActionPerformed(e);
            }
        });

        quitarInicioButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                quitarInicioButtonActionPerformed(e);
            }
        });

        quitarFinalButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                quitarFinalButtonActionPerformed(e);
            }
        });

        quitarEnPosicionButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                quitarEnPosicionButtonActionPerformed(e);
            }
        });

        modificarButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarButtonActionPerformed(e);
            }
        });

        cantidadDeLibrosButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cantidadDeLibrosButtonActionPerformed(e);
            }
        });

        vaciarListaButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                vaciarButtonActionPerformed(e);
            }
        });

        destruirListaButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                destruirInicioButtonActionPerformed(e);
            }
        });

        mostrarButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarInicioButtonActionPerformed(e);
            }
        });

        getContentPane().setLayout(null);

        // posiciones de los componentes
        // posicion en x, en y, largo y ancho del componente
        isbnLabel.setBounds(50,30,150,25);
        isbnField.setBounds(100,30,250,25);
        tituloLabel.setBounds(40,65,150,25);
        tituloField.setBounds(100,65,250,25);
        autorLabel.setBounds(40,100,150,25);
        autorField.setBounds(100,100,250,25);
        posicionLabel.setBounds(30,135,150,25);
        posicionField.setBounds(100,135,250,25);
        resultTxtA.setBounds(40,170,410,300);

        crearButton.setBounds(500,30,150,25);
        insertarInicioButton.setBounds(500,70,150,25);
        insertarFinalButton.setBounds(500,110,150,25);
        insertarEnPosicionButton.setBounds(480,150,180,25);
        quitarInicioButton.setBounds(500,190,150,25);
        quitarFinalButton.setBounds(500,230,150,25);
        quitarEnPosicionButton.setBounds(480,270,180,25);
        modificarButton.setBounds(500,310,150,25);
        cantidadDeLibrosButton.setBounds(500,350,150,25);
        vaciarListaButton.setBounds(500,390,150,25);
        destruirListaButton.setBounds(500,430,150,25);
        mostrarButton.setBounds(40,500,180,25);



        // añadir componentes al panel
        add(isbnLabel);
        add(isbnField);
        add(tituloLabel);
        add(tituloField);
        add(autorLabel);
        add(autorField);

        add(resultTxtA);
        add(crearButton);
        add(insertarInicioButton);
        add(insertarFinalButton);
        add(insertarEnPosicionButton);
        add(quitarInicioButton);
        add(quitarFinalButton);
        add(quitarEnPosicionButton);
        add(modificarButton);
        add(cantidadDeLibrosButton);
        add(vaciarListaButton);
        add(destruirListaButton);
        add(mostrarButton);


        getContentPane().setSize(700,600);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }

    private void insertarInicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }

    private void insertarEnPosicionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }

    private void insertarFinalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }
    private void quitarInicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }
    private void quitarFinalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }
    private void quitarEnPosicionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }
    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }
    private void cantidadDeLibrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }
    private void vaciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }
    private void destruirInicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }
    private void mostrarInicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables

    private JTextField isbnField;
    private JTextField tituloField;
    private JTextField autorField;
    private JLabel isbnLabel;
    private JLabel tituloLabel;
    private JLabel autorLabel;
    private JTextArea resultTxtA;
    private JButton crearButton;
    private JButton insertarInicioButton;
    private JButton insertarFinalButton;
    private JButton destruirListaButton;
    private JButton quitarFinalButton;
    private JButton cantidadDeLibrosButton;
    private JButton insertarEnPosicionButton;
    private JButton modificarButton;
    private JButton quitarInicioButton;
    private JButton quitarEnPosicionButton;
    private JButton vaciarListaButton;
    private JButton mostrarButton;
    private JLabel posicionLabel;
    private JTextField posicionField;
}

