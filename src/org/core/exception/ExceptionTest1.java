package org.core.exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        System.out.println("ex1");
       // m1();// calling
        System.out.println( 10/0);
        System.out.println("main end");
    }

    /*public static void m1() {

        m2();// calling

        System.out.println("m1");
    }

    public static void m2() {
        String name = null;
        try {
            System.out.println(name.toUpperCase());
        }catch (NullPointerException e){
            e.printStackTrace();// tracing
        }

        System.out.println("m2");
    }*/
}


/*
1. An unwanted , unexpectedly event that disturb the normal flow of
 program is called Exception.

2. It is highely recommended to handle the exception and main objective
    of exception handling is graceful termination of program.

3. Exception Handling desent means reparing an exception, we have have to
  provide alternative way to continue rest the program normally is the concept of
  Exception Handling.

  ---------------------------------------------------------
  1. Inside a method any Exception occurs the method in which it raised
     is responsible to create Exception object. by including following info.
       a. Name of Exception
       b. Description of Exception
       c. Location at which Exception occurs[Stack trace]
   2. After creating Exception obj method handover that obj to jvm
   3. Jvm will check whether the method contain any Exception handling or not
      if method desen't contain Exception handling then jvm terminate method abnormally
      and removes that entry from stack.
   4.  Then jvm identify caller method and checks whether caller method contain any handling code or not
   5.If the caller method desen't handling code then jvm terminate  that caller method also removes corresponding
     entry from stack.
   6.this process will be continue until main method and if the main method also desen't contain Handling code
     then jvm terminate main method also and remove corresponding entry from stack.
   7 Then jvm handover responsibility to DefaultException handler which is part of jvm

   8. DefaultExceptionHandler prints info. in the above point 1 format.

        eg ---->   Exception in thread "main" java.lang.NullPointerException
	                  at org.core.exception.ExceptionTest1.m2(ExceptionTest1.java:19)
	                  at org.core.exception.ExceptionTest1.m1(ExceptionTest1.java:12)
	                  at org.core.exception.ExceptionTest1.main(ExceptionTest1.java:6)

	9. In a program if at-least one method terminate then program termination is abnormal termination.
	   if all method terminate normally then only program termination is normal termination.

 */