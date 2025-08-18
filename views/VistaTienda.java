package views;

import panel.PanelProducto;

import javax.swing.*;
import java.awt.*;

public class VistaTienda extends JFrame {
    private JTextField campoBuscar;
    private JPanel panelProductos;

    public VistaTienda() {
        setTitle("Tienda Fercher");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLayout(new BorderLayout());
        

        // Panel izquierdo de búsqueda
      
        JPanel panelBusqueda = new JPanel();
        panelBusqueda.setPreferredSize(new Dimension(140, getHeight()));
       JLabel etiquetaBuscar = new JLabel("Buscar");
        
   
      
        campoBuscar = new JTextField(10);
      

        panelBusqueda.add(etiquetaBuscar);
        panelBusqueda.add(campoBuscar);

        // Panel derecho de productos
        JPanel panelDerecho = new JPanel(new BorderLayout());
        panelBusqueda.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));// ayuda de chat gpt
    

        JLabel etiquetaProductos = new JLabel("Producto");
        etiquetaProductos.setForeground(Color.BLACK);


        panelProductos = new JPanel(new GridLayout(2, 4, 10, 10));
      

        // Agregar 8 productos como prueba
        for (int i = 0; i < 8; i++) {
            panelProductos.add(new PanelProducto());
        }

        panelDerecho.add(etiquetaProductos, BorderLayout.NORTH);
        panelDerecho.add(panelProductos, BorderLayout.CENTER);

        add(panelBusqueda, BorderLayout.WEST);
        add(panelDerecho, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new VistaTienda();
    }
}
