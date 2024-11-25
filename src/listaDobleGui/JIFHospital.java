package listaDobleGui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class JIFHospital extends javax.swing.JInternalFrame {

    private ListaDoble listaDoble;
    private Hospital hospital;

    public JIFHospital() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTxt = new JTextField();
        especialidadTxt = new JTextField();
        direccionTxt = new JTextField();
        numDoctoresTxt = new JTextField();
        numPacientesTxt = new JTextField();
        nombreLbl = new JLabel("NOMBRE HOSPITAL:");
        especialidadLbl = new JLabel("ESPECIALIDAD:");
        direccionLbl = new JLabel("DIRECCION:");
        numDoctoresLbl = new JLabel("NUMERO DE DOCTORES:");
        numPacientesLbl = new JLabel("NUMERO DE PACIENTES:");
        resultTxtA = new JTextArea(10,30);
        crearButton = new JButton("CREAR");
        agregarBtn = new JButton("AGREGAR");
        buscarBtn = new JButton("BUSCAR");
        quitarBtn = new JButton("QUITAR");
        invertirBtn = new JButton("INVERTIR");
        modificarButton = new JButton("MODIFICAR");
        cantidadDeLibrosButton = new JButton("CANTIDAD");
        vaciarListaButton = new JButton("VACIAR");
        destruirListaButton = new JButton("DESTRUIR");
        primeroButton = new JButton("PRIMERO");
        siguienteButton = new JButton("SIGUIENTE");
        todosButton = new JButton("TODOS");
        anteriorButton = new JButton("ANTERIOR");
        ultimoButton = new JButton("ULTIMO");
        scrollPane = new JScrollPane(resultTxtA);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("H O S P I T A L");
        setVisible(true);

        crearButton.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                crearButtonActionPerformed(e);
            }
        });
        agregarBtn.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarButtonActionPerformed(e);
            }
        });
        buscarBtn.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarButtonActionPerformed(e);
            }
        });
        quitarBtn.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                quitarButtonActionPerformed(e);
            }
        });
        invertirBtn.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                invertirButtonActionPerformed(e);
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

        resultTxtA.setLineWrap(true); // Habilitar ajuste de línea
        resultTxtA.setWrapStyleWord(true);

        nombreLbl.setBounds(70,30,150,25);
        nombreTxt.setBounds(190,30,250,25);
        especialidadLbl.setBounds(95,65,150,25);
        especialidadTxt.setBounds(190,65,250,25);
        direccionLbl.setBounds(115,100,150,25);
        direccionTxt.setBounds(190,100,250,25);
        numDoctoresLbl.setBounds(40,135,150,25);
        numDoctoresTxt.setBounds(190,135,250,25);
        numPacientesLbl.setBounds(40,170,150,25);
        numPacientesTxt.setBounds(190,170,250,25);

        resultTxtA.setBounds(40,220,420,300);
        scrollPane.setBounds(40, 220, 420, 300);

        crearButton.setBounds(500,30,150,25);
        agregarBtn.setBounds(500,70,150,25);
        buscarBtn.setBounds(500,110,150,25);
        quitarBtn.setBounds(500,150,150,25);
        invertirBtn.setBounds(500,190,150,25);
        modificarButton.setBounds(500,230,150,25);
        cantidadDeLibrosButton.setBounds(500,270,150,25);
        vaciarListaButton.setBounds(500,310,150,25);
        destruirListaButton.setBounds(500,350,150,25);

        primeroButton.setBounds(40,540,110,25);
        siguienteButton.setBounds(160,540,110,25);
        todosButton.setBounds(280,540,110,25);
        anteriorButton.setBounds(400,540,110,25);
        ultimoButton.setBounds(520,540,110,25);


        // añadir componentes al panel
        add(nombreLbl);
        add(nombreTxt);
        add(especialidadLbl);
        add(especialidadTxt);
        add(direccionLbl);
        add(direccionTxt);
        add(numDoctoresLbl);
        add(numDoctoresTxt);
        add(numPacientesLbl);
        add(numPacientesTxt);

        //add(resultTxtA); no se agrega porque ya esta en el scrollpane
        add(crearButton);
        add(agregarBtn);
        add(buscarBtn);
        add(quitarBtn);
        add(invertirBtn);
        add(modificarButton);
        add(cantidadDeLibrosButton);
        add(vaciarListaButton);
        add(destruirListaButton);
        add(primeroButton);
        add(siguienteButton);
        add(todosButton);
        add(anteriorButton);
        add(ultimoButton);
        add(scrollPane);


        getContentPane().setSize(700,600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble == null){
            listaDoble = new ListaDoble();
            resultTxtA.setText("Lista doble creada con exito.");
        } else {
            JOptionPane.showMessageDialog(null,"La lista doble ya ha sido creada.");

        }

    }

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null) {
            String sNombre = nombreTxt.getText();
            String sEspecialidad = especialidadTxt.getText();
            String sDireccion = direccionTxt.getText();
            String sDoctores = numDoctoresTxt.getText();
            String sPacientes = numPacientesTxt.getText();

            if (sNombre.isBlank() || sEspecialidad.isBlank() || sDireccion.isBlank() || sDoctores.isBlank() || sPacientes.isBlank()) {
                JOptionPane.showMessageDialog(null, "Error. Ninguno de los espacios debe quedar en blanco.");
            } else {
                try {
                    int iDoctores = Integer.parseInt(sDoctores);
                    int iPacientes = Integer.parseInt(sPacientes);

                    hospital = new Hospital(sNombre, sEspecialidad, sDireccion, iDoctores, iPacientes);

                    // Intentar agregar el elemento
                    boolean agregado = listaDoble.agregarElemento(hospital);

                    if (agregado) {
                        resultTxtA.setText("Elemento agregado con éxito\n" + listaDoble.imprimirLista());
                        // Limpiar campos
                        nombreTxt.setText("");
                        especialidadTxt.setText("");
                        direccionTxt.setText("");
                        numDoctoresTxt.setText("");
                        numPacientesTxt.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "El elemento con el nombre '" + sNombre + "' ya existe en la lista.");
                    }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Error. Datos inválidos.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe crear la lista doble primero.");
        }

    }
    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){

            String sNombre = nombreTxt.getText();

            if (sNombre.isBlank()){
                JOptionPane.showMessageDialog(null,"Por favor ingrese el nombre del elemento a buscar.");
                return;
            }

            resultTxtA.setText("Elemento encontrado:\n"+listaDoble.buscarYMostrar(sNombre));
            nombreTxt.setText("");
            especialidadTxt.setText("");
            direccionTxt.setText("");
            numDoctoresTxt.setText("");
            numPacientesTxt.setText("");

        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }
    }
    private void quitarButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){
            String nombre = nombreTxt.getText();
            if (nombre.isBlank()) {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre del elemento a quitar.");
            } else if (listaDoble.quitar(nombre)) {
                resultTxtA.setText("Elemento eliminado con éxito.\n" + listaDoble.imprimirLista());
                nombreTxt.setText("");
                especialidadTxt.setText("");
                direccionTxt.setText("");
                numDoctoresTxt.setText("");
                numPacientesTxt.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Elemento no encontrado.");
            }

        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }

    }
    private void invertirButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){
            listaDoble.invertir();
            resultTxtA.setText("Lista invertida con éxito.\n" + listaDoble.imprimirLista());
        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }

    }
    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){
            String sNombre = nombreTxt.getText();

            if (sNombre.isBlank()){
                JOptionPane.showMessageDialog(null,"Por favor ingrese el nombre del elemento a buscar.");
                return;

            }

            if (listaDoble.buscar(sNombre)){
                String sEspecialidad = especialidadTxt.getText();
                String sDireccion = direccionTxt.getText();
                String sDoctores = numDoctoresTxt.getText();
                String sPacientes = numPacientesTxt.getText();

                if (sNombre.isBlank() || sEspecialidad.isBlank() || sDireccion.isBlank() || sDoctores.isBlank() || sPacientes.isBlank()){
                    JOptionPane.showMessageDialog(null,"Error. Ninguno de los espacios debe quedar en blanco.");

                } else {
                    try {
                        int iDoctores = Integer.parseInt(sDoctores);
                        int iPacientes = Integer.parseInt(sPacientes);

                        hospital = new Hospital(sNombre,sEspecialidad,sDireccion,iDoctores,iPacientes);

                        listaDoble.modificarElemento(hospital);

                        resultTxtA.setText("Elemento modificado con exito\n"+listaDoble.imprimirLista());

                        nombreTxt.setText("");
                        especialidadTxt.setText("");
                        direccionTxt.setText("");
                        numDoctoresTxt.setText("");
                        numPacientesTxt.setText("");
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null,"Error. Datos invalidos.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,"Error. Libro no encontrado.");
            }


        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }

    }
    private void cantidadButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){
            resultTxtA.setText("Cantidad de elementos en la lista: "+listaDoble.cantidad()+"\n");
        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }

    }
    private void vaciarButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){
            listaDoble.vaciar();
            resultTxtA.setText("Lista vaciada con éxito.");

        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }

    }
    private void destruirButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){
            listaDoble = null;
            resultTxtA.setText("La lista de elementos ha sido destruida con exito.");
        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }

    }
    private void primeroButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDoble != null) {
            listaDoble.resetActual(); // Reiniciar al inicio
            Hospital primero = (Hospital) listaDoble.primero();
            resultTxtA.setText(primero != null ? primero.toString() : "La lista está vacía.");
        } else {
            JOptionPane.showMessageDialog(null, "Debe crear la lista primero.");
        }
    }
    private void siguienteButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){
            Hospital siguiente = (Hospital) listaDoble.siguiente();
            if (siguiente != null) {
                resultTxtA.setText(siguiente.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No hay más elementos.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }

    }
    private void todosButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){
            resultTxtA.setText("Lista de elementos:\n"+listaDoble.imprimirLista());

        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }

    }
    private void anteriorButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (listaDoble != null){
            Hospital anterior = (Hospital) listaDoble.anterior();
            if (anterior != null) {
                resultTxtA.setText(anterior.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No hay más elementos hacia atrás.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Debe crear la lista doble primero.");

        }

    }
    private void ultimoButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (listaDoble != null) {
            listaDoble.setActualToEnd(); // Ir al final
            Hospital ultimo = (Hospital) listaDoble.ultimo();
            resultTxtA.setText(ultimo != null ? ultimo.toString() : "La lista está vacia.");
        } else {
            JOptionPane.showMessageDialog(null, "Debe crear la lista primero.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField nombreTxt;
    private JTextField especialidadTxt;
    private JTextField direccionTxt;
    private JTextField numDoctoresTxt;
    private JTextField numPacientesTxt;
    private JLabel nombreLbl;
    private JLabel especialidadLbl;
    private JLabel direccionLbl;
    private JLabel numDoctoresLbl;
    private JLabel numPacientesLbl;
    private JTextArea resultTxtA;
    private JButton crearButton;
    private JButton agregarBtn;
    private JButton buscarBtn;
    private JButton destruirListaButton;
    private JButton quitarBtn;
    private JButton cantidadDeLibrosButton;
    private JButton modificarButton;
    private JButton invertirBtn;
    private JButton vaciarListaButton;
    private JButton primeroButton;
    private JButton todosButton;
    private JButton anteriorButton;
    private JButton ultimoButton;
    private JButton siguienteButton;
    private JScrollPane scrollPane;
}


