# core-java 
## main fundamentals topics programs
 TOPICS  | PROGRAMS | PROGRAMS | PROGRAMS | PROGRAMS
| ------------- | ------------- |-----------------|------------------|--------------|
| Fundamental|[ Demo Program](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/JavaDemo%24.java)|[DataType ](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/DataTypeTest.java) |[if statement](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/IfDemo.java)|[if else statement](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/IfElseDemo.java)|
|Fundamental|[ladder if statement](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/LadderIfDemo.java)|[switch statement](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/SwitchDemo.java)| [switch statement test cases](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/SwitchTestCase.java)|[switch Fall through ](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/SwitchFallThroughTest.java)|
|Fundamental|[while loop](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/WhileDemo.java)|[Armstrong using while](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/ArmstrongTest.java)|[print 1 to 100 using while](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/Print1to100ForTest.java)|[for loop ex1](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/SumOf3ForTest.java)|
|Fundamental|[for loop ex2](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/PrintOddNumberForTest.java)|[for loop ex3](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/Print1to100ForTest.java)|[for loop test cases](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/ForTestCase.java)|[nested for loop ex1](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/NestedForTest.java)|
|Fundamental|[nested for loop ex1](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/NestedForPatternTest.java)|[do while loop](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/DoWhileTest.java)|[do while test cases](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/DoWhileTestCase.java)|

## Operator in java
 ### Java provides a rich set of operators to manipulate variables.
### We can divide all the Java operators into the following groups −
 #### Unary operator
   - Increment and Decrement Operator (++, --)[ here program](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/PostIncPreIncOperatorTest.java)
  #### Binary operator
  - Arithmetic Operators (+,-,*,/.%)
  - Relational Operators (<,<=,>,>=)
  - Logical Operators (&&, || ,!)
  - Compound Operators (+=,-=,*=,/= ....)
  - Assignment Operator (=)
  - Equality operator(==,!=)
   #### Ternary Operator
  - Ternary (conditional) Operator (condition?value1:value2)
   #### Misc Type
  - String concatenation operator
  
  ## Exception Handling
  
  - An unexpected, unwanted event that disturb the normal flow of program is called exception.
  - It is Highly recommended to handle the exception and main objective of exception handling is 'Graceful termination ' of program. 
  - Exception Handling means repairing an Exception we have to provide alternative way to continue res of the program normally is the concept of Exception Handling.
  
### Runtime Stack mechanism
 - For every thread JVM will create runtime stack, each and every method call performed by that thread will be in corresponding stack.
 - Each entry in the stack is called stack frame or activation record.
 - After completing every method the corresponding stack will be removed.
 - After completing all method call, stack become empty and that stack will destroyed by JVM just before terminating the thread.
 ```java
class Test
{
    public static void main(String[] args){
        // calling m1()
        m1();
    }
    public static void m1(){
        // calling m2()
        m2();
    }
    public static void m2(){
        System.out.println("This is m2() method");
    }
}
 ```
   ![alt text](https://github.com/krushidj/core-java/blob/master/images/runtimestack.png)

### Default Exception Handling in java
- Inside a method any Exception occurs the methos in which it raised is responsible to create Exception Object by including following information
          1. name of exception.
          2.description of Exception .
          3. Location at which exception occurred (Stack trace)
- After creating exception object, method handover that object into JVM.
- JVM will be check whether the method contains any exception handling code or not, if the method doesen't contains exception handling code then JVM terminate that method abnormally and removes corresponding entry from stack.
- Then JVM (after removing exception raised method) identify caller method and checks whether caller method contain any handling code or not.
- If the caller method doesent handling code then JVM terminate that code method abnormally and removes corrsponding entry from stack.
- This process will be continue until main method  and if the main method also desnt contain handling code, then JVM terminate main mathod abnormally and remove corresponding entry from stack.
- Then JVM handover responsibility of exception handling to default excption handler, which is part of JVM.
- DEH(default exception handler) prints exception information in the following format and terminate program abnormally.
 ------------------------------
     Exception in thread "xxxx" name of exception :description
                      stack trace....             
### Exception Hierarchy
  Here Java Exception Hierarchy 
  ![alt text](https://github.com/krushidj/core-java/blob/master/images/exception-hierarchy-in-java.png)
 
## checked and unchecked exception
### Exception
 Most of times exception are caused by our program and these are recoverable.
 
### Error
   Most of times error not caused by program due to lack of system resources and error are not recoverable.

#### Checked Vs Unchecked Exception
 - Un exception which which are checked by compiler to smooth execution od program are called checked exception.
    -->eg. FileNotFoundException, 
 - In our program if there is chance of raising checked exception then compiler says we should handle that checked exception (either by try catch or throws keyword ) otherwise we get compile time error
 - Note: Whether it is checked or unchecked every exception occurred yet runtime only there is no chance exception occurred compile time.
 - Note: RuntimeException and its child classes and Error and its child classes are <b> unchecked exception </b> except these remaining are <b> Checked </b>
 
### Fully checked Vs Partially checked

- A checked exception is said to be fully checked if and only if all its child classes are checked.
- Eg. FileNotFoundException,InterruptedException,ServletException etc
- A checked exception is said to be partially checked if and only if some of its child classes are unchecked.
- Eg. Exception, Throwable.
- Note: Only possible Partially checked exception in java are
 1. Exception 2. Throwable.
       
## Customized exception handling by using try catch
-  It is highly recommended to handle exceptions.
- The code which may raise an exception is called risky code and we have to define that code inside try  block and corresponding handling code define in catch block.
    ```java 
      try
       {
         Risky code
       }
      catch(Exception e)
       {
        Handling code
       }
         
     ``` 
See more example

  ```java
 class Test
 {
     public static void main(String[] args){
        System.out.println("stmt1");
        System.out.println(10/0);
        System.out.println("stmt3");

     }
    
 }
  ```
 it causes error
   Exception in thread "main" java.lang.ArithmeticException: / by zero
 
   ```java
   class Test
   {
       public static void main(String[] args){
          System.out.println("stmt1");
          try{
          System.out.println(10/0);
          }catch (ArithmeticException ae){
              System.out.println(10/1);
          }
          System.out.println("stmt3");
  
       }
      
   }
   ```
 output--
 stmt1
 10
 stmt3  
 ## finally block
 - finally is a block always associated with try to maintain cleanup code
 - Java finally block is a block that is used to execute important code such as closing connection, stream etc.
   

 
 ````java
 try
 {
     //risky code
 }catch(Exception e)
 {
     // Handling code
 }
 finally{
    // cleanup code
 }
 ````
 ### throw keyword
 - Sometime we create Exception object manually and handover to the jvm.for these we have to use throw keyword.
   
   ![alt text](https://github.com/krushidj/core-java/blob/master/images/throw%20keyword.png)
- Hence main objective of throw keyword to handover our creation object to manually 
- Best use throw keyword is user defined Exception.

see Example [ here program](https://github.com/krushidj/core-java/blob/master/src/org/core/fundamental/PostIncPreIncOperatorTest.java)