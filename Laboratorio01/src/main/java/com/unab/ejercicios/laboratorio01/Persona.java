package com.unab.ejercicios.laboratorio01;

public class Persona {

    private String Nombre;
    private int Edad;
    private String Sexo;
    private double Peso;
    private double Altura;

    public Persona() {

    }

    public Persona(String Nombre, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public Persona(String Nombre, int Edad, String Sexo, double Peso, double Altura) {

        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String esMayorDeEdad() {
        int edad = this.Edad;
        if (edad < 18) {
            return "¡Eres menor de edad!";
        } else {
            return "¡Eres mayor de edad!";
        }

    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public String InfoObj1() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ","
                + " Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }

    public String InfoObj2() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + '}';
    }

    public String InfoObj3() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }

}
