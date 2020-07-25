package com.cursor.exceptions;

import java.io.IOException;

public class ExceptionVariety {

    public void showExceptionA(){
        try {
            throw new ExceptionB("You catch Exception A!!");
        }catch (ExceptionA a){
            System.out.println(a.getMessage());
        }
    }

    public void showExceptionB(){
        try {
            throw new ExceptionB("You catch Exception B!!");
        }catch (ExceptionB b){
            System.out.println(b.getMessage());
        }
    }
    public void showNullPointerException(){
        try {
            throw new NullPointerException("You catch NullPointerException!!");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public void showIOException(){
        try {
            throw new IOException("You catch IOException!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
