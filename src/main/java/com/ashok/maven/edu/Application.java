package com.ashok.maven.edu;
public class Application
{
    public Application() {
        System.out.println("Application constructor invoked!");
    }

    public static void main(String[] args) {
        System.out.println("Starting application");
        Application app = new Application();
    }
}