/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ra3_pt2._sentenciaifswitch;
import java.util.Scanner;
/**
 * Classe Calculadora.
 * Realitza càlculs de suma, resta, multiplicació i divisió.
 * @author Andrea i Yamila
 */
public class Calculadora {

    public static void main(String[] args) {
        
        //Variable escàner per introduir dades a través del teclat
        Scanner sc = new Scanner(System.in);
        
        double numero1; //Varible de tipus double, per introduir el primer número
        double numero2; //Varible de tipus double, per introduir el segon número
        int operacio; //Varible de tipus int, per introduir el tipus d'operació
        //Varible de tipus double, per introduir el resultat de l'operació
        double resultat;
        
        //Missatge per preguntar pel primer número
        System.out.print("Introdueix el primer valor: ");
        //Ordre perquè, el valor introduit, sigui el valor de numero1
        numero1 = sc.nextDouble();
        
        //Missatge per preguntar pel segon número
        System.out.print("Introdueix el segon valor: ");
        //Ordre perquè, el valor introduit, sigui el valor de numero2
        numero2 = sc.nextDouble();
        
        //Missatge on es pregunta per el tipus d'operació
        System.out.println("Escull una opció: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicació");
        System.out.println("4. Divisió");
        //Ordre perquè, el valor introduit, sigui el valor de operacio
        operacio = sc.nextInt();
        
        //Switch per, segons el tipus d'operació, faci una cosa o altra
        switch (operacio) {
            case 1: //Suma
                resultat = numero1 + numero2;
                System.out.println("El resultat és: " + resultat);
                break; //Per finatlitzar el switch
            case 2: //Resta
                resultat = numero1 - numero2;
                System.out.println("El resultat és: " + resultat);
                break; //Per finatlitzar el switch
            case 3: //Multiplicació
                resultat = numero1 * numero2;
                System.out.println("El resultat és: " + resultat);
                break; //Per finatlitzar el switch
            case 4: //Divisió
                resultat = numero1 / numero2;
                //If per veure si el segon número introduit és un 0
                if (numero2 == 0){
                    /*
                        Missatge per indicar que la operació no es pot realitzar,
                        perquè és un 0
                    */
                    System.out.println("La operació no es pot realitzar.");
                } else {
                    //Missatge on s'indica el resultat
                    System.out.println("El resultat és: " + resultat);
                }
                break; //Per finatlitzar el switch
        }
      
    }
}
