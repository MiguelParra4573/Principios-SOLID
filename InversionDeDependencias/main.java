package InversionDeDependencias;

public class main {
    public static void main(String[] args) {
        /*
         *  Aplicando el principio de inversion de dependencias
         *      - Las entidades deven de depender de abstrapciones y no de concreciones
         *      - y que un modulo de alto nivel no debe de depender de un modulo de bajo nivel,
         *      - sino de abastaciiones.
         *  */

        Teclado teclado = new Teclado();
        Mause mouse = new Mause();


        Computadora computadora = new Computadora(teclado,mouse);
        computadora.encender();



    }
}
