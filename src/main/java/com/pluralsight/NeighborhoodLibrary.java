package com.pluralsight;

import java.awt.print.Book;
import java.util.Scanner;

public class NeighborhoodLibrary {
    static Scanner myscanner = new Scanner(System.in);
    static Library[] books = {
            new Library(1001, "978-0316327336", "Twilight", true, "Jen"),
            new Library(1002, "978-0316327787", "Twilight: New Moon", false, ""),
            new Library(1003, "978-0316328142", "Twilight: Eclipse", true, "Potato"),
            new Library(1004, "978-0316328517", "The Short Second Life of Bree Tanner", true, "Ray"),
            new Library(1005, "978-0316067928", "Twilight: Breaking Dawn", true, "Kay"),
            new Library(1006, "978-0316629454", "Twilight: Midnight Sun", false, ""),
            new Library(1007, "978-0316300865", "Life and Death: Twilight reimagined", false, ""),
            new Library(1008, "978-0062024039", "Divergent", true, "Lay"),
            new Library(1009, "978-0062024053", "Insurgent", false, ""),
            new Library(1010, "978-0062024077", "Allegiant", false, ""),
            new Library(1011, "978-1781100486", "Harry Potter and the Sorcerer's Stone", false, ""),
            new Library(1012, "978-1781100509", "Harry Potter and the Chamber of Secrets", true, "Natasha"),
            new Library(1013, "978-1781100516", "Harry Potter and the Prisoner of Azkaban", false, ""),
            new Library(1014, "978-1781100523", "Harry Potter and the Goblet of Fire", true, "Autumn"),
            new Library(1015, "978-1781100530", "Harry Potter and the Order of the Phoenix", true, "James"),
            new Library(1016, "978-1781100547", "Harry Potter and the Half-Blood Prince", true, "MK"),
            new Library(1017, "978-1781102435", "Harry Potter and the Deathly Hallows", false, ""),
            new Library(1018, "978-1613122440", "Diary of a Wimpy Kid: Rodrick Rules", true, "Alana"),
            new Library(1019, "978-0810970687", "Diary of a Wimpy Kid: The Last Straw", true, "Rick"),
            new Library(1020, "978-0810993136", "Diary of a Wimpy Kid ", false, ""),
    };

    public static void main(String[] args) {
        System.out.println("===========Welcome to the neighborhood library");
        boolean isFinished = false;

        while (!isFinished) {

            System.out.println("=========== Library Searcher ===========");
            System.out.println("1. Show Available Books ");
            System.out.println("2. Show Checked Out Books ");
            System.out.println("3. Exit ");

            int command = myscanner.nextInt();

            myscanner.nextLine();
            switch (command) {
                case 1:
                    showAvailableBooks();
                case 2:
                    checkedOutBooks();
                case 3:
                    System.out.println("Exiting Library Searcher. Goodbye! ");
                    isFinished = true;
                    break;
                default:
                    System.out.println("Sorry, an error occurred. Try again. ");
                    break;
            }

        }

    }

    public static void showAvailableBooks() {
        System.out.println("Books available for Check-out. ");
        for (int i = 0; i < books.length; i++) {
            if (!books[i].isCheckedOut()) {
                System.out.println(books[i]);
                System.out.println("1. Would you like to check a book out? ");
                System.out.println("2. Return");
                System.out.println("3. Exit");
            switch (myscanner.nextLine()) {
                case "1":
                    checkOutBook();
                case "2":
                    homePage();
                case "3":
                    System.out.println("Exiting Library Searcher. Goodbye! ");
                    System.exit(0);
                    break;
                default:throw new IllegalStateException("Unexpected value: " + myscanner.nextLine());
            }
            }

        }
    }

    public static void checkedOutBooks() {
        System.out.println("Unavailable books: ");
        for (int i = 0; i < books.length; i++) {

            //homePage();//
        }
    }
    public static void availableBooksMenu() {
        System.out.println("1. Check-out book: ");
        System.out.println("2. Back to searcher: ");
        System.out.println("3. Exit: ");
        switch (myscanner.nextLine()) {
            case "1":
                checkOutBook();
                break;
            case "2":
                homePage();
                break;
            case "3":
                System.out.println("Exiting Library Searcher. Goodbye! ");
                System.exit(0);
                break;
            default:
                System.out.println("Unexpected error occurred! Try again. ");
                homePage();
                break;

        }
    }
    public static void homePage(){
        System.out.println("=========== Library Searcher ===========");
        System.out.println("1. Show Available Books ");
        System.out.println("2. Show Checked Out Books ");
        System.out.println("3. Exit ");
        switch (myscanner.nextLine()) {
            case "1":
                showAvailableBooks();
                break;
            case "2":
                checkedOutBooks();
                break;
            case "3":
                System.out.println("Exiting Library Searcher. Goodbye! ");
                System.exit(0);
                break;
            default:
                System.out.println("Unexpected error occurred! Try again. ");
                homePage();
                break;

        }
    }
    public static void checkOutBook() {
        System.out.println("Please choose a book by ID: ");

    }
}