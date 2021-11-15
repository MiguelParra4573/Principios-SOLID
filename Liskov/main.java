package Liskov;

public class main {
    public static void main(String[] args) {
/*
*   Principio de sustitucion Liskov
*       - Los objetos pueden ser creados por sus clases padres sin problemas
*           pero debe de hacer uso de todos sus metodos, para que se cumpla el principio
*/

    Jaguar jaguar = new Jaguar(10,20);
    Felino jaguar2 = new Jaguar(15,20);

    jaguar.cazar();


    }
}
