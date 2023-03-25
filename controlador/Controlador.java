package controlador;
import vista.VentanaPrincipal;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador
{
    private VentanaPrincipal venPrin;
    //constrructor
    public Controlador(VentanaPrincipal pVenPrin)
    {
        this.venPrin=pVenPrin;
        this.venPrin.miPanelObjetos.btStart.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String comando =e.getActionCommand();

    }
    
}
