package views;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

// Importa tus paneles
import panel.panelBuscador;
import panel.panelProducto;

public class VistaTienda extends JFrame {

    public VistaTienda() {
        setTitle("Tienda en Java");
        setSize(1500, 800); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new BorderLayout());

        JPanel miVentana = new JPanel(new BorderLayout());
        miVentana.setBorder(new LineBorder(Color.BLACK, 2));

        panelBuscador buscador = new panelBuscador();
        miVentana.add(buscador, BorderLayout.WEST);

        panelProducto productos = new panelProducto();
        miVentana.add(productos, BorderLayout.CENTER);

        this.add(miVentana);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new VistaTienda();
    }
}
