package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        persona p1= new persona("NOMBRE", "123DNI");

        Scanner scanner = new Scanner(System.in);

        System.out.println("+------------Menú------------+");
        System.out.println("+ 1------Paso Frontera-------+");
        System.out.println("+ 2---Mostrar toda la pipol--+");
        System.out.println("+ 3---Búsqueda por nombre----+");
        System.out.println("+ 4---Búsqueda por DNI-------+");
        System.out.println("+ 0-------X SALIR X----------+");
        System.out.println("+----------------------------+");

        do {
            System.out.println("Dame una opción del menú");
            int caso = scanner.nextInt();
            scanner.nextLine();
            switch (caso) {
                case 1:
                    System.out.println("dame el nombre de la persona:");
                    String nombre = scanner.nextLine();
                    System.out.println("dame el dni de la persona:");
                    String dni = scanner.nextLine();
                    p1.setName(nombre);

                    p1.setDni(dni);
                    System.out.println(p1.getName() + " and " + p1.getDni());
                    break;
                case 2:
                    System.out.println("El nombre del sujeto es: " + p1.getName());
                    System.out.println("y su DNI: " + p1.getDni());
                    break;
                case 3:
                    System.out.println("dame el nombre a comparar");
                    String nombreComp = scanner.nextLine();
                    if (nombreComp.equals(p1.getName())) {
                        System.out.println("el dni de " + p1.getName() + " es " + p1.getDni());
                    } else {
                        System.out.println("404 MATCHES NOT FOUND");
                    }
                    break;
                case 4:
                    System.out.println("dame el DNI a comparar");
                    String dniComp = scanner.nextLine();
                    if (dniComp.equals(p1.getDni())) {
                        System.out.println("el nombre asociado a " + p1.getDni() + " es " + p1.getName());
                    } else {
                        System.out.println("404 MATCHES NOT FOUND");

                    }
                    break;
                case 0:
                    break;

            }
        }while(caso==0);

    }
}
