package org.example;

/*

        La consegna è di creare una classe Evento che abbia le seguenti proprietà:

            ● titolo
            ● data
            ● numero di posti in totale
            ● numero di posti prenotati

        Quando si istanzia un nuovo evento questi attributi devono essere tutti valorizzati nel costruttore ,
        tranne posti prenotati che va inizializzato a 0.

        Inserire il controllo che la data non sia già passata e che il numero di posti totali sia positivo.
        In caso contrario sollevare opportune eccezioni.

        Aggiungere metodi getter e setter in modo che:
            ● titolo sia in lettura e in scrittura
            ● data sia in lettura e scrittura
            ● numero di posti totale sia solo in lettura
            ● numero di posti prenotati sia solo in lettura

        Vanno inoltre implementati dei metodi public che svolgono le seguenti funzioni:
            1. prenota : aggiunge un certo numero di posti prenotati.
            Se l’evento è già passato o non ha posti disponibili deve sollevare un’eccezione.

            2. disdici : riduce di un certo numero i posti prenotati.
            Se l’evento è già passato o non ci sono prenotazioni deve sollevare un’eccezione.

            3. l’override del metodo toString() in modo che venga restituita una stringa contenente:
            data formattata - titolo

        Aggiungete eventuali metodi (public e private) che vi aiutino a svolgere le funzioni richieste.

 */

import java.time.LocalDate;

public class Evento {

    //  ATTRIBUTI
        private String titlo;
        private LocalDate data;
        private int totPosti;
        private int postiPrenotati;

        private int postiDisponibili;

    //  COSTRUTTORI

    public Evento(String titlo, LocalDate data, int totPosti) {
        if (totPosti < 0){
            throw new RuntimeException("numero invalido!");
        }

        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException("data invalida");
        }

        this.titlo = titlo;
        this.data = data;
        this.totPosti = totPosti;
        this.postiPrenotati = 0;
        this.postiDisponibili = 0;
    }


    //  SETTERS & GETTERS

    public String getTitlo() {
        return titlo;
    }

    public void setTitlo(String titlo) {
        this.titlo = titlo;
    }

    public java.time.LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getTotPosti() {
        return totPosti;
    }

    public int getPostiPrenotati() {
        return postiPrenotati;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    //  METODI

    @Override
    public String toString() {
        return "Evento [ " + data + " - " + titlo + " ]";

    }

    public void Prenota(int postiPrenotati){
        this.postiPrenotati = postiPrenotati;

        postiDisponibili = totPosti - postiPrenotati;

        if (data.isBefore(LocalDate.now())){
            throw new RuntimeException("Data già passata");
        }
        if (postiPrenotati > postiDisponibili){
            throw new RuntimeException("Posti overloading");
        }

    }

    public void Cancella(int numeroCancellati){
        postiPrenotati =- numeroCancellati;
    }

}
