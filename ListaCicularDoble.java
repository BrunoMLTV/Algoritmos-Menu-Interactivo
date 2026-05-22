/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuinteractivo;

/**
 *
 * @author LAB-USR-AREQUIPA
 */

class ListaCircularDoble {
    NodoDoble cabeza;
    public void insertar(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            
            NodoDoble ultimo = cabeza.anterior;
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("Lista vacia");
            return;
        }
        NodoDoble aux = cabeza;
        System.out.println("Lista Circular Doble:");
        do {
            System.out.print(aux.dato + " <-> ");
            aux = aux.siguiente;
        } while (aux != cabeza);
        System.out.println("(vuelve al inicio)");
    }
    public void eliminar(int dato) {
        if (cabeza == null) {
            return;
        }
        NodoDoble actual = cabeza;
        do {
            if (actual.dato == dato) {
                // un solo nodo
                if (actual.siguiente == cabeza && actual == cabeza) {
                    cabeza = null;
                    return;
                }
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                }
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}