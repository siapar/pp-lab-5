package org.example;

import company.beans.Person;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Maks", 26);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        try {
            Person person = new Person("Tomek", 132);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        EmailMessenger emailMessenger = new EmailMessenger();
        emailMessenger.sendMessage("Message");
    }
}