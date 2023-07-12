package org.java.lessons.security;

/*
*  Consegna:
*    Create un nuovo progetto java chiamato java-password-generator
*   Aggiungete un package org.lessons.java.security
*    Aggiungete una classe PasswordGenerator che contiene un metodo main
*    Il programma deve fare quanto segue:
*    salvare in opportune variabili il nome, cognome, colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno (in numero)
*    generare (e stampare a video) una password concatenando nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere
*    Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito è il magenta La sua password sarà Pinco-Pallo-magenta-2011
*   BONUS: utilizzare la classe java.util.Scanner per leggere i dati dell’utente da tastiera
*
*/


import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        //declaration variables
        String nameUser;
        String lastNameUser;
        String colorPreferite;
        int dayOfBirth;
        int mounthOfBirth;
        int yearOfBirth;
        char dash = '-';



        //creation new object scanner
        Scanner input = new Scanner(System.in);

        //user input request
        System.out.println("Inserisci il tuo nome: ");
        nameUser = input.nextLine();
        System.out.println("Inserisci il tuo cognome: ");
        lastNameUser = input.nextLine();
        System.out.println("Inserisci il tuo colore preferito: ");
        colorPreferite = input.nextLine();
        System.out.println("Inserisci SOLO il giorno della tua nascita: ");
        dayOfBirth = input.nextInt();
        System.out.println("Inserisci SOLO il mese della tua nascita: ");
        mounthOfBirth = input.nextInt();
        System.out.println("Inserisci SOLO l'anno della tua nascita: ");
        yearOfBirth = input.nextInt();

        String dateOfBirth = dayOfBirth + "/" + mounthOfBirth + "/" + yearOfBirth;
        int sumOfNumberOfBirth = dayOfBirth + mounthOfBirth + yearOfBirth;
        String insicurePassword = nameUser + dash + lastNameUser + dash + colorPreferite + dash + sumOfNumberOfBirth;

        System.out.println(nameUser + " " + lastNameUser + ", nato il: " + dateOfBirth + ",  di cui il colore preferito è: " + colorPreferite + ". La sua passord insicura è: " + insicurePassword);

    }
}
