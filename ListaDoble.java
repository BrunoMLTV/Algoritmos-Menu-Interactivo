/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuinteractivo;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ListaDoble {
    NodoDoble cabeza;
    public void insertar(int dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoDoble aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            nuevo.anterior = aux;
        }
    }
    public void mostrar() {
        NodoDoble aux = cabeza;
        System.out.println("Lista Doble:");
        while (aux != null) {
            System.out.print(aux.dato + " <-> ");
            aux = aux.siguiente;
        }
        System.out.println("NULL");
    }
    public void eliminar(int dato) {
        if (cabeza == null) {
            return;
        }
        NodoDoble aux = cabeza;
        while (aux != null && aux.dato != dato) {
            aux = aux.siguiente;
        }
        if (aux == null) {
            return;
        }
        if (aux == cabeza) {
            cabeza = cabeza.siguiente;

            if (cabeza != null) {
                cabeza.anterior = null;
            }
        } else {

            if (aux.siguiente != null) {
                aux.siguiente.anterior = aux.anterior;
            }
            aux.anterior.siguiente = aux.siguiente;
        }
    }
}