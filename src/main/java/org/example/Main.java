package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean datiValidi = false;

        Evento event = null;

        while (!datiValidi){

            try {

                System.out.print("inserisci il nome dell'evento : ");
                String titolo = scan.nextLine();

                System.out.print("inserisci la data in formato yyyy-mm-dd : ");
                LocalDate data = LocalDate.parse(scan.nextLine());

                System.out.print("insersci numero totali di posti : ");
                int totPosti = scan.nextInt();

                event = new Evento(titolo, data,totPosti);
                datiValidi = true;

                System.out.println("Evento Creato!");

                System.out.println("\n" + event.toString());

            }catch (RuntimeException exception){

                System.out.println(exception.getMessage());

            }

        }
        scan.close();
    }
}
