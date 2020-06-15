package day45_Exceptions;

import java.io.IOException;

public class Summary {

    public static void main(String[] args) {

        IOException p=new IOException();
        try {

            throw new IOException(); //
        }catch (Exception e){

        }
        System.out.println("Hello");
        try {

            throw new ClassNotFoundException();
        }catch (ClassNotFoundException e){

        }
        System.out.println("Completed");
    }
}
