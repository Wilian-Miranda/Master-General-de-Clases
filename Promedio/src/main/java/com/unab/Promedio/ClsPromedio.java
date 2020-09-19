package com.unab.Promedio;

import com.unab.Dominio.Datos;

public class ClsPromedio {

    //método general para calcular el periodo
    public String periodo(Datos data) {
        Double resultado = 0.0;
        String result = "";

        //Convirtiendo los datos string a decimales
        double laboratorio = Double.parseDouble(data.getLaboratorio());
        double parcial = Double.parseDouble(data.getParcial());

        /*Comparando las cantidades, para solo tomar en cuenta 
        las cantidades que entre 0 y 10
         */
        if ((laboratorio >= 0 && laboratorio <= 10)
                && (parcial >= 0 && parcial <= 10)) {

            resultado = (laboratorio * 0.40)
                    + (parcial * 0.60);
            //Definiendo el limite para la cantidad de decimales
            result = String.format("%.2f", resultado);
        } else {
            //Si los numeros ingresados no estan entre 1 a 10, el resultado es un error
            result = "Datos no válidos";
        }

        return result;
    }

    //metodo para obtener el promedio final y verificar que aprobó el ciclo
    public String aprobarCiclo(String dato1, String dato2, String dato3) {
        double result = 0.0;
        String nota = "";
        String resultado = "";
        String resultadoFinal = "";

        try {
            /*Si los datos contenido en la cajas donde esta el resultado del periodo
            no se pueden convertir a numeros reales el resultado se mandara un mensaje
            con un advirtiendo de un error*/
            result = (Double.parseDouble(dato1) + Double.parseDouble(dato2)
                    + Double.parseDouble(dato3)) / 3;

            //definiendo la cantidad de decimales
            nota = String.format("%.2f", result);

            //Aqui se analiza la nota final para saber si se aprobó o no
            if ((result >= 6) && (result <= 10)) {
                resultadoFinal = "APROVADA";

            } else {
                if ((result >= 0) && (result < 6)) {
                    resultadoFinal = "REPROVADA";
                }

            }
            resultado = " Materia " + resultadoFinal + ", nota: " + nota;

        /*Si hay un error al convertir los datos que se ingresan al metodo se
        mostrara el siguiente advertencia en pantalla*/
        } catch (Exception e) {
            resultado = "¡Información ingresada no válida!";
        }

        return resultado;
    }

}
