package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.LibraryUser;
import pl.javastart.library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer){
        this.printer = printer;
    }

    public String getString() {
        return sc.nextLine();
    }

    public void close() {
        sc.close();
    }

    public  int getInt () {
        try {
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }
    }


    public Book readAndCreateBook () {
        System.out.println("Tytuł");
        String title = sc.nextLine();
        System.out.println("Autor");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo");
        String publisher = sc.nextLine();
        System.out.println("ISBN");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania");
        int year = getInt();
        System.out.println("Ilość stron");
        int pages = getInt();

        return new Book(title,publisher,year,author,pages,isbn);
    }

    public Magazine readAndCreateMagazine () {
        System.out.println("Tytuł");
        String title = sc.nextLine();
        System.out.println("Wydawnictwo");
        String publisher = sc.nextLine();
        System.out.println("Język");
        String language = sc.nextLine();
        System.out.println("Rok wydania");
        int year = getInt();
        System.out.println("Miesiąc");
        int month = getInt();
        System.out.println("Dzień");
        int day = getInt();

        return new Magazine(title,publisher,language,year,month,day);
    }

    public LibraryUser createLibraryUser() {
        printer.printLine("Imię");
        String firstName = sc.nextLine();
        printer.printLine("Nazwisko");
        String lastName = sc.nextLine();
        printer.printLine("Pesel");
        String pesel = sc.nextLine();

        return new LibraryUser(firstName,lastName,pesel);
    }
}
