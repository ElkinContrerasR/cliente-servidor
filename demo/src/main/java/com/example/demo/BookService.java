package com.example.demo;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();

    public BookService(){
        Faker faker = new Faker();
        for(int i = 1; i<11; i++){
            String name = faker.book().title();
            String author = faker.book().author();
            books.add(new Book(
                    i,
                    name,
                    author
            ));
        }

    }

    public List<Book> getBooks(){
        return books;
    }
}
