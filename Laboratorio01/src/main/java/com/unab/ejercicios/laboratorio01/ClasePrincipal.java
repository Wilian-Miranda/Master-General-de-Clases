
package com.unab.ejercicios.laboratorio01;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        
        //pidiendoque se ingresen datos por teclado
        Scanner Lectura = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String Nombre = Lectura.nextLine();
        System.out.println();
        System.out.println("Ingrese su edad:");
        int Edad = Lectura.nextInt();
        System.out.println();
        System.out.println("Ingrese su sexo:");
        String Sexo = Lectura.next();
        System.out.println();
        System.out.println("Ingrese su peso:");
        double Peso = Lectura.nextDouble();
        System.out.println();
        System.out.println("Ingrese su altura:");
        double Altura = Lectura.nextDouble();
        System.out.println();
        
        /*primer instancia de la clase persona
        pasando los parametros de forma directa al constructor*/
        System.out.println("PRIMER OBJETO:");
        Persona Obj1 = new Persona(Nombre, Edad, Sexo, Peso, Altura);
        System.out.println(Obj1.InfoObj1());//mostrando datos de los atributos
        System.out.println(Obj1.esMayorDeEdad() + "\n");

        /*Segunda instancia de la clase persona
        pasando los parametros atraves de un .get() al constructor*/
        System.out.println("SEGUNDO OBJETO:");
        Persona Obj2 = new Persona(Obj1.getNombre(), Obj1.getEdad(),
                Obj1.getSexo());
        System.out.println(Obj2.InfoObj2());//mostrando datos de los atributos
        System.out.println(Obj2.esMayorDeEdad() + "\n");

        /*Tercera instancia de la clase persona
        pasando los parametros atraves de un .set() al constructor*/
        System.out.println("TERCER OBJETO:");
        Persona Obj3 = new Persona();
        Obj3.setNombre(Nombre);
        Obj3.setEdad(Edad);
        Obj3.setSexo(Sexo);
        Obj3.setPeso(Peso);
        Obj3.setAltura(Altura);
        System.out.println(Obj3.InfoObj3());//mostrando datos de los atributos
        System.out.println(Obj3.esMayorDeEdad());
   
    }
    
}
