package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner (System.in);

        System.out.println("Longitud de la circunferencia: L= 2*PI*r");
        System.out.println("Introduce el valor del radio");
        double radio = escaner.nextDouble();

        // Aqui calculo la longitud

        double resultado = 2*Math.PI*radio;

        System.out.println("La longitud de la circunferencia es " + resultado);




    }


}

