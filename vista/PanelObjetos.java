package vista;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelObjetos extends JPanel
 {
    public JButton btcalib;
    public JButton btcinta;
    public JButton btgramera;
    public JButton btmesa;
    public JButton btmicro;
    public JButton btpipeta;
    public JButton btensayo;
    public JButton btprobeta;
    public JButton btprecipitado;
    public ImageIcon iImagen ;
    public JLabel lbImagen ;

    {//calibrador
        iImagen=new ImageIcon(getClass().getResource("/vista/Calibrador.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(20,10,100,100);
        this.add(lbImagen);
        
        btcalib= new JButton("Calibrador");
        btcalib.setBounds(30,120,105,25);
        btcalib.setActionCommand("Calibrador");
        this.add(btcalib);
        //boton
        iImagen=new ImageIcon(getClass().getResource("/vista/Cintametrica.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(185,10,100,100);
        this.add(lbImagen);
        btcinta= new JButton("Cinta Metrica");
        btcinta.setBounds(185,120,120,25);
        btcinta.setActionCommand("Cinta");
        this.add(btcinta); 
        //boton gramera
        iImagen=new ImageIcon(getClass().getResource("/vista/gramera.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(350,10,100,100);
        this.add(lbImagen);
        btgramera= new JButton("Gramera");
        btgramera.setBounds(350,120,105,25);
        btgramera.setActionCommand("gramera");
        this.add(btgramera); 
            //boton mesa
            iImagen=new ImageIcon(getClass().getResource("/vista/mesa.png"));
            lbImagen= new JLabel(iImagen);
            lbImagen.setBounds(30,170,100,100);
            this.add(lbImagen);
        btmesa= new JButton("Mesa de fuerzas");
        btmesa.setBounds(30,280,105,25);
        btmesa.setActionCommand("Fuerzas");
        this.add(btmesa);    
        //boton micro
        iImagen=new ImageIcon(getClass().getResource("/vista/micro.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(185,170,100,100);
        this.add(lbImagen);
        btmicro= new JButton("Microscopio");
        btmicro.setBounds(185,280,105,25);
        btmicro.setActionCommand("Microscopio");
        this.add(btmicro);  
        //boton pipeta
        iImagen=new ImageIcon(getClass().getResource("/vista/pipeta.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(350,170,100,100);
        this.add(lbImagen);
        btpipeta= new JButton("Pipeta");
        btpipeta.setBounds(350,280,105,25);
        btpipeta.setActionCommand("Pipeta");
        this.add(btpipeta);
        //boton tubo
        iImagen=new ImageIcon(getClass().getResource("/vista/tubos.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(30,320,100,100);
        this.add(lbImagen);
        btensayo= new JButton("Tubo de Ensayo");
        btensayo.setBounds(30,430,105,25);
        btensayo.setActionCommand("Tubo de Ensayo");
        this.add(btensayo);
        //boton probeta
        iImagen=new ImageIcon(getClass().getResource("/vista/probeta.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(185,320,100,100);
        this.add(lbImagen);
        btprobeta= new JButton("Probeta");
        btprobeta.setBounds(185,430,105,25);
        btprobeta.setActionCommand("Probeta");
        this.add(btprobeta);
        //boton precipitado
        iImagen=new ImageIcon(getClass().getResource("/vista/Precipitado.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(350,320,100,100);
        this.add(lbImagen);
        btprecipitado= new JButton("Vaso Precipitado");
        btprecipitado.setBounds(350,430,105,25);
        btprecipitado.setActionCommand("Vaso Precipitado");
        this.add(btprecipitado);
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
