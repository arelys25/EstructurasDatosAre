package recopiladorU2;

import guiListaCircular.Libro;
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

        anioField = new JTextField();
        tituloField = new JTextField();
        autorField = new JTextField();
        posicionField = new JTextField();
        anioLabel = new JLabel("AÑO:");
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
                mostrarButtonActionPerformed(e);
            }
        });

        getContentPane().setLayout(null);

        // posiciones de los componentes
        // posicion en x, en y, largo y ancho del componente
        anioLabel.setBounds(50,30,150,25);
        anioField.setBounds(100,30,250,25);
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
        add(anioLabel);
        add(anioField);
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
        if (listaDoble == null){
            listaDoble = new ListaDobleLibros();
            resultTxtA.setText("Lista doble creada con exito.\n");
        } else {
            JOptionPane.showMessageDialog(null,"La lista doble ya ha sido creada.");
        }
    }

    private void insertarInicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");
        } else {
            String sAnio = anioField.getText();
            String stitulo = tituloField.getText();
            String sAutor = autorField.getText();

            if (sAnio.isBlank() || stitulo.isBlank() || sAutor.isBlank()){
                JOptionPane.showMessageDialog(null,"Error. Ninguno de los espacios debe quedar en blanco.");
            } else {
                try {
                    int iAnio = Integer.parseInt(sAnio);

                    libro = new Trabajo(stitulo,sAutor,iAnio);

                    listaDoble.agregarAlInicio(libro);

                    resultTxtA.setText("Elemento agregado con exito.\n"+listaDoble.mostrarLibros());

                    anioField.setText("");
                    tituloField.setText("");
                    autorField.setText("");

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Año invalido");
                }
            }
        }
    }

    private void insertarEnPosicionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            add(posicionField);
            add(posicionLabel);

            revalidate();
            repaint();

            resultTxtA.setText("Posiciones disponibles: Del 0 al "+listaDoble.getCantidad());

            String sAnio = anioField.getText();
            String stitulo = tituloField.getText();
            String sAutor = autorField.getText();
            String sPosicion = posicionField.getText();

            if (sAnio.trim().isBlank() || stitulo.isBlank() || sAutor.isBlank() || sPosicion.trim().isBlank()){
                JOptionPane.showMessageDialog(null,"Error. Ninguno de los espacios debe quedar en blanco.");
            } else {
                try {
                    int iAnio = Integer.parseInt(sAnio);
                    int iPosicion = Integer.parseInt(sPosicion);

                    if (iPosicion > listaDoble.getCantidad() || iPosicion < 0){
                        JOptionPane.showMessageDialog(null,"Posicion invalida.");
                    } else {
                        libro = new Trabajo(stitulo,sAutor,iAnio);

                        listaDoble.agregarPuntoEspecifico(libro,iPosicion);

                        resultTxtA.setText("Elemento agregado con exito.\n"+listaDoble.mostrarLibros());

                        anioField.setText("");
                        tituloField.setText("");
                        autorField.setText("");
                        posicionField.setText("");
                        remove(posicionLabel);
                        remove(posicionField);
                    }


                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Año invalido o posicion invalida.");
                }
            }
        }
    }

    private void insertarFinalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            String sAnio = anioField.getText();
            String stitulo = tituloField.getText();
            String sAutor = autorField.getText();

            if (sAnio.isBlank() || stitulo.isBlank() || sAutor.isBlank()){
                JOptionPane.showMessageDialog(null,"Error. Ninguno de los espacios debe quedar en blanco.");
            } else {
                try {
                    int iAnio = Integer.parseInt(sAnio);

                    libro = new Trabajo(stitulo,sAutor,iAnio);

                    listaDoble.agregarAlFinal(libro);

                    resultTxtA.setText("Elemento agregado con exito.\n"+listaDoble.mostrarLibros());

                    anioField.setText("");
                    tituloField.setText("");
                    autorField.setText("");

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Año invalido");
                }
            }
        }
    }
    private void quitarInicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            listaDoble.eliminarElementoDelInicio();

            resultTxtA.setText("Elemento eliminado correctamente.\n\nElementos restantes:\n"+listaDoble.mostrarLibros());

        }
    }
    private void quitarFinalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            listaDoble.eliminarElementoFinal();
            resultTxtA.setText("Elemento eliminado correctamente.\n\nElementos restantes:\n"+listaDoble.mostrarLibros());
        }
    }
    private void quitarEnPosicionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            add(posicionField);
            add(posicionLabel);

            revalidate();
            repaint();

            int disponibles = listaDoble.getCantidad() -1;
            resultTxtA.setText("Posiciones disponibles para quitar: Del 0 al "+disponibles);

            String sPosicion = posicionField.getText();

            if (sPosicion.trim().isBlank()){
                JOptionPane.showMessageDialog(null,"Error. El espacio de posicion NO debe quedar en blanco.");
            } else {
                try {
                    int iPosicion = Integer.parseInt(sPosicion);

                    if (iPosicion > listaDoble.getCantidad() || iPosicion < 0){
                        JOptionPane.showMessageDialog(null,"Posicion invalida.");
                    } else {

                        listaDoble.eliminarElementoEnPosicion(iPosicion);

                        resultTxtA.setText("Elemento eliminado con exito.\n"+listaDoble.mostrarLibros());

                        anioField.setText("");
                        tituloField.setText("");
                        autorField.setText("");
                        posicionField.setText("");
                        remove(posicionLabel);
                        remove(posicionField);
                    }


                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Año invalido o posicion invalida.");
                }
            }

        }
    }
    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            add(posicionField);
            add(posicionLabel);

            revalidate();
            repaint();

            int disponibles = listaDoble.getCantidad() -1;
            resultTxtA.setText("Posiciones disponibles para modificar: Del 0 al "+disponibles);

            String sAnio = anioField.getText();
            String stitulo = tituloField.getText();
            String sAutor = autorField.getText();
            String sPosicion = posicionField.getText();

            if (sAnio.trim().isBlank() || stitulo.isBlank() || sAutor.isBlank() || sPosicion.trim().isBlank()){
                JOptionPane.showMessageDialog(null,"Error. Ninguno de los espacios debe quedar en blanco.");
            } else {
                try {
                    int iAnio = Integer.parseInt(sAnio);
                    int iPosicion = Integer.parseInt(sPosicion);

                    if (iPosicion > listaDoble.getCantidad() || iPosicion < 0){
                        JOptionPane.showMessageDialog(null,"Posicion invalida.");
                    } else {
                        libro = new Trabajo(stitulo,sAutor,iAnio);

                        listaDoble.modificarElementoEnPosicion(iPosicion,libro);

                        resultTxtA.setText("Elemento modificado con exito.\n"+listaDoble.mostrarLibros());

                        anioField.setText("");
                        tituloField.setText("");
                        autorField.setText("");
                        posicionField.setText("");
                        remove(posicionLabel);
                        remove(posicionField);
                    }


                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Año invalido o posicion invalida.");
                }
            }
        }
    }
    private void cantidadDeLibrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            resultTxtA.setText("Cantidad de libros: "+listaDoble.getCantidad());
        }
    }
    private void vaciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            listaDoble = null;
            resultTxtA.setText("Lista doble vaciada correctamente.");
        }
    }
    private void destruirInicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            listaDoble = null;
            resultTxtA.setText("Lista doble vaciada correctamente.");
        }
    }
    private void mostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaDoble == null){
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        } else {
            resultTxtA.setText(listaDoble.mostrarLibros());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables

    private JTextField anioField;
    private JTextField tituloField;
    private JTextField autorField;
    private JLabel anioLabel;
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

