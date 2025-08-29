package panel;

import javax.swing.*;
import java.awt.*;

public class panelProducto extends JPanel {

    public panelProducto() {
        setBackground(Color.WHITE);
        setLayout(new GridLayout(2, 3, 10, 10)); // 2 filas, 3 columnas

        // Simulación de productos
        for (int i = 1; i <= 6; i++) {
            add(new JButton("Producto " + i));
        }
    }
}
