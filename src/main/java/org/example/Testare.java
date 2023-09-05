package org.example;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Testare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.print("Name Event : ");
        String titolo = scan.nextLine();*/

        System.out.print("Date : ");
        LocalDate data = LocalDate.parse(scan.nextLine());

        /*System.out.print("totali Posti : ");
        int totPosti = scan.nextInt();*/

        Evento evento = new Evento("ITALY show", data, 45);


        System.out.println(evento.toString());

        evento.Prenota(7);

        System.out.println("Posti Totali : " + evento.getTotPosti());
        System.out.println("Posti Prenotati : " + evento.getPostiPrenotati());
        System.out.println("Posti disponibili : " + evento.getPostiDisponibili());

        scan.close();
    }

}
