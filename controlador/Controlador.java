package controlador;

// se importan las clases necesarias

import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Laboratorio;

//clase Controlador

public class Controlador implements ActionListener
{

    //Atributos
    
    private VentanaPrincipal venPrin;
    private Laboratorio lab;

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Laboratorio pLab)
    {
        this.venPrin = pVenPrin;
        this.lab=pLab;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miDialogoLaboratorio.agregarOyentesBotones1(this);
    }
    //sobreescritura del metodo actionPerformed
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

    //se evalua el comando    

   if(comando.equals("ver")){

        //se obtienen los indices de los combobox

        int indx1=venPrin.miPanelDatos.getLaboratorioid();
        int indx2=venPrin.miPanelDatos.getFuncionid();

        //se evaluan los indices

        switch(indx1)
            {case 0:
                //se muestra un mensaje de error
                JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                break;
            //se evalua el segundo indice
            case 1:
                switch(indx2)
                    {case 0:
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                        break;
                    case 1:
                        //se crea un icono
                        ImageIcon icono2 =new ImageIcon("imgs/Mesadefuerzas.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:
                        venPrin.crearDialogoLaboratorio();
                        break;
            }
                break;
            case 2:
                switch(indx2)
                    {case 0:
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                        break;
                    case 1:
                        ImageIcon icono2 =new ImageIcon("imgs/i182.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:
                        venPrin.crearDialogoLaboratorio();
                        break;
            }
                break;
            case 3:
                switch(indx2)
                    {case 0:
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                        break;
                    case 1:
                        ImageIcon icono2 =new ImageIcon("");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:
                        venPrin.crearDialogoLaboratorio();
                        break;
                    }
                break;
            case 4:
                switch(indx2)
                    {case 0:
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                        break;
                    case 1:
                        ImageIcon icono2 =new ImageIcon("imgs/i20.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:
                        venPrin.crearDialogoLaboratorio();
                        break;
                    }
                break;
            case 5:
                switch(indx2)
                    {case 0:
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                        break;
                    case 1:
                        ImageIcon icono2 =new ImageIcon("imgs/i22.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:

                        break;
             }   
                break;}
             
    }
 else if (comando.equals("salir")) {
    System.exit(0);

}
}
}
