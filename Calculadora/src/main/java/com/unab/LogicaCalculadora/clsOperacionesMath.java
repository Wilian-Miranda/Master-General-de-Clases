package com.unab.LogicaCalculadora;

public class clsOperacionesMath {

    private String Dato1;
    private String Accion;
    private String Dato2;

    public clsOperacionesMath(String Dato1, String Dato2) {
        this.Dato1 = Dato1;
        this.Dato2 = Dato2;
    }

    public clsOperacionesMath() {
    }

    public String calcular(String Dato1, String Accion, String Dato2) {
        double Result = 0;
        String Respuesta;
        if (Accion == "sumar") {
            Result = Double.parseDouble(Dato1) + Double.parseDouble(Dato2);
            
        }
        if (Accion == "restar") {
            Result = Double.parseDouble(Dato1) - Double.parseDouble(Dato2);
            
        }
        if (Accion == "dividir") {
            Result = Double.parseDouble(Dato1) / Double.parseDouble(Dato2);
            
        }
        if (Accion == "multiplicar") {
            Result = Double.parseDouble(Dato1) * Double.parseDouble(Dato2);
            
        }
        if (Accion == "residuo") {
            Result = Double.parseDouble(Dato1) % Double.parseDouble(Dato2);
            
        }
        Respuesta = Double.toString(Result);
        return Respuesta;

    }

}
