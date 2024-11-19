package arbolBinarioBusqueda;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear el árbol y agregar algunas ciudades
                ArbolBST<Ciudad> arbol = new ArbolBST<>();
                arbol.insertar(new Ciudad("Madrid", "España", 3200000));
                arbol.insertar(new Ciudad("Guadalajara", "Mexico", 2500000));
                arbol.insertar(new Ciudad("Barcelona", "España", 1600000));
                arbol.insertar(new Ciudad("Buenos Aires", "Argentina", 2900000));
                arbol.insertar(new Ciudad("Lima", "Perú", 9000000));
                arbol.insertar(new Ciudad("New York", "Estados Unidos", 8419600));
                arbol.insertar(new Ciudad("Tokyo", "Japón", 13960000));
                arbol.insertar(new Ciudad("Moscú", "Rusia", 11920000));
                arbol.insertar(new Ciudad("São Paulo", "Brasil", 12300000));
                arbol.insertar(new Ciudad("Mumbai", "India", 12442373));


                // Crear la interfaz gráfica y mostrarla
                GuiBST gui = new GuiBST(arbol);
                gui.setSize(600, 600);
                gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui.setVisible(true);
            }
        });
    }
}
