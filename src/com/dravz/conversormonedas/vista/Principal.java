package com.dravz.conversormonedas.vista;

import com.dravz.conversormonedas.controlador.Conversor;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        Conversor conversor = new Conversor();

        double cantidadConvertir = 0;

        System.out.println(" BIENVENIDO AL CONVERSOR DE MONEDAS ");

        while (option != 7){
            System.out.print("""
                    ***************************************************************
                    ------------------------------Menu-----------------------------
                    1) Peso argentino > Dolar estadounidense
                    2) Dolar estadounidense > Peso argentino
                    3) Peso chileno > Dolar estadounidense
                    4) Dolar estadounidense > Peso chileno
                    5) Peso colombiano > Dolar estadounidense
                    6) Dolar estadounidense > Peso colombiano
                    7) Salir
                    ***************************************************************
                    Seleccione una opcion: 
                    """);

            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Ingrese la cantidad en pesos argentinos: ");
                    cantidadConvertir = sc.nextDouble();
                    System.out.printf("%.2f ARS = %.2f USD%n",
                            cantidadConvertir,conversor.convertir("ARS", "USD", cantidadConvertir));
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad en dolares estadounidense: ");
                    cantidadConvertir = sc.nextDouble();
                    System.out.printf("%.2f USD = %.2f ARS%n",
                            cantidadConvertir,conversor.convertir("USD", "ARS", cantidadConvertir));
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad en pesos chilenos: ");
                    cantidadConvertir = sc.nextDouble();
                    System.out.printf("%.2f CLP = %.2f USD%n",
                            cantidadConvertir,conversor.convertir("CLP", "USD", cantidadConvertir));
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad en dolares estadounidenses: ");
                    cantidadConvertir = sc.nextDouble();
                    System.out.printf("%.2f USD = %.2f CLP%n",
                            cantidadConvertir,conversor.convertir("USD", "CLP", cantidadConvertir));
                    break;
                case 5:
                    System.out.print("Ingrese la cantidad en pesos colombianos: ");
                    cantidadConvertir = sc.nextDouble();
                    System.out.printf("%.2f COP = %.2f USD%n",
                            cantidadConvertir,conversor.convertir("COP", "USD", cantidadConvertir));
                    break;
                case 6:
                    System.out.print("Ingrese la cantidad en dolares estadounidense: ");
                    cantidadConvertir = sc.nextDouble();
                    System.out.printf("%.2f USD = %.2f COP%n",
                            cantidadConvertir,conversor.convertir("USD", "COP", cantidadConvertir));
                    break;
                case 7:
                    System.out.println("Gracias por usar nuestro sistema, hasta la proxima!");
                    break;
                default:
                    System.out.println("ERROR: Opcion invalida.");
                    break;
            }
        }
    }
}