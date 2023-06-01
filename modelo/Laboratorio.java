package modelo;

import vista.VentanaPrincipal;

public class Laboratorio {

private String laboratorio;
private String funcion;


public Laboratorio(String pLaboratorio, String pFuncion){
    laboratorio=pLaboratorio;
    funcion=pFuncion;
}
public Laboratorio()
{}

public String getFuncion() {
    return funcion;
}

public void setFuncion(String funcion) {
    this.funcion = funcion;
}

public String getLaboratorio() {
    return laboratorio;
}

public void setLaboratorio(String laboratorio) {
    this.laboratorio = laboratorio;
}  
}
