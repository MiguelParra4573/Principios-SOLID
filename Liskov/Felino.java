package Liskov;

public class Felino {
    private float Altura;
    private float Peso;

    public Felino(float altura, float peso) {
        Altura = altura;
        Peso = peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float altura) {
        Altura = altura;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float peso) {
        Peso = peso;
    }

    public void Maullar(){
        System.out.println("Miauuu!");
    }
    public void cazar(){
        System.out.println("Cazando en proceso...");
    }
}
