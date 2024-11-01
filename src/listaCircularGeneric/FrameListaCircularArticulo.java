package listaCircularGeneric;


import java.awt.event.ActionEvent;
import javax.swing.*;

public class FrameListaCircularArticulo extends javax.swing.JInternalFrame {

    private ListaDobleCircular<Articulo> listaDobleCircular;
    private Articulo articulo;
    private NodoListaDobleCircular<Articulo> nodo;

    public FrameListaCircularArticulo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeroField = new JTextField();
        tituloField = new JTextField();
        autorField = new JTextField();
        posicionField = new JTextField();
        numeroLabel = new JLabel("NUMERO:");
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
        primeroButton = new JButton("PRIMERO");
        siguienteButton = new JButton("SIGUIENTE");
        todosButton = new JButton("TODOS");
        anteriorButton = new JButton("ANTERIOR");
        ultimoButton = new JButton("ULTIMO");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("A R T I C U L O S");
        setVisible(true);

        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                crearButtonActionPerformed(e);
            }
        });
        insertarInicioButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
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
                cantidadButtonActionPerformed(e);
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
                destruirButtonActionPerformed(e);
            }
        });
        primeroButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                primeroButtonActionPerformed(e);
            }
        });
        siguienteButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                siguienteButtonActionPerformed(e);
            }
        });
        todosButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                todosButtonActionPerformed(e);
            }
        });
        anteriorButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                anteriorButtonActionPerformed(e);
            }
        });
        ultimoButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ultimoButtonActionPerformed(e);
            }
        });

        getContentPane().setLayout(null);

        numeroLabel.setBounds(30,30,150,25);
        numeroField.setBounds(100,30,250,25);
        tituloLabel.setBounds(30,65,150,25);
        tituloField.setBounds(100,65,250,25);
        autorLabel.setBounds(30,100,150,25);
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

        primeroButton.setBounds(40,500,110,25);
        siguienteButton.setBounds(160,500,110,25);
        todosButton.setBounds(280,500,110,25);
        anteriorButton.setBounds(400,500,110,25);
        ultimoButton.setBounds(520,500,110,25);


        // añadir componentes al panel
        add(numeroLabel);
        add(numeroField);
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
        add(primeroButton);
        add(siguienteButton);
        add(todosButton);
        add(anteriorButton);
        add(ultimoButton);


        getContentPane().setSize(700,600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null){
            listaDobleCircular = new ListaDobleCircular();

            resultTxtA.setText("Lista creada con exito.");
        } else {
            JOptionPane.showMessageDialog(null,"La lista ya ha sido creada.");
        }
    }
    private void insertarInicioButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null){
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");
            numeroField.setText("");
            tituloField.setText("");
            autorField.setText("");

        } else {
            String sNumero = numeroField.getText();
            String stitulo = tituloField.getText();
            String sAutor = autorField.getText();

            if (sNumero.isBlank() || stitulo.isBlank() || sAutor.isBlank()){
                JOptionPane.showMessageDialog(null,"Error. Ninguno de los espacios debe quedar en blanco.");
            } else {
                try {
                    int iNumero = Integer.parseInt(sNumero);

                    articulo = new Articulo(stitulo,sAutor,iNumero);

                    listaDobleCircular.ingresarInicio(articulo);

                    resultTxtA.setText("Elemento agregado con exito.\n"+listaDobleCircular.mostrarElementos());

                    numeroField.setText("");
                    tituloField.setText("");
                    autorField.setText("");

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Numero invalido");
                }
            }

        }
    }
    private void insertarFinalButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null){
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");
            numeroField.setText("");
            tituloField.setText("");
            autorField.setText("");

        } else {
            String sNumero = numeroField.getText();
            String stitulo = tituloField.getText();
            String sAutor = autorField.getText();

            if (sNumero.isBlank() || stitulo.isBlank() || sAutor.isBlank()){
                JOptionPane.showMessageDialog(null,"Error. Ninguno de los espacios debe quedar en blanco.");
            } else {
                try {
                    int iNumero = Integer.parseInt(sNumero);

                    articulo = new Articulo(stitulo,sAutor,iNumero);

                    listaDobleCircular.ingresarFinal(articulo);

                    resultTxtA.setText("Elemento agregado con exito.\n"+listaDobleCircular.mostrarElementos());

                    numeroField.setText("");
                    tituloField.setText("");
                    autorField.setText("");

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Numero invalido");
                }
            }

        }
    }
    private void insertarEnPosicionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null){
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");

        } else {
            add(posicionLabel);
            add(posicionField);

            revalidate(); // Recalcula el diseño del panel por añadir nuevos elementos en la condicion
            repaint();    // Redibuja el panel para que los nuevos componentes se vean

            resultTxtA.setText("Posiciones disponibles: Del 0 al "+listaDobleCircular.getCantidad());

            String sNumero = numeroField.getText();
            String stitulo = tituloField.getText();
            String sAutor = autorField.getText();
            String sPosicion = posicionField.getText();

            if (sNumero.isBlank() || stitulo.isBlank() || sAutor.isBlank() || sPosicion.trim().isBlank()){
                JOptionPane.showMessageDialog(null,"Error. Ninguno de los espacios debe quedar en blanco.");
            } else {
                try {
                    int iNumero = Integer.parseInt(sNumero);

                    int iPosicion = Integer.parseInt(sPosicion);

                    if (iPosicion > listaDobleCircular.getCantidad() || iPosicion < 0){
                        JOptionPane.showMessageDialog(null,"Posicion invalida.");
                    } else {
                        articulo = new Articulo(stitulo,sAutor,iNumero);


                        listaDobleCircular.ingresarEnPosicion(articulo,iPosicion);

                        resultTxtA.setText("Elemento agregado con exito.\n"+listaDobleCircular.mostrarElementos());

                        numeroField.setText("");
                        tituloField.setText("");
                        autorField.setText("");
                        posicionField.setText("");
                        remove(posicionLabel);
                        remove(posicionField);
                    }


                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Numero invalido o posicion invalida.");
                }
            }
        }
    }
    private void quitarInicioButtonActionPerformed(ActionEvent evt) {
        if (listaDobleCircular == null){
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");

        } else {
            Articulo articuloEliminado = listaDobleCircular.eliminarInicio();

            if (articuloEliminado != null) {
                // Actualizar el campo de texto con el libro eliminado y la lista actualizada
                resultTxtA.setText("Elemento eliminado correctamente.\n\nElemento eliminado:\n\n"+articuloEliminado.toString() +
                        "\n\nElementos restantes en la lista:\n" + listaDobleCircular.mostrarElementos());
            } else {
                resultTxtA.setText("No se pudo eliminar el elemento. La lista está vacía.");
            }
        }
    }
    private void quitarFinalButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null) {
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");
        } else {
            Articulo eliminado = listaDobleCircular.eliminarFinal();
            if (eliminado != null) {
                resultTxtA.setText("Elemento eliminado correctamente.\n\nElemento eliminado:\n\n" + eliminado.toString() +
                        "\n\nElementos restantes en la lista:\n" + listaDobleCircular.mostrarElementos());
            } else {
                resultTxtA.setText("No se pudo eliminar el elemento. La lista está vacía.");
            }
        }
    }
    private void quitarEnPosicionButtonActionPerformed(ActionEvent evt) {
        if (listaDobleCircular == null) {
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");
        } else {
            add(posicionField);
            add(posicionLabel);

            revalidate();
            repaint();

            int disponibles = listaDobleCircular.getCantidad() -1;
            resultTxtA.setText("Posiciones disponibles para quitar: Del 0 al "+disponibles);

            String sPosicion = posicionField.getText();

            if (sPosicion.trim().isBlank()){
                JOptionPane.showMessageDialog(null,"Error. El espacio de posicion NO debe quedar en blanco.");

            } else {
                try {
                    int iPosicion = Integer.parseInt(sPosicion);

                    if (iPosicion > disponibles || iPosicion < 0){
                        JOptionPane.showMessageDialog(null,"Posicion invalida.");

                    }else {
                        Articulo eliminado = listaDobleCircular.eliminarEnPosicion(iPosicion);
                        if (eliminado != null) {
                            resultTxtA.setText("Elemento eliminado correctamente.\n\nElemento eliminado:\n\n" + eliminado.toString() +
                                    "\n\nElementos restantes en la lista:\n" + listaDobleCircular.mostrarElementos());

                            numeroField.setText("");
                            tituloField.setText("");
                            autorField.setText("");
                            posicionField.setText("");
                            remove(posicionLabel);
                            remove(posicionField);
                        } else {
                            JOptionPane.showMessageDialog(null,"Error. Posición inválida o la lista está vacía.");
                        }
                    }

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Posición inválida.");
                }
            }

        }
    }
    private void modificarButtonActionPerformed(ActionEvent evt) {
        if (listaDobleCircular == null) {
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");
        } else {
            add(posicionField);
            add(posicionLabel);

            revalidate();
            repaint();

            int disponibles = listaDobleCircular.getCantidad() -1;
            resultTxtA.setText("Posiciones disponibles para modificar: Del 0 al "+disponibles);


            String sNumero = numeroField.getText();
            String stitulo = tituloField.getText();
            String sAutor = autorField.getText();
            String sPosicion = posicionField.getText();

            if (sNumero.isBlank() || stitulo.isBlank() || sAutor.isBlank() || sPosicion.trim().isBlank()){
                JOptionPane.showMessageDialog(null,"Error. Ninguno de los espacios debe quedar en blanco.");
            } else {
                try {
                    int iNumero = Integer.parseInt(sNumero);

                    int iPosicion = Integer.parseInt(sPosicion);

                    if (iPosicion > disponibles || iPosicion < 0){
                        JOptionPane.showMessageDialog(null,"Posicion invalida.");
                    } else {
                        Articulo nuevoArticulo = new Articulo(stitulo,sAutor,iNumero);

                        if (listaDobleCircular.modificar(iPosicion, nuevoArticulo)) {
                            resultTxtA.setText("Elemento modificado correctamente.\n\nElementos en la lista:\n" + listaDobleCircular.mostrarElementos());

                            numeroField.setText("");
                            tituloField.setText("");
                            autorField.setText("");
                            remove(posicionLabel);
                            remove(posicionField);
                        } else {
                            JOptionPane.showMessageDialog(null,"Error. Posición inválida.");
                        }
                    }

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null,"Error. Datos inválidos.");
                }
            }

        }
    }
    private void cantidadButtonActionPerformed(ActionEvent evt) {
        if (listaDobleCircular == null){
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");

        } else {

            resultTxtA.setText("Cantidad de elementos en la lista: "+listaDobleCircular.getCantidad());
        }
    }
    private void vaciarButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null) {
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado o ya ha sido destruida.");
        } else {
            listaDobleCircular.vaciar();
            resultTxtA.setText("La lista ha sido vaciada.");
        }
    }
    private void destruirButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null) {
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado o ya ha sido destruida.");
        } else {
            listaDobleCircular.destruir();
            listaDobleCircular = null; // Resetear la referencia
            resultTxtA.setText("La lista ha sido destruida.");
        }
    }
    private void primeroButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null){
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");

        } else {
            resultTxtA.setText(listaDobleCircular.primeroFuncion().toString());
        }
    }
    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null){
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");

        } else {
            resultTxtA.setText(listaDobleCircular.siguienteFuncion().toString());

        }
    }
    private void todosButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null){
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");
            numeroField.setText("");
            tituloField.setText("");
            autorField.setText("");
        } else {
            resultTxtA.setText("Lista de elementos:\n"+listaDobleCircular.mostrarElementos());

            numeroField.setText("");
            tituloField.setText("");
            autorField.setText("");
        }
    }
    private void anteriorButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null) {
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");
        } else {
            resultTxtA.setText(listaDobleCircular.anteriorFuncion().toString());
        }
    }
    private void ultimoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDobleCircular == null) {
            JOptionPane.showMessageDialog(null,"Error. La lista aun no se ha creado.");
        } else {
            resultTxtA.setText(listaDobleCircular.ultimoFuncion().toString());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField numeroField;
    private JTextField tituloField;
    private JTextField autorField;
    private JLabel numeroLabel;
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
    private JButton primeroButton;
    private JButton todosButton;
    private JButton anteriorButton;
    private JButton ultimoButton;
    private JButton siguienteButton;
    private JLabel posicionLabel;
    private JTextField posicionField;
}

