package ListaEnlazada;

/* Clase genérica que representa un nodo de una estructura de datos enlazada.
 * La <T> indica que puede almacenar cualquier tipo de objeto (Integer, String, etc.)
 */

public class Nodo<T> {

    private T dato;           // El valor o información que guarda el nodo
    private Nodo<T> siguiente; // La referencia al siguiente nodo en la lista

    /**
     * Constructor del nodo.
     * Por defecto, cuando creamos un nodo nuevo, no está enlazado a nada (siguiente es null).
     * * @param dato El valor que queremos guardar en este nodo.
     */
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null; // Al nacer, el nodo no apunta a nadie
    }

    // --- Getters y Setters ---
    // Son necesarios porque los atributos son privados (encapsulamiento, ¡buena práctica!)

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}


