package com.os2.os2_zkouska_interactive.models;

public class Question {

    private String header;
    private String text;

    public Question(String header, String text) {
        this.header = header;
        this.text = text;
    }

    public Question() {
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
