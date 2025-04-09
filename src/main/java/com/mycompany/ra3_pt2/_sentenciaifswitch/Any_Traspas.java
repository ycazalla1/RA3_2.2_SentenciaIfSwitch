/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ra3_pt2._sentenciaifswitch;
import java.util.Scanner;
/**
 * Classe Any_Traspas.
 * Calcula si els anys són de traspàs.
 * @author Andrea i Yamila
 */
public class Any_Traspas {

    public static void main(String[] args) {
        
        int numero; //Varible de tipus int, per introduir un número
        
        //Variable escàner per introduir dades a través del teclat
        Scanner sc = new Scanner(System.in);
        //Missatge on es pregunta per un número
        System.out.print("Introdueix un número: ");
        //Ordre perquè, el valor introduit, sigui el valor de carretera
        numero = sc.nextInt();
        
        //If per comprovar si el número introduit finalitza en tres 0, o més
        if (numero % 1000 == 0) {
            //If per comprovar si el número introduit és múltiple de 4
            if (numero % 4 == 0){
                /*
                    Missatge per indicar que és múltiple de 4, que acabin en
                    tres 0, o més
                */
                System.out.println("És múltiple de 4.");
            }
        //If per comprovar si el número introduit finalitza en dos 0
        } else if (numero % 100 == 0){
            //Divisió per treure els dos últims 0 al número introduit
            int resultat = numero / 100;
            //If per comprovar si el número introduit és múltiple de 4
            if (resultat % 4 == 0){
                /*
                    Missatge per indicar que és múltiple de 4, treint els dos
                    últims 0
                */
                System.out.println("Treien els dos 0, és múltiple de 4.");
            } else {
                /*
                    Missatge per indicar que no és múltiple de 4, treint els dos
                    últims 0
                */
                System.out.println("Treien els dos 0, no és múltiple de 4.");
            }
        //If per comprovar si el número introduit és múltiple de 4
        } else if (numero % 4 == 0) {
            //Sout per indicar que és múltiple de 4.
            System.out.println("És múltiple de 4.");
        } else {
            //Sout per indicar que no és múltiple de 4
            System.out.println("No és múltiple de 4.");
        }
        
    }
}
