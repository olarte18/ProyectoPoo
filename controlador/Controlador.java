package controlador;

import vista.DialogoLaboratorio;
import vista.VentanaPrincipal;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Laboratorio;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private Laboratorio lab;
    

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Laboratorio pLab)
    {
        this.venPrin = pVenPrin;
        this.lab=pLab;
        
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
  
   if(comando.equals("ver")){
    int indx1=venPrin.miPanelDatos.getLaboratorioid();
    int indx2=venPrin.miPanelDatos.getFuncionid();

    switch(indx1)
    {case 0:
        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
        break;
    case 1:
        switch(indx2)
        {case 0:
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
            break;
        case 1:

            venPrin.crearDialogoLaboratorio();
            break;
        case 2:
  

            venPrin.crearDialogoLaboratorio();

            break;
        case 3:
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
            venPrin.crearDialogoLaboratorio();
            break;
        case 2:
            venPrin.crearDialogoLaboratorio();
            break;
        case 3:
            venPrin.crearDialogoLaboratorio();
            break;
        }
    case 3:
    switch(indx2)
    {case 0:
        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
        break;
    case 1:
        venPrin.crearDialogoLaboratorio();
        break;
    case 2:
        venPrin.crearDialogoLaboratorio();
        break;
    case 3:
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
        venPrin.crearDialogoLaboratorio();
        break;
    case 2:
        venPrin.crearDialogoLaboratorio();
        break;
    case 3:
        venPrin.crearDialogoLaboratorio();

    }
    case 5:
    switch(indx2)
    {case 0:
        JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento" );
        break;
    case 1:
        venPrin.crearDialogoLaboratorio();
        break;
    case 2:
    ImageIcon icono =new ImageIcon("imgs/base.jpeg");
    ImageIcon icono1 =new ImageIcon("imgs/pesos.jpeg");

        venPrin.crearDialogoLaboratorio();
        venPrin.miDialogoLaboratorio.setIcono(icono);
        venPrin.miDialogoLaboratorio.setIcono1(icono1);
        break;

    case 3:
        venPrin.crearDialogoLaboratorio();

    }
    

   }



        //Salir
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(venPrin,"Has salido de la aplicacion");
            System.exit(0);
        }  
    }


}
}
