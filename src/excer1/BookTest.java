package excer1;

import java.util.Scanner;

public class BookTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Book[] books = new Book[3];
        for (int i = 0; i < books.length; i++) {
            Book book1 = new Book();
            System.out.println("Podaj nazwę ksiązki: ");
            book1.setBookName(scan.nextLine());
            System.out.println("Podaj ilosc stron: ");
            book1.setPages(scan.nextInt());
            scan.nextLine();
            books[i] = book1;
        }
        scan.close();
    }
}