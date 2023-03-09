package org.example;

public class Messenger {
    @TimeIt
    void sendMessage() throws InterruptedException {
        System.out.println("Message sent!");
        Thread.sleep(3000);
    }

    void retrieveMessage() {
        System.out.println("Message recieved!");
    }

}
