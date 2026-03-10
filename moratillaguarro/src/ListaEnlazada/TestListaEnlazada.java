package ListaEnlazada;

public class TestListaEnlazada {

    /**
     * Clase principal para probar el funcionamiento del TAD Lista Simple.
     */
    public static void main(String[] args) {

        // 1. Creamos la lista instanciándola con el tipo Integer (números enteros)
        System.out.println("--- INICIANDO DEMOSTRACIÓN DE LISTA SIMPLE ---");
        ListaSimple<Integer> miLista = new ListaSimple<>();

        // Comprobamos el estado inicial
        System.out.print("Estado inicial: ");
        miLista.imprimirLista();
        System.out.println("Tamaño actual: " + miLista.getTamaño());
        System.out.println("------------------------------------------------");

        // 2. Probamos las INSERCIONES
        System.out.println("\n>>> Insertando datos...");

        miLista.insertarAlPrincipio(10); // Lista debería ser: [10]
        System.out.println("Insertamos 10 al principio.");

        miLista.insertarAlPrincipio(5);  // Lista debería ser: [5, 10]
        System.out.println("Insertamos 5 al principio.");

        miLista.insertarAlFinal(20);     // Lista debería ser: [5, 10, 20]
        System.out.println("Insertamos 20 al final.");

        miLista.insertarAlFinal(30);     // Lista debería ser: [5, 10, 20, 30]
        System.out.println("Insertamos 30 al final.");

        System.out.print("Lista tras las inserciones: ");
        miLista.imprimirLista();
        System.out.println("Tamaño actual: " + miLista.getTamaño());
        System.out.println("------------------------------------------------");

        // 3. Probamos los BORRADOS
        System.out.println("\n>>> Borrando datos...");

        miLista.borrarAlPrincipio(); // Debería borrar el 5
        System.out.print("Tras borrar al principio: ");
        miLista.imprimirLista();

        miLista.borrarAlFinal();     // Debería borrar el 30
        System.out.print("Tras borrar al final: ");
        miLista.imprimirLista();

        System.out.println("Tamaño final: " + miLista.getTamaño());
        System.out.println("------------------------------------------------");

        // 4. Prueba de resistencia (Borrar hasta vaciar y forzar el error)
        System.out.println("\n>>> Vaciando la lista por completo...");
        miLista.borrarAlFinal(); // Borra el 20
        miLista.borrarAlPrincipio(); // Borra el 10

        System.out.print("Lista vaciada: ");
        miLista.imprimirLista();

        System.out.println("Intentando borrar en una lista vacía (prueba de escudos):");
        miLista.borrarAlFinal(); // CAMBIAR PRINCIPIO POR FINAL. Aquí debería saltar nuestro escudo (el if) y no dar error de Java.  //


       System.out.println("\n>>> Insertando datos...");

        miLista.insertarAlPrincipio(12); // Lista debería ser: [12]
        System.out.println("Insertamos 12 al principio.");

        miLista.insertarAlPrincipio(3);  // Lista debería ser: [3, 12]
        System.out.println("Insertamos 3 al principio.");

        miLista.insertarAlFinal(15);     // Lista debería ser: [3, 12, 15]
        System.out.println("Insertamos 15 al final.");

        miLista.insertarAlFinal(2);     // Lista debería ser: [3, 12, 15, 2]
        System.out.println("Insertamos 2 al final.");

        System.out.print("Lista tras las inserciones: ");
        miLista.imprimirLista();
        System.out.println("Tamaño actual: " + miLista.getTamaño());
        System.out.println("------------------------------------------------");

        //Probar búsqueda
        System.out.println("Buscar dato");
        miLista.buscarEnLista(3);
        miLista.buscarEnLista(4);


        System.out.println("------------------------------------------------");

       //Probar vaciar lista
        System.out.println("Vaciando lista");
        miLista.vaciarLista();
        System.out.println("Lista tras ser vaciada");
        miLista.imprimirLista();

    }
}

