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
        //Final amb els valors de les ponderacions
        final double PONDERACIO_TEORIA = 0.4, PONDERACIO_SEMINARIS = 0.3,
                PONDERACIO_PRACTIQUES = 0.3;
        final double NOTA_MIN_SUSPES = 0.0, NOTA_MAXIM_SUSPES = 4.99,
                NOTA_MIN_APROVAT = 5.00, NOTA_MAX_APROVAT = 6.99,
                NOTA_MIN_NOTABLE = 7.00, NOTA_MAX_NOTABLE = 8.49,
                NOTA_MIN_EXCELENT = 8.50, NOTA_MAX_EXCELENT = 9.99;
        
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
        double notaFinal = PONDERACIO_TEORIA * teoria +
                PONDERACIO_SEMINARIS * seminaris +
                PONDERACIO_PRACTIQUES * practiques;
        
        //If per comprovar si la nota final, és un supès
        if (notaFinal >= NOTA_MIN_SUSPES && notaFinal <= NOTA_MAXIM_SUSPES) {
            System.out.println("Has suspès. La teva nota és: " + notaFinal);
            //If per comprovar si la nota final, és un aprovat
        } else if (notaFinal >= NOTA_MIN_APROVAT && notaFinal <= NOTA_MAX_APROVAT) {
            System.out.println("Has aprovat. La teva nota és: " + notaFinal);
            //If per comprovar si la nota final, és un notable
        } else if (notaFinal >= NOTA_MIN_NOTABLE && notaFinal <= NOTA_MAX_NOTABLE) {
            System.out.println("Has tret un notable. La teva nota és: "
                    + notaFinal);
            //If per comprovar si la nota final, és un excel·lent
        } else if (notaFinal >= NOTA_MIN_EXCELENT && notaFinal <= NOTA_MAX_EXCELENT) {
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
