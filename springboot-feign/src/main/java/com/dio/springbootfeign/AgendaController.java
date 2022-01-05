package com.dio.springbootfeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contact")
public class AgendaController {

    @GetMapping
    public Contact returnContact() {
        return Contact.builder()
                .id(1L)
                .name("Caio")
                .phone("9999-9999")
                .build();
    }
}
