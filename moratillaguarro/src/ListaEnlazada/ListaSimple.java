package ListaEnlazada;
/**
 * Implementación de un TAD Lista Simplemente Enlazada genérica.
 */
public class ListaSimple<T> {

    private Nodo<T> cabeza; // Apunta al primer elemento de la lista
    private int tamaño;     // Mantiene la cuenta de la cantidad de elementos

    /**
     * Constructor de la lista.
     * Inicialmente, la lista está vacía.
     */
    public ListaSimple() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    /**
     * Comprueba si la lista está vacía.
     *
     * @return true si la lista no tiene elementos, false en caso contrario.
     */
    public boolean estaVacia() {
        return cabeza == null; // Si la cabeza no apunta a ningún nodo, está vacía
    }

    /**
     * Devuelve el número de elementos actuales en la lista.
     *
     * @return El tamaño de la lista.
     */
    public int getTamaño() {
        return tamaño;

    }

    /**
     * Inserta un nuevo elemento al principio de la lista.
     *
     * @param dato El valor que queremos añadir.
     */
    public void insertarAlPrincipio(T dato) {
        // Paso 1: Creamos el nuevo nodo con el dato
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        // Paso 2: El "siguiente" del nuevo nodo apunta a la cabeza actual.
        // (Nota: Si la lista estaba vacía, cabeza es null, así que el nuevo nodo apuntará a null. ¡Eso es correcto!)
        nuevoNodo.setSiguiente(cabeza);

        // Paso 3: La cabeza de la lista pasa a ser este nuevo nodo
        cabeza = nuevoNodo;

        // Paso 4: Aumentamos el contador de elementos
        tamaño++;
    }

    /**
     * Inserta un nuevo elemento al final de la lista.
     *
     * @param dato El valor que queremos añadir.
     */
    public void insertarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);

        // Caso especial: ¿Y si la lista está vacía?
        if (estaVacia()) {
            // Si está vacía, el nuevo nodo es directamente la cabeza
            cabeza = nuevoNodo;
        } else {
            // Si no está vacía, necesitamos recorrerla hasta el final.
            // Creamos un apuntador temporal para no modificar la 'cabeza' original.
            Nodo<T> actual = cabeza;

            // Caminamos nodo a nodo MIENTRAS haya un nodo siguiente
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente(); // Avanzamos al siguiente vagón  marquet prime null no 0
            }

            // Al salir del bucle while, 'actual' es el ÚLTIMO nodo de la lista.
            // Ahora simplemente enganchamos nuestro nuevo nodo al final.
            actual.setSiguiente(nuevoNodo);
        }

        // Finalmente, incrementamos el tamaño de la lista
        tamaño++;
    }

    public void imprimirLista() {
        Nodo<T> actual = cabeza;
        System.out.print("[");
        while (actual != null) {
            System.out.print(actual.getDato() + ",");
            actual = actual.getSiguiente();
        }
        System.out.println("]");
    }

    public void borrarAlPrincipio() {
        if (cabeza != null) {
            cabeza = cabeza.getSiguiente();
            tamaño--;
        }
    }

    /**
     * Elimina el último elemento de la lista.
     */
    public void borrarAlFinal() {
        // Caso 1: Si la lista está vacía, el escudo nos protege.
        if (estaVacia()) {
            System.out.println("La lista ya está vacía, no hay nada que borrar.");
        }
        // Caso 2: Si la lista tiene un único elemento.
        else if (cabeza.getSiguiente() == null) {
            cabeza = null; // Al quitar el único que hay, la cabeza pasa a ser null
            tamaño--;
        }
        else{
        // Caso 3: Si la lista tiene 2 o más elementos.
        // Creamos nuestro apuntador para caminar hasta el PENÚLTIMO nodo.
        Nodo<T> actual = cabeza;

        // El truco de la doble mirada: caminamos mientras exista un "siguiente del siguiente".
        // Así nos aseguramos de frenar exactamente un vagón antes del final.
        while (actual.getSiguiente().getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        // Al salir del bucle, 'actual' es el penúltimo nodo.
        // Le decimos que suelte al último poniendo su enganche a null.
        actual.setSiguiente(null);

        // No nos olvidamos de actualizar el contador total
        tamaño--;
        }
    }
    public void vaciarLista(){
       if (cabeza!= null){
        cabeza=null;
        tamaño =0;
       }
    }
    public void buscarEnLista(T dato) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.getDato() == dato){
                System.out.println("True");
                return;
            }
            actual = actual.getSiguiente();
        }
        System.out.println("False");
        }
    }





