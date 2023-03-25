package vista;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class VenCalibrador extends JDialog
 {
    //
    private JLabel lbTitulo;
    private JButton btAceptar;


    public VenCalibrador()
    {
        setLayout(null);

        //titulo
        lbTitulo = new JLabel("Calibrador",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        lbTitulo.setBounds(10,10,280,20);
        this.add(lbTitulo);
        //boton
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar.setBounds(20,140,260,25);
        btAceptar.setActionCommand("aceptar");
        this.add(btAceptar);

        setTitle("Carro");
        setSize(500,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
//

    }
}
