package com.example.helloworld;
import java.io.PrintStream;


/** testuje jak dziala domyslny gradle wrapper w intellij */
public class HelloWorld {
    public static void main(String[] args) {
        print(System.out);
    }
    public static void print(PrintStream out) {
        out.print("Hello, World");
    }

}
