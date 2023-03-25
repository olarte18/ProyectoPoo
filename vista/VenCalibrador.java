package vista;

import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class VenCalibrador extends JDialog
 {
    //
    private JLabel lbTitulo;

    public VenCalibrador()
    {
        setLayout(null);
        setTitle("Carro");
        setSize(500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        //titulo
        lbTitulo = new JLabel("Mover Carro",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(10,10,280,20);
        add(lbTitulo);
    }
    
}
