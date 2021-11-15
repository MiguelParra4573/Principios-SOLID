package OpenClosed;

public class main {

    public static void main(String[] args) {
/*
    Aplicando el principio open/closed
      - Indica que las clases deben estar abiertas a la extencion pero cerradas a la modificacion de las mismas.
*/
        Triangulo rectangulo = new Triangulo(10,20);

        Triangulo triangulo = new Triangulo(10,20);

        Presentacion presentacion = new Presentacion();

        presentacion.area(rectangulo);
        presentacion.area(triangulo);

    }
}
