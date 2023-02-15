package com.example.homework.homeworkSix;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Books {
    private int bookId;
    private String nameOfBook;

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getBookId() {
        return bookId;
    }

    public Books(String nameOfBook, int bookId) {
        this.nameOfBook = nameOfBook;
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Books{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", bookId=" + bookId +
                '}';
    }

    public static Map<Integer, Books> myBooks(List<Books> books) {
        Map<Integer, Books> myBooks = books.stream().collect(Collectors.toMap(Books::getBookId, Function.identity()));
        return myBooks;
    }

    public static void main(String[] args) {
        Books book1 = new Books("Philosophy", 0);
        Books book2 = new Books("English", 1);
        Books book3 = new Books("Astronomy", 2);
        Books book4 = new Books("IT", 3);
        Books book5 = new Books("Math", 4);
        List<Books> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        Map<Integer, Books> myMap = myBooks(books);
        System.out.println(myMap);
    }
}



