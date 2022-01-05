package com.dio.springbootioc;

public class Request {
    public static void main(String[] args) {
        Request request = new Request();

        request.record();
    }

    private final SendEmails send = SendEmails.getEmailData();

    public void record() {
        this.send.returns("Request sent!");
    }

}
