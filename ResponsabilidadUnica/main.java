package ResponsabilidadUnica;

public class main {

    public static void main(String[] args) {

/*
    Aplicando el principio de responsabilidad unica y cohesión
      - Indica que se sedebe de destinar un solo tipo de responsabilidad a cada clase.
*/
        Rectangulo rectangulo = new Rectangulo(10,20);
        Presentacion presentacion = new Presentacion();
        presentacion.imprimir(rectangulo);

    }
}
