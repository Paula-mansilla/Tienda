package panel;

import javax.swing.*;
import java.awt.*;

public class panelBuscador extends JPanel {

    public panelBuscador() {
        setPreferredSize(new Dimension(300, 800)); // ancho fijo para el panel izquierdo
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());

        add(new JLabel("🔎 Buscador:"));
        add(new JTextField(15));
        add(new JButton("Buscar"));
    }
}
