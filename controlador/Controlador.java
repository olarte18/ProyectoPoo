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

    //metodos
    private void mostrarMensajeError(String mensaje) {
    JOptionPane.showMessageDialog(null, mensaje);
    }
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Laboratorio pLab)
    {
        this.venPrin = pVenPrin;
        this.lab=pLab;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
    }
    //sobreescritura del metodo actionPerformed
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

    //se evalua el comando    
    

   if(comando.equals("ver")){

        //se obtienen los indices de los combobox

        int indiceLaboratorio = venPrin.miPanelDatos.getLaboratorioid();
        int indiceFuncion = venPrin.miPanelDatos.getFuncionid();

        if (indiceLaboratorio == 0 || indiceFuncion == 0) {
        mostrarMensajeError("No ha seleccionado ningún elemento");
        return;
        }
        //se evaluan los indices

        switch(indiceLaboratorio)
            {case 0:
                //se muestra un mensaje de error
                break;
            //se evalua el segundo indice
            case 1:
                switch(indiceFuncion)
                    {case 0:
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                        break;
                    case 1:
                        //se crea un icono y se le asigna un valor segun su indice
                        ImageIcon icono2 =new ImageIcon("imgs/Mesadefuerzas.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:
                        //se crea un icono y se le asigna un valor segun su indice
                        ImageIcon icono =new ImageIcon("imgs/materialesi2.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono);
                        break;
            }
                break;
            case 2:
                switch(indiceFuncion)
                    {case 0:
                        //se muestra un mensaje de error
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                        break;
                    case 1:
                        //se crea un icono y se le asigna un valor segun su indice
                        ImageIcon icono2 =new ImageIcon("imgs/i182.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:
                        //se crea un icono y se le asigna un valor segun su indice
                        ImageIcon icono =new ImageIcon("imgs/i18°2 Materiales.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono);
                        break;
            }
                break;
            case 3:
                switch(indiceFuncion)
                    {case 0:
                        //se muestra un mensaje de error
                        break;
                    case 1:
                        ImageIcon icono2 =new ImageIcon("img/i19.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:
                        ImageIcon icono =new ImageIcon("imgs/materialesi19 (2).png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono);
                        break;
                    }
                break;
            case 4:
                switch(indiceFuncion)
                    {case 0:
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                        break;
                    case 1:
                        ImageIcon icono2 =new ImageIcon("imgs/i20.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:
                        ImageIcon icono =new ImageIcon("imgs/materialesi20.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono);
                        break;
                    }
                break;
            case 5:
                switch(indiceFuncion)
                    {case 0:
                        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
                        break;
                    case 1:
                        ImageIcon icono2 =new ImageIcon("imgs/i22.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono2);
                        break;
                    case 2:
                        ImageIcon icono =new ImageIcon("imgs/materialesi22.png");
                        venPrin.crearDialogoLaboratorio();
                        venPrin.miDialogoLaboratorio.setIcono2(icono);
                        break;
             }   
                break;}
             
    }
    
 else if (comando.equals("salir")) {
    System.exit(0);

}

}
}
