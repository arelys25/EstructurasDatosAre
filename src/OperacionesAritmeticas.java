import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperacionesAritmeticas {
    private JTextField num1Txt;
    private JTextField num2Txt;

    private JButton sumarButton;
    private JButton residuoButton;
    private JButton dividirButton;
    private JButton multiplicarButton;
    private JButton restarButton;

    private JLabel sumaLabel;
    private JLabel restaLabel;
    private JLabel multiplicacionLabel;
    private JLabel divisionLabel;
    private JLabel residuoLabel;

    private JLabel cantidad1Label;
    private JLabel cantidad2Label;

    public OperacionesAritmeticas() {
        // Inicializar el JFrame y configurar el panel
        JFrame frame = new JFrame("Operaciones Aritméticas");
        JPanel panel = new JPanel();
        frame.setContentPane(panel);
        panel.setLayout(null); // Usar layout null para posicionar componentes manualmente

        // Inicialización de componentes
        num1Txt = new JTextField();
        num2Txt = new JTextField();
        sumarButton = new JButton("Sumar");
        restarButton = new JButton("Restar");
        multiplicarButton = new JButton("Multiplicar");
        dividirButton = new JButton("Dividir");
        residuoButton = new JButton("Residuo");

        sumaLabel = new JLabel("Suma:");
        restaLabel = new JLabel("Resta:");
        multiplicacionLabel = new JLabel("Multiplicación:");
        divisionLabel = new JLabel("División:");
        residuoLabel = new JLabel("Residuo:");

        // Posicionamiento de componentes
        num1Txt.setBounds(50, 30, 150, 25);
        num2Txt.setBounds(50, 70, 150, 25);
        sumarButton.setBounds(50, 110, 100, 25);
        restarButton.setBounds(160, 110, 100, 25);
        multiplicarButton.setBounds(50, 150, 100, 25);
        dividirButton.setBounds(160, 150, 100, 25);
        residuoButton.setBounds(105, 190, 100, 25);

        sumaLabel.setBounds(50, 230, 200, 25);
        restaLabel.setBounds(50, 260, 200, 25);
        multiplicacionLabel.setBounds(50, 290, 200, 25);
        divisionLabel.setBounds(50, 320, 200, 25);
        residuoLabel.setBounds(50, 350, 200, 25);

        // Añadir componentes al panel
        panel.add(num1Txt);
        panel.add(num2Txt);
        panel.add(sumarButton);
        panel.add(restarButton);
        panel.add(multiplicarButton);
        panel.add(dividirButton);
        panel.add(residuoButton);

        panel.add(sumaLabel);
        panel.add(restaLabel);
        panel.add(multiplicacionLabel);
        panel.add(divisionLabel);
        panel.add(residuoLabel);


        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // descarga de datos:

                // forma 1 de conventir un string a int
                String sNum1 = num1Txt.getText();
                String sNum2 = num2Txt.getText();
                if (sNum1.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 1 no puede estar vacio");
                } else if (sNum2.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 2 no puede estar vacio");
                } else {
                    try {
                        int iNum1 = Integer.parseInt(sNum1);
                        int iNum2 = Integer.parseInt(sNum2);

                        // forma 2 de conventir un string a int
                        //int iNum2 = Integer.parseInt(num2Txt.getText());

                        // proceso:
                        int suma = iNum1 + iNum2;

                        // carga de datos (enviar la informacion a la ventana):

                        sumaLabel.setText("Suma: " + suma); // como es int tenemos que concatenarlo con un string

                        JOptionPane.showMessageDialog(null,"Suma: "+suma);
                    } catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Error. Solopuedes usar numeros");
                    }
                }

            }

        });


        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // descarga de datos:

                // forma 1 de conventir un string a int
                String sNum1 = num1Txt.getText();
                String sNum2 = num2Txt.getText();
                if (sNum1.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 1 no puede estar vacio");
                } else if (sNum2.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 2 no puede estar vacio");
                } else {

                    try {
                        int iNum1 = Integer.parseInt(sNum1);
                        int iNum2 = Integer.parseInt(sNum2);

                        // forma 2 de conventir un string a int
                        //int iNum2 = Integer.parseInt(num2Txt.getText());

                        // proceso:
                        int resta = iNum1 - iNum2;

                        // carga de datos (enviar la informacion a la ventana):

                        restaLabel.setText("Resta: " + resta); // como es int tenemos que concatenarlo con un string

                        JOptionPane.showMessageDialog(null,"Resta: "+resta);
                    } catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Error. Solopuedes usar numeros");
                    }

                }
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // descarga de datos:

                // forma 1 de conventir un string a int
                String sNum1 = num1Txt.getText();
                String sNum2 = num2Txt.getText();
                if (sNum1.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 1 no puede estar vacio");
                } else if (sNum2.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 2 no puede estar vacio");
                } else {

                    try {
                        int iNum1 = Integer.parseInt(sNum1);
                        int iNum2 = Integer.parseInt(sNum2);

                        // forma 2 de conventir un string a int
                        //int iNum2 = Integer.parseInt(num2Txt.getText());

                        // proceso:
                        int multi = iNum1 * iNum2;

                        // carga de datos (enviar la informacion a la ventana):

                        multiplicacionLabel.setText("Multiplicacion: " + multi); // como es int tenemos que concatenarlo con un string

                        JOptionPane.showMessageDialog(null,"Multiplicacion: "+multi);
                    } catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Error. Solopuedes usar numeros");
                    }




                }
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // descarga de datos:

                // forma 1 de conventir un string a int
                String sNum1 = num1Txt.getText();
                String sNum2 = num2Txt.getText();
                if (sNum1.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 1 no puede estar vacio");
                } else if (sNum2.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 2 no puede estar vacio");
                } else {

                    try {
                        int iNum1 = Integer.parseInt(sNum1);
                        int iNum2 = Integer.parseInt(sNum2);

                        // forma 2 de conventir un string a int
                        //int iNum2 = Integer.parseInt(num2Txt.getText());

                        // proceso:
                        int division = iNum1 / iNum2;

                        // carga de datos (enviar la informacion a la ventana):

                        divisionLabel.setText("Division: " + division); // como es int tenemos que concatenarlo con un string

                        JOptionPane.showMessageDialog(null,"Division: "+division);

                        JOptionPane.showMessageDialog(null,"Division: "+division);
                    } catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Error. Solopuedes usar numeros");
                    }

                }
            }
        });

        residuoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // descarga de datos:

                // forma 1 de conventir un string a int
                String sNum1 = num1Txt.getText();
                String sNum2 = num2Txt.getText();
                if (sNum1.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 1 no puede estar vacio");
                } else if (sNum2.trim().isBlank()) {
                    JOptionPane.showMessageDialog(null,"El numero 2 no puede estar vacio");
                } else {

                    try {
                        int iNum1 = Integer.parseInt(sNum1);
                        int iNum2 = Integer.parseInt(sNum2);

                        // forma 2 de conventir un string a int
                        //int iNum2 = Integer.parseInt(num2Txt.getText());

                        // proceso:
                        int residuo = iNum1 % iNum2;

                        // carga de datos (enviar la informacion a la ventana):

                        residuoLabel.setText("Residuo: " + residuo); // como es int tenemos que concatenarlo con un string

                        JOptionPane.showMessageDialog(null,"Residuo: "+residuo);

                        JOptionPane.showMessageDialog(null,"Residuo: "+residuo);
                    } catch (NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null,"Error. Solopuedes usar numeros");
                    }

                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new OperacionesAritmeticas();

        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OperacionesAritmeticas().setVisible(true);
            }
        });

         */
    }

}
