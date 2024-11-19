package arbolBinarioBusqueda;

import javax.swing.*;
import java.awt.*;

public class GuiBST<E extends Nombrable & Comparable<E>> extends JFrame {

    private JPanel ventana;
    private ArbolBST<E> arbol;

    public GuiBST(ArbolBST<E> arbol) {
        super("Árbol Binario Gráfico");
        this.arbol = arbol;
        this.ventana = new JPanel();
        ventana.setPreferredSize(new Dimension(800, 600));
        add(ventana);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public int drawTree(Graphics g, NodoBST<E> x, int x0, int x1, int y) {
        if (x == null) return 0;

        int m = (x0 + x1) / 2;
        g.setColor(Color.CYAN);
        g.fillOval(m, y, 50, 40);
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Arial", Font.BOLD, 20));

        String t = x.getDato().toStringNombre();
        g.drawString(t, m + 20, y + 30);

        if (x.getIzq() != null) {
            int x2 = drawTree(g, x.getIzq(), x0, m, y + 50);
            g.drawLine(m + 25, y + 40, x2 + 25, y + 50);
        }
        if (x.getDcho() != null) {
            int x2 = drawTree(g, x.getDcho(), m, x1, y + 50);
            g.drawLine(m + 25, y + 40, x2 + 25, y + 50);
        }

        return m;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawTree(g, arbol.getRaiz(), 0, this.getWidth() - 25, 100);
    }
}
