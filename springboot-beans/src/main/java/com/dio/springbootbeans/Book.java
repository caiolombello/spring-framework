package com.dio.springbootbeans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Book {

    @Autowired
    AuthorBook authorBook;

    private String name;
    private String code;

    public void print() {
        System.out.print(name + " - ");
        authorBook.printAuthor();
        System.out.println("CODE: " + code);
    }

}
