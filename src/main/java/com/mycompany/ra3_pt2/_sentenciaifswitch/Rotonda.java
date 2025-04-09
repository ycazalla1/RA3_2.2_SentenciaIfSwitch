/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ra3_pt2._sentenciaifswitch;
import java.util.Scanner;
/**
 * Classe Rotonda.
 * Simulador d'una rotonda amb quatre interseccions.
 * @author Andrea i Yamila
 */
public class Rotonda {

    public static void main(String[] args) {
        
        //Variable scanner per introduir dades a través del teclat
        Scanner sc = new Scanner(System.in);
        int carretera; //Varible de tipus int, per escollir la carretera
        int vehicle;//Varible de tipus int, per escollir vehicle
        final int PRIMERA_SORTIDA = 1, SEGONA_SORTIDA = 2, TECERA_SORTIDA = 3,
                QUARTA_SORTIDA = 4;
        final int TURISME = 1, MOTO = 2, CICLO = 3, CAMIO_SUPERIOR_KG = 4;
        
        //Missatge on es pregunta per quina sortida vol anar
        System.out.println("Quina sortida vols escollir:");
        System.out.println("1. Primera sortida");
        System.out.println("2. Segona sortida");
        System.out.println("3. Tercera sortida");
        System.out.println("4. Quarta sortida");
        //Ordre perquè, el text introduit, sigui el valor de carretera
        carretera = sc.nextInt();
        
        //Sout on es pregunta quin vehicle porta
        System.out.println("Quin és el teu vehicle:");
        System.out.println("1. Turisme");
        System.out.println("2. Motocicleta");
        System.out.println("3. Ciclomotor");
        System.out.println("4. Camió de més de 3.500kg");
        //Ordre perquè, el text introduit, sigui el valor de vehicle
        vehicle = sc.nextInt();
        
        //Switch per veure quina carretera s'ha triat
        switch (carretera) {
            case PRIMERA_SORTIDA: //Si s'ha triat la primera sortida
                System.out.println("Per aquesta sortida pots anar a: "
                        + "Mas Carolet / Ca la Guidó / Mas Cremat");
                //Switch dins de cada sortdia per veure quin vehicle porta
                switch (vehicle) {
                    /*
                        En cada Case, es fica el tipus de vehicle y segons la
                        sortida, pot passar o no
                    */
                    case TURISME,MOTO,CICLO -> System.out.println("Amb el teu"
                            + "vehicle pots accedir.");
                    case CAMIO_SUPERIOR_KG -> System.out.println("Amb aquest"
                            + " vehicle no hi pots accedir.");
                    //Si no s'ha triat cap vehicle
                    default -> System.out.println("El valor introduit és erroni.");
                }
                break; //Per finatlitzar el switch
            case SEGONA_SORTIDA: //Si s'ha triat la segona sortida
               System.out.println("Per aquesta sortida pots anar a: Blanes /"
                       + " Girona / Vic / Mataró / Barcelona");
               switch (vehicle) {
                   /*
                        En cada Case, es fica el tipus de vehicle y segons la
                        sortida, pot passar o no
                   */
                    case TURISME,MOTO,CAMIO_SUPERIOR_KG ->
                        System.out.println("Amb el teu vehicle pots accedir.");
                    case CICLO -> System.out.println("Amb aquest vehicle no hi"
                            + " pots accedir.");
                    //Si no s'ha triat cap vehicle
                    default -> System.out.println("El valor introduit és erroni.");
                }
               break; //Per finatlitzar el switch
            case TECERA_SORTIDA: //Si s'ha triat la tercera sortida
                System.out.println("Per aquesta sortida pots anar a: Blanes platja");
                switch (vehicle) {
                    /*
                        En cada Case, es fica el tipus de vehicle y segons la
                        sortida, pot passar o no
                    */
                    case TURISME,MOTO,CICLO -> System.out.println("Amb el teu"
                            + " vehicle pots accedir.");
                    case CAMIO_SUPERIOR_KG -> System.out.println("Amb aquest"
                            + " vehicle no hi pots accedir.");
                    //Si no s'ha triat cap vehicle
                    default -> System.out.println("El valor introduit és erroni.");
                }
                break; //Per finatlitzar el switch
            case QUARTA_SORTIDA: //Si s'ha triat la quarta sortida
                System.out.println("Per aquesta sortida pots anar a: "
                        + "Blanes nord / Lloret de Mar");
                switch (vehicle) {
                    /*
                        En cada Case, es fica el tipus de vehicle y segons la
                        sortida, pot passar o no
                    */
                    case TURISME,MOTO,CICLO,CAMIO_SUPERIOR_KG ->
                        System.out.println("Amb el teu vehicle pots accedir.");
                    //Si no s'ha triat cap vehicle
                    default -> System.out.println("El valor introduit és erroni.");
                }
                break; //Per finatlitzar el switch
            default: //Si no s'ha triat cap sortida
                System.out.println("El valor introduit és erroni.");
                break; //Per finatlitzar el switch
        }
    }
}
