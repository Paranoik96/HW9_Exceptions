package com.cursor.executor;

import com.cursor.division.SafeDivision;
import com.cursor.exceptions.ExceptionVariety;
import com.cursor.rethrowing.RethrowingMethod;

import java.io.IOException;

public class Execute {
    private final ExceptionVariety exceptionVariety =new ExceptionVariety();

    public void start(){
        System.out.println("Your result is : " + new SafeDivision().divideByZero());

        exceptionVariety.showExceptionA();
        exceptionVariety.showExceptionB();
        exceptionVariety.showIOException();
        exceptionVariety.showNullPointerException();

        try {
            RethrowingMethod.someMethod();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
