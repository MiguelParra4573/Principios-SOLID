package SegregacionDeInterfaces;

public class Jaguar extends Animal implements IFelino {

    private int edad;
    private float peso;

    public Jaguar() {
        this.setEdad(0);
        this.setPeso(0.0f);
    }
    public Jaguar(int edad) {
        this.setEdad(edad);
        this.setPeso(0.0f);
    }
    public Jaguar(float peso) {
        this.setEdad(0);
        this.setPeso(peso);
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Jaguar{" + "edad=" + edad + ", peso=" + peso + '}';
    }
    public void dormir(){
        System.out.println("Duermiendo");
    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public void rugir(){
        System.out.println("Rugiendo");
    }
    public void cazar(){
        System.out.println("Cazando");
    }



}
