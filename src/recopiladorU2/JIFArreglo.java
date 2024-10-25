package recopiladorU2;

import clases.*;

import javax.swing.*;

public class JIFArreglo extends javax.swing.JInternalFrame {
    private Vehiculo[] vehiculos;
    private int contadorVehiculos;
    private int contadorBoton;
    /**
     * Creates new form JIFArreglo
     */
    public JIFArreglo() {
        initComponents();

        contadorVehiculos = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("A R R E G L O S");
        setMinimumSize(new java.awt.Dimension(850, 450));
        setVisible(true);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Abrir Estacionamiento");

        jLabel2.setText("Asignar lugar");

        jLabel3.setText("Mover Vehiculo de cajon");

        jLabel4.setText("Cambiar datos del vehiculo");

        jLabel5.setText("Retirar Vehiculo");

        jTextField2.setPreferredSize(new java.awt.Dimension(150, 22));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setPreferredSize(new java.awt.Dimension(150, 22));

        jTextField4.setPreferredSize(new java.awt.Dimension(150, 22));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Asignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cambiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Retirar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("");

        jLabel7.setText("");

        jLabel8.setText("");

        jLabel9.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5))
                                                .addGap(165, 165, 165))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9))
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel5))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(82, 82, 82)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jButton1)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jButton2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton4)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jButton5))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpiarCampos() {
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }
    private void limpiarLabel(){
        jLabel6.setText("");
        jLabel7.setText("");
        jLabel8.setText("");
        jLabel9.setText("");
    }

    private void abrirEstacionamiento() {
        if (vehiculos == null){
            // Inicializa el array de vehículos con un tamaño específico
            vehiculos = new Vehiculo[10]; // Puedes ajustar el tamaño según lo necesites
            contadorVehiculos = 0; // Reinicia el contador
            jTextArea1.append("Estacionamiento abierto. Listo para asignar vehículos.\n");
        } else {
            JOptionPane.showMessageDialog(null,"El estacionamiento ya esta abierto.");

        }

    }

    private void asignarVehiculo() {
        if (vehiculos == null){
            JOptionPane.showMessageDialog(null,"Debe abrir el estacionamiento primero.");
        } else {
            if (contadorVehiculos < vehiculos.length) {
                limpiarLabel();

                jLabel6.setText("matricula: ");
                jLabel7.setText("marca: ");
                jLabel8.setText("modelo: ");
                jLabel9.setText("anio: ");

                if(contadorBoton >= 2){
                    String matricula = jTextField2.getText();
                    String marca = jTextField3.getText();
                    String modelo = jTextField4.getText();
                    String anio = jTextField5.getText();

                    Vehiculo nuevoVehiculo = new Vehiculo(matricula, marca, anio, modelo,"predeterminado");
                    vehiculos[contadorVehiculos] = nuevoVehiculo;
                    contadorVehiculos++;

                    jTextArea1.setText(jTextArea1.getText() + "Vehículo asignado: " + nuevoVehiculo.toString() + "\n");
                    limpiarCampos();
                    contadorBoton = 0;
                }
            } else {
                jTextArea1.setText(jTextArea1.getText() + "No hay más espacio en el arreglo para nuevos vehículos.\n");
            }
        }

    }
    private void moverVehiculo() {
        if (vehiculos == null){
            JOptionPane.showMessageDialog(null,"Debe abrir el estacionamiento primero.");
        } else {
            try {
                jLabel6.setText("posicion actual: ");
                jLabel7.setText("nueva posicion");
                jLabel8.setText("");
                jLabel9.setText("");

                int posActual = Integer.parseInt(jTextField2.getText());
                int nuevaPos = Integer.parseInt(jTextField3.getText());


                if (posActual >= 0 && posActual < contadorVehiculos && nuevaPos >= 0 && nuevaPos < vehiculos.length) {
                    Vehiculo temp = vehiculos[posActual];
                    vehiculos[posActual] = null;

                    if (vehiculos[nuevaPos] == null) {
                        vehiculos[nuevaPos] = temp;
                        jTextArea1.append("Vehículo movido de posición " + posActual + " a " + nuevaPos + ".\n");
                    } else {
                        jTextArea1.append("El lugar destino ya está ocupado.\n");
                    }
                } else {
                    jTextArea1.append("Posición no válida.\n");
                }

                limpiarCampos();
            } catch (NumberFormatException e) {
                jTextArea1.append("Por favor, ingrese posiciones válidas.\n");
            }
        }

    }

    private void cambiarDatosVehiculo() {
        if (vehiculos == null){
            JOptionPane.showMessageDialog(null,"Debe abrir el estacionamiento primero.");
        } else {
            try {
                limpiarLabel();
                jLabel6.setText("posicion: ");
                jLabel7.setText("marca: ");
                jLabel8.setText("modelo: ");
                jLabel9.setText("anio: ");
                int pos = Integer.parseInt(jTextField2.getText());
                if (pos >= 0 && pos <= contadorVehiculos && vehiculos[pos] != null) {
                    String nuevaMarca = jTextField3.getText();
                    String nuevoAnio = jTextField5.getText();
                    String nuevoModelo = jTextField4.getText();

                    vehiculos[pos].setMarca(nuevaMarca);
                    vehiculos[pos].setAnio(nuevoAnio);
                    vehiculos[pos].setModelo(nuevoModelo);

                    jTextArea1.append("Datos del vehículo en la posición " + pos + " actualizados.\n");
                    jTextArea1.append("Información actualizada del vehículo: " + vehiculos[pos].toString() + "\n");
                } else {
                    jTextArea1.append("Posición no válida o vacía.\n");
                }
                limpiarCampos();
            } catch (NumberFormatException e) {
                jTextArea1.append("Por favor, ingrese una posición válida.\n");
            }
        }
    }

    private void retirarVehiculo() {
        if (vehiculos == null){
            JOptionPane.showMessageDialog(null,"Debe abrir el estacionamiento primero.");
        } else {
            limpiarLabel();
            jLabel6.setText("posicion: ");
            jLabel9.setText("");
            if(contadorBoton >= 2){
                contadorBoton = 0;
                try {
                    int pos = Integer.parseInt(jTextField2.getText());
                    if (pos >= 0 && pos <= contadorVehiculos && vehiculos[pos] != null) {
                        vehiculos[pos] = null;
                        jTextArea1.append("Vehículo retirado de la posición " + pos + ".\n");
                        contadorVehiculos --;
                    } else {
                        jTextArea1.append("Posición no válida o ya vacía.\n");
                    }
                    limpiarCampos();
                } catch (NumberFormatException e) {
                    jTextArea1.append("Por favor, ingrese una posición válida.\n");

                }
            }
        }

    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cambiarDatosVehiculo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        asignarVehiculo();
        contadorBoton +=1;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        abrirEstacionamiento();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        moverVehiculo();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        retirarVehiculo();
        contadorBoton +=1;
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

