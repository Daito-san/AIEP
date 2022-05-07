/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author luxo_
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        int seleccion_de_operacion = 0;
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        float a = 0,b = 0,c = 0;
        float X0,X1;
        
        do { 
            
            System.out.println("\n");
            System.out.println("SELECCIONES UN NUMERO DE OPERACION A REALIZAR: ");
            System.out.println("1. SUMA:");
            System.out.println("2. RESTA:");
            System.out.println("3. MULTIPLICAR:");
            System.out.println("4. DIVIDIR:");
            System.out.println("5. ECUACION DE SEGUNDO GRADO:");
            System.out.println("6. SALIR:");
            seleccion_de_operacion = leer.nextInt();
            
            
            if(seleccion_de_operacion <5){
                System.out.print("Inserte el primer numero: ");
                numero1 = leer.nextDouble();
                System.out.print("Inserte el segundo numero: ");
                numero2 = leer.nextDouble();              
            }else{
                if (seleccion_de_operacion ==5) {
                     System.out.print("valor a: ");
                     a = leer.nextFloat();
                     System.out.print("valor b: ");
                     b = leer.nextFloat();
                     System.out.print("valor c: ");
                     c = leer.nextFloat();                    
                }
                
            }
            
            switch(seleccion_de_operacion){
                case 1 -> {
                    seleccion_de_operacion = 1;
                    resultado = numero1 + numero2;
                    System.out.println("El resultado de la suma es: " + resultado);
                }
                    
                case 2 -> {
                    seleccion_de_operacion = 2;
                    resultado = numero1 - numero2;
                    System.out.println("El resultado de la resta es: " + resultado);
                }
                    
                case 3 -> {
                    seleccion_de_operacion = 3;
                    resultado = numero1 * numero2;
                    System.out.println("El resultado de la multiplicacion es: " + resultado);
                }
                
                case 4 -> {
                    seleccion_de_operacion = 4;
                    resultado = numero1 / numero2;
                    System.out.println("El resultado de la division es: " + resultado);
                }
                    
                case 5 -> {
                    seleccion_de_operacion = 5;
                    float numero = (b*b) - (4*a*c);
                    if(numero > 0) {
                        X0 = (float) ((-b + Math.sqrt(numero)) / 2*a);
                        X1 = (float) ((-b - Math.sqrt(numero)) / 2*a);
                        System.out.println("La ecuacion tiene  dos soluciones");
                        System.out.println("X0: " +X0);
                        System.out.println("X1: " +X1);
                    }else {
                        if(numero == 0) {
                           X0 = (float) (-b) / 2*a;
                           System.out.println("La ecuacion tiene una solucion");
                           System.out.println("XO: " +X0);                           
                        }else{
                            System.out.println("La ecuacion no tiene solucion");
                            
                        }
                    }
                }
                    
                    
            } 
            
        } while (seleccion_de_operacion != 6);
        System.out.println("Salio de la calculadora");
                
    }
}
