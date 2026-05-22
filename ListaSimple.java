/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuinteractivo;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class ListaSimple {
    NodoSimple cabeza;
    public void insertar(int dato) {
        NodoSimple nuevo = new NodoSimple(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoSimple aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }
    public void mostrar() {
        NodoSimple aux = cabeza;
        System.out.println("Lista Simple:");
        while (aux != null) {
            System.out.print(aux.dato + " -> ");
            aux = aux.siguiente;
        }
        System.out.println("NULL");
    }
    public void eliminar(int dato) {

        if (cabeza == null) {
            return;
        }
        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return;
        }
        NodoSimple aux = cabeza;

        while (aux.siguiente != null && aux.siguiente.dato != dato) {
            aux = aux.siguiente;
        }
        if (aux.siguiente != null) {
            aux.siguiente = aux.siguiente.siguiente;
        }
    }
}