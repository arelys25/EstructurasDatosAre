package guiListaCircular;
import colas.Trabajo;
import listas.*;

import javax.swing.*;
import java.awt.*;

public class FrameListaCircularLibros {
    private static ListaSimple lista;
    private static Trabajo libro;
    private static Nodo nodo;
    private JPanel panel1;
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
    private JButton primeroButton;
    private JButton todosButton;
    private JButton anteriorButton;
    private JButton ultimoButton;
    private JButton siguienteButton;
    private JLabel posicionLabel;
    private JTextField posicionField;

    public FrameListaCircularLibros (){
        // Inicializar frame y el panel
        JFrame frame = new JFrame("Lista Circular Libros");
        panel1 = new JPanel();

        frame.setContentPane(panel1);
        panel1.setLayout(null);

        // Inicializar componentes
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
        primeroButton = new JButton("PRIMERO");
        siguienteButton = new JButton("SIGUIENTE");
        todosButton = new JButton("TODOS");
        anteriorButton = new JButton("ANTERIOR");
        ultimoButton = new JButton("ULTIMO");

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

        primeroButton.setBounds(40,500,110,25);
        siguienteButton.setBounds(160,500,110,25);
        todosButton.setBounds(280,500,110,25);
        anteriorButton.setBounds(400,500,110,25);
        ultimoButton.setBounds(520,500,110,25);


        // añadir componentes al panel
        panel1.add(isbnLabel);
        panel1.add(isbnField);
        panel1.add(tituloLabel);
        panel1.add(tituloField);
        panel1.add(autorLabel);
        panel1.add(autorField);
        panel1.add(posicionLabel);
        panel1.add(posicionField);

        panel1.add(resultTxtA);
        panel1.add(crearButton);
        panel1.add(insertarInicioButton);
        panel1.add(insertarFinalButton);
        panel1.add(insertarEnPosicionButton);
        panel1.add(quitarInicioButton);
        panel1.add(quitarFinalButton);
        panel1.add(quitarEnPosicionButton);
        panel1.add(modificarButton);
        panel1.add(cantidadDeLibrosButton);
        panel1.add(vaciarListaButton);
        panel1.add(destruirListaButton);
        panel1.add(primeroButton);
        panel1.add(siguienteButton);
        panel1.add(todosButton);
        panel1.add(anteriorButton);
        panel1.add(ultimoButton);
        

        // hacer que el frame sea visible
        // que se cierre al apretar la x
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // medidas del frame
        frame.setSize(700,600);
        // que se vea
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new FrameListaCircularLibros();
    }
}
