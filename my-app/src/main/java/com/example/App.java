package com.example;

public class App {
    public static void main(String[] args) {
        String env = System.getProperty("env");
        System.out.println("Current Environment: " + env);
    }
}