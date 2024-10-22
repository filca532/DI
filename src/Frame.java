import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    public static JPanel panel = new JPanel();

    public static JButton azul,rosa,amarillo,verde;

    public Frame(){
        setTitle("Ejemplo con varios botones");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel.setLayout(new BorderLayout());
        azul = new JButton("Azul");
        Dimension d = new Dimension();
        d.height = 40;
        d.width = 100;
        azul.setPreferredSize(d);
        verde = new JButton("Verde");
        d.height = 40;
        d.width = 100;
        verde.setPreferredSize(d);
        amarillo = new JButton("Amarillo");
        d.height = 40;
        d.width = 100;
        amarillo.setPreferredSize(d);
        rosa = new JButton("Rosa");
        d.height = 40;
        d.width = 100;
        rosa.setPreferredSize(d);

        panel.add(azul,BorderLayout.SOUTH);
        ActionListener escuchadorAzul = new EscuchadorBoton(Color.blue);
        azul.addActionListener(escuchadorAzul);

        panel.add(verde,BorderLayout.NORTH);
        ActionListener escuchadorVerde = new EscuchadorBoton(Color.green);
        verde.addActionListener(escuchadorVerde);

        panel.add(amarillo,BorderLayout.EAST);
        ActionListener escuchadorAmarillo = new EscuchadorBoton(Color.yellow);
        amarillo.addActionListener(escuchadorAmarillo);

        panel.add(rosa,BorderLayout.WEST);
        ActionListener escuchadorRosa = new EscuchadorBoton(Color.pink);
        rosa.addActionListener(escuchadorRosa);

        add(panel);
        panel.setBackground(Color.red);
    }
}
