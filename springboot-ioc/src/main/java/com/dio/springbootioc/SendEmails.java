package com.dio.springbootioc;

public class SendEmails {

    public SendEmails(String type, String address, String password) {

    }

    public static SendEmails getEmailData() {
        return new SendEmails("stmp", "contact@email.com", "password");

    }

    public void returns(String message) {
        System.out.println("Email sent!");
    }

}
