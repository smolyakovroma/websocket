package ru.smolyakov.websocket.pojo;

public class Greeting {
    private String content;

    public Greeting(String name) {
        this.content = name;
    }

    public String getContent() {
        return content;
    }

}
