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
### Default Exception Handling in java
### Exception Hierarchy
  Here Java Exception Hierarchy 
  ![alt text](https://github.com/krushidj/core-java/blob/master/images/exception-hierarchy-in-java.png)
 
