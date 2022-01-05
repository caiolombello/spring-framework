package com.dio.springbootbeans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author implements AuthorBook {

    private String name;

    public void printAuthor() {
        System.out.println(this.name);
    }

}
