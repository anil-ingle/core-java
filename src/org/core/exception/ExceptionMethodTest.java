package org.core.exception;

public class ExceptionMethodTest {
    public static void main(String[] args) {
        try{
            int x=10/0;
        }catch (ArithmeticException e){
            System.out.println("-----------------------");
            e.printStackTrace();// tracing
            System.out.println("-----------------------");
            System.out.println(e.toString());
            System.out.println("-----------------------");
            System.out.println(e.getMessage());
            System.out.println("-----------------------");
        }
    }
}
/*
Throwable class defines the following methods to print execption information

	method             |  printable format             |   output
	------------------------------------------------------------------------------------------------------------------------------------|
	1.printStackTrace()| Name of execption :description| java.lang.ArithmeticException: / by zero                                       |
	                   |    at causes method name      |     at org.core.exception.ExceptionMethodTest.main(ExceptionMethodTest.java:6) |
	                   |                               |                                                                                |
	                   |                               |                                                                                |
   -------------------------------------------------------------------------------------------------------------------------------------|
   2 toString()        | Name of execption: description|  java.lang.ArithmeticException: / by zero                                      |
                       |                               |                                                                                |
 ---------------------------------------------------------------------------------------------------------------------------------------|
   3. getMessage()      | description                  |  / by zero                                                                     |
 ---------------------------------------------------------------------------------------------------------------------------------------|
 */