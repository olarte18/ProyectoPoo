package vista;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelObjetos extends JPanel
 {
    public JButton btcalib;
    public PanelObjetos()
    {
        //texto
        btcalib= new JButton("Calibrador");
        btcalib.setBounds(30,150,105,25);
        btcalib.setActionCommand("Calibrador");
        this.add(btcalib);
        //color
        this.setLayout(null);
        Color colorRosa=new Color(253, 249, 202);
        this.setBackground(colorRosa);
    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btcalib.addActionListener(pAL);

    }
}
