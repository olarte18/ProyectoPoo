package controlador;

import vista.VentanaPrincipal;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Laboratorio;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
   
    
    

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin)
    {
        this.venPrin = pVenPrin;
    
        
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar vendedor
  
   if(comando.equals("lab")){
    String laboratorio=venPrin.miPanelDatos.getLaboratorio();
    Laboratorio lab = new Laboratorio(laboratorio);
    lab.calcularCombox();

   }



        //Salir
        if(comando.equals("salir"))
        {
            JOptionPane.showMessageDialog(venPrin,"Has salido de la aplicacion");
            System.exit(0);
        }  
    }


}

