package tryGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingUI {
    private JPanel mainPanel;
    private JTextField textField1;
    private JButton aceptarButton;
    private JTextArea textArea1;

    public SwingUI() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola mundo!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingUI");
        frame.setContentPane(new SwingUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); // que aparezca la ventana al centro
        frame.setResizable(false); // que no modifique su tamaño
        frame.setSize(500,200); // darle tamaño a la interface
        frame.setVisible(true);
    }
}
