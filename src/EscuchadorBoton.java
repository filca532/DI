import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscuchadorBoton implements ActionListener {
    private Color color;

    public EscuchadorBoton(Color color) {
        this.color = color;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Frame.panel.setBackground(color);
    }
}
