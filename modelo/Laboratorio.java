package modelo;

public class Laboratorio {
//atributos
private String laboratorio;
private String funcion;

//Constructor
public Laboratorio(String pLaboratorio, String pFuncion){
    laboratorio=pLaboratorio;
    funcion=pFuncion;
}
//Constructor nulo
public Laboratorio()
{}
//metodos
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
