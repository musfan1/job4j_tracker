package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book philosophyOfJava = new Book("The Philosophy of Java", 150);
        Book headFirstJava = new Book("Head First Java", 200);
        Book thinkingInJava = new Book("Thinking In Java", 250);
        Book coreJava = new Book("Core Java", 300);
        Book[] books = new Book[4];
        books[0] = philosophyOfJava;
        books[1] = headFirstJava;
        books[2] = thinkingInJava;
        books[3] = coreJava;
        Book cleanCode = new Book("Clean code", 400);
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }
        System.out.println("Rearrange books:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getTitle() + " - " + book.getPages());
        }
        System.out.println("Select book by title:");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getTitle())) {
                System.out.println(book.getTitle() + " - " + book.getPages());
            }
        }
    }
}

