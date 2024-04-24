

package com.mycompany.jmdrc_edadparavotar;

import java.util.Scanner;


public class JMDRC_EdadParaVotar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Ingresa la edad");
        edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Si puede votar");
        } else {
            System.out.println("No puede votar");

        }

    }
}