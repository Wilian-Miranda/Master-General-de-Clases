package com.unab.Promedio;

import com.unab.Dominio.Datos;

public class ClsPromedio {

    public String periodo(Datos data) {
        Double resultado = 0.0;
        String result = "";

        double lab = Double.parseDouble(data.getLaboratorio());
        double par = Double.parseDouble(data.getParcial());

        if ((lab >= 0 && lab <= 10) && (par >= 0 && par <= 10)) {
            resultado = (Double.parseDouble(data.getLaboratorio()) * 0.40)
                    + (Double.parseDouble(data.getParcial()) * 0.60);
            result = String.format("%.2f", resultado);
        } else {
            result = "Datos no válidos";
        }

        return result;
    }

    public String aprobarCiclo(String dato1, String dato2, String dato3) {
        double result = 0.0;
        String nota = "";
        String resultado = "";
        String resultadoFinal = "";

        try {
            result = (Double.parseDouble(dato1) + Double.parseDouble(dato2)
                    + Double.parseDouble(dato3)) / 3;

            nota = String.format("%.2f", result);

            if ((result >= 7) && (result <= 10)) {
                resultadoFinal = "APROVADA";

            } else {
                if ((result >= 0) && (result < 7)) {
                    resultadoFinal = "REPROVADA";
                }

            }
            resultado = " Materia " + resultadoFinal + ", nota: " + nota;

        } catch (Exception e) {
            resultado = "¡Solo son válidos números del 1 al 10!";
        }

        return resultado;
    }

}
