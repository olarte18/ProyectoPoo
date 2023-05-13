package modelo;

public class Laboratorio {

private String laboratorio;

public String getLaboratorio() {
    return laboratorio;
}

public void setLaboratorio(String laboratorio) {
    this.laboratorio = laboratorio;
} 

public Laboratorio(String pLaboratorio){
    laboratorio=pLaboratorio;
}

public void calcularCombox(){
    if(getLaboratorio()=="i18(1/2) (medicion de objetos)"){
        System.out.println("Hola");
    }
}
    
}
