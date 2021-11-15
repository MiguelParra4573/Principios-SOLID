package SegregacionDeInterfaces;

public class main {
/*
* Aplicacion del principio de segregacion de interfaces
*   - Indica que los clientes noo deben ser forrzados a depender de metodos que no usen
*   - Eso significa que se debe seguir abstrayendo cada metodo de cada cliente que no usa en una nueva interfaces
 */
    public static void main(String[] args) {
        IFelino jaguar = new Jaguar();
        jaguar.cazar();
    }
}
