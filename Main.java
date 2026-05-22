/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuinteractivo;
import java.util.Scanner;
/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaSimple listaSimple = new ListaSimple();
        ListaDoble listaDoble = new ListaDoble();
        ListaCircularSimple listaCircularSimple = new ListaCircularSimple();
        ListaCircularDoble listaCircularDoble = new ListaCircularDoble();
        int opcionPrincipal;
        int opcion;
        do {
            System.out.println("\n===== ESTRUCTURAS DINAMICAS =====");
            System.out.println("1. Lista Simple");
            System.out.println("2. Lista Doble");
            System.out.println("3. Lista Circular Simple");
            System.out.println("4. Lista Circular Doble");
            System.out.println("5. Salir");
            System.out.print("Seleccione: ");
            opcionPrincipal = sc.nextInt();
            switch (opcionPrincipal) {
                // ================= LISTA SIMPLE =================
                case 1:
                    do {
                        System.out.println("\n--- LISTA SIMPLE ---");
                        System.out.println("1. Insertar");
                        System.out.println("2. Mostrar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Volver");
                        System.out.print("Seleccione: ");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.print("Ingrese dato: ");
                                int dato = sc.nextInt();
                                listaSimple.insertar(dato);
                                break;
                            case 2:
                                listaSimple.mostrar();
                                break;
                            case 3:
                                System.out.print("Dato a eliminar: ");
                                dato = sc.nextInt();
                                listaSimple.eliminar(dato);
                                break;
                        }
                    } while (opcion != 4);
                    break;
                // ================= LISTA DOBLE =================
                case 2:
                    do {
                        System.out.println("\n--- LISTA DOBLE ---");
                        System.out.println("1. Insertar");
                        System.out.println("2. Mostrar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Volver");
                        System.out.print("Seleccione: ");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.print("Ingrese dato: ");
                                int dato = sc.nextInt();
                                listaDoble.insertar(dato);
                                break;
                            case 2:
                                listaDoble.mostrar();
                                break;
                            case 3:
                                System.out.print("Dato a eliminar: ");
                                dato = sc.nextInt();
                                listaDoble.eliminar(dato);
                                break;
                        }
                    } while (opcion != 4);
                    break;
                // ================= LISTA CIRCULAR SIMPLE =================
                case 3:
                    do {
                        System.out.println("\n--- LISTA CIRCULAR SIMPLE ---");
                        System.out.println("1. Insertar");
                        System.out.println("2. Mostrar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Volver");
                        System.out.print("Seleccione: ");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.print("Ingrese dato: ");
                                int dato = sc.nextInt();
                                listaCircularSimple.insertar(dato);
                                break;
                            case 2:
                                listaCircularSimple.mostrar();
                                break;
                            case 3:
                                System.out.print("Dato a eliminar: ");
                                dato = sc.nextInt();
                                listaCircularSimple.eliminar(dato);
                                break;
                        }
                    } while (opcion != 4);
                    break;
                // ================= LISTA CIRCULAR DOBLE =================
                case 4:
                    do {
                        System.out.println("\n--- LISTA CIRCULAR DOBLE ---");
                        System.out.println("1. Insertar");
                        System.out.println("2. Mostrar");
                        System.out.println("3. Eliminar");
                        System.out.println("4. Volver");
                        System.out.print("Seleccione: ");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.print("Ingrese dato: ");
                                int dato = sc.nextInt();
                                listaCircularDoble.insertar(dato);
                                break;
                            case 2:
                                listaCircularDoble.mostrar();
                                break;
                            case 3:
                                System.out.print("Dato a eliminar: ");
                                dato = sc.nextInt();
                                listaCircularDoble.eliminar(dato);
                                break;
                        }
                    } while (opcion != 4);
                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcionPrincipal != 5);
    }
}