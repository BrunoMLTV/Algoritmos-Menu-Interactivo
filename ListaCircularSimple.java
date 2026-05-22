/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuinteractivo;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
class ListaCircularSimple {
    NodoSimple cabeza;
    public void insertar(int dato) {
        NodoSimple nuevo = new NodoSimple(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            nuevo.siguiente = cabeza;
        } else {
            NodoSimple aux = cabeza;
            while (aux.siguiente != cabeza) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacia");
            return;
        }
        NodoSimple aux = cabeza;
        System.out.println("Lista Circular Simple:");
        do {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        } while (aux != cabeza);

        System.out.println("(vuelve al inicio)");
    }
    public void eliminar(int dato) {
        if (cabeza == null) {
            return;
        }
        NodoSimple actual = cabeza;
        NodoSimple anterior = null;
        // eliminar cabeza
        if (cabeza.dato == dato) {
            // solo un nodo
            if (cabeza.siguiente == cabeza) {
                cabeza = null;
                return;
            }
            NodoSimple ultimo = cabeza;
            while (ultimo.siguiente != cabeza) {
                ultimo = ultimo.siguiente;
            }
            cabeza = cabeza.siguiente;
            ultimo.siguiente = cabeza;
            return;
        }
        do {
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza && actual.dato != dato);

        if (actual.dato == dato) {
            anterior.siguiente = actual.siguiente;
        }
    }
}