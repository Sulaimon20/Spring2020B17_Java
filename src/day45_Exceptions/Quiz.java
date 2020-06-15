package day45_Exceptions;

import java.io.IOException;

public class Quiz {
    // chaep way to handle the exception
    public static void main(String[] args) throws IOException {
        throw new IOException();
    }

    public static void method() {
        //throw new IOException(); <== compiler error
    }
}
