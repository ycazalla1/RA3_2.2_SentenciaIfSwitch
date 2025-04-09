/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ra3_pt2._sentenciaifswitch;
import java.util.Scanner;
/**
 * Classe NotaFinal.
 * Calcula la nota mitjana.
 * @author Andrea i Yamila
 */
public class NotaFinal {

    public static void main(String[] args) {
        
        //Varible de tipus double, per introduir la nota de teoria
        double teoria;
        //Varible de tipus double, per introduir la nota de seminaris
        double seminaris;
        //Varible de tipus double, per introduir la nota de practiques
        double practiques;
        
        //Variable scanner per introduir dades a través del teclat
        Scanner sc = new Scanner(System.in);
        //Sout per pregunat per la nota de teoria
        System.out.print("Introdueix la teva nota de teoria: ");
        //Ordre perquè, el valor introduit, sigui la nota de teoria
        teoria = sc.nextDouble();
        //Sout per pregunat per la nota de seminaris
        System.out.print("Introdueix la teva nota de seminaris: ");
        //Ordre perquè, el valor introduit, sigui la nota de seminaris
        seminaris = sc.nextDouble();
        //Sout per pregunat per la nota de practiques
        System.out.print("Introdueix la teva nota de pràctiques: ");
        //Ordre perquè, el valor introduit, sigui la nota de practiques
        practiques = sc.nextDouble();
        
        /*
            Variable de tipus double, on s'introdueix el resultat del càlcul de
            la mitjana de notes
        */
        double notaFinal = 0.4 * teoria + 0.3 * seminaris + 0.3 * practiques;
        
        //If per comprovar si la nota final, és un supès
        if (notaFinal >= 0.00 && notaFinal <= 4.99) {
            System.out.println("Has suspès. La teva nota és: " + notaFinal);
            //If per comprovar si la nota final, és un aprovat
        } else if (notaFinal >= 5.00 && notaFinal <= 6.99) {
            System.out.println("Has aprovat. La teva nota és: " + notaFinal);
            //If per comprovar si la nota final, és un notable
        } else if (notaFinal >= 7.00 && notaFinal <= 8.49) {
            System.out.println("Has tret un notable. La teva nota és: "
                    + notaFinal);
            //If per comprovar si la nota final, és un excel·lent
        } else if (notaFinal >= 8.50 && notaFinal <= 9.99) {
            System.out.println("Has tret un excel·lent. La teva nota és: "
                    + notaFinal);
        } else {
            /*
                Si no és cap nota anterior mostra un missatge, on ens diu que
                s'ha tret una matrícula d'honor
            */
            System.out.println("Tens una matrícula d'honor. La teva nota és: "
                    + notaFinal);
        }
    }
}
