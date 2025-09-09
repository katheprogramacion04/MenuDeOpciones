package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Programa para crear un ciclo
        // Y crear un menu de opciones
        Integer opcionSeleccionada=0;
        while(opcionSeleccionada != 5){
            System.out.println("Menu de opciones");
            System.out.println("************");
            System.out.println("➕Digita 1 para sumar");
            System.out.println(" ➖ Digita 2 para restar");
            System.out.println(" ❌Digita 3 para multiplicar");
            System.out.println(" ➗ Digita 4 para dividir");
            System.out.println(" ✔ Digita 5 para SALIR DEL PROGRAMA");
            Scanner LeerTeclado= new Scanner(System.in);
            System.out.println("Seleccione una opcion por favor:  💜");
            opcionSeleccionada=LeerTeclado.nextInt();

            //Evaluando caminos segun la opcion del usuario:
            if (opcionSeleccionada==1){
                System.out.println("SUMANDO...");
            }else if (opcionSeleccionada==2){
                System.out.println("RESTANDO...");
            } else if (opcionSeleccionada==3) {
                System.out.println("MULTIPLICANDO...");

            } else if (opcionSeleccionada==4) {
                System.out.println("DIVIDIENDO...");

            }


        }


    }
}