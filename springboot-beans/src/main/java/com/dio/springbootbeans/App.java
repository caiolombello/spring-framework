package com.dio.springbootbeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Book book = factory.getBean(Book.class);
        book.setName("Harry Potter");
        book.setCode("9873");

        Author author = factory.getBean(Author.class);
        author.setName("J.K. Rowling");

        book.print();

        factory.close();
    }
}
