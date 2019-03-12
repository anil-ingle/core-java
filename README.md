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
  ## Array in java(Language level)
   ### Agenda
   - Introduction
   - Array Declaration
   - Array Creation
   - Array Initialization
   - Array Declaration, Creation and Initialization on single line
   - example
   #### Introduction
   - An array is a container that holds data (values) of one single type (similar data type). For example, you can create an array that can hold 100 values of int type.
   - Example int[] a=new Int[50]; it means that it stored integer value up to 50 cell. i.e. a[0], a[1]
        ,a[2],....,a[49].
   - Advantage
     1. Array are homogeneous data type.
     2. Array are fixed in size.
     3. We can represent huge no. of values by using single variable so that readability of code improved.
   - Disadvantages
     1. Fixed size. Can not be increased or decrease once declared.
     2. Can store a single type of primitives only.
   #### one-dimensional array declaration
   - All following type are allowed
     1. int[]  x;     
     2. int  []x;
     3. int  x[];
   - At the declaration time e can't specify the size otherwise it cause CE.
     1. int[6] x; --->CE
     2. int[] x; ---> correct.      
 #### rwo-dimensional array declaration
  - All following type are allowed 
    1. int[][] x;
    2. int [][]x;
    3. int[] []x;
    4. int x[][];
    5. int[] x[];
    6.int []x[];
  -similar 3-d also.
  
  #### Creation of array
- int a=new int[3]; -->creation of array.
- Loop holes
 1. int[] a=new int[];---> CE: size not declared size must be declared
 2. int x=new int[0]; --> correct Bcoz size declared.
 3. int x=new int[-3];---CE: negative Array  Declaration.
 4. int x=new int['a']; ---> correct it consider ascii value it promotes upto int by our type promotion chart.
- To specify array size allowed data type are byte, short , char and int only.
- Here Array sample program including  array initialization, creation access etc. see Example [here program](https://github.com/krushidj/core-java/blob/master/src/org/core/array/ArrayDeclarationTest.java)
 #### Array declaration, creation and Initialization in single line
 - int x={10,20,30,40,50,60}; internally it creates like 
 ````java
  int[] x=new int[6];
     x[0]=10;
     x[1]=20;
     x[2]=20;
     x[3]=30;
     x[4]=40;
     x[5]=50;
  ````    
- char ch={'a','b','c','d'}; internally it creates like 
  ````java
    char[] ch=new char[4];
       ch[0]='a';
       ch[1]='b';
       ch[2]='c';
       ch[3]='d';
  ````  
 - Loop Holes
   ````java
      int[] x;
           x={10,20,30,40,50}; // CE u can not change line while initialization, creation and declaration in single line.
        
    ```` 
 - Here Some Example 1 Sum of Avg[here program](https://github.com/krushidj/core-java/blob/master/src/org/core/array/ArrayAvgSumTest.java) Example 2 Larger Value[here program](https://github.com/krushidj/core-java/blob/master/src/org/core/array/HighestValueArrayTest.java) Example 3 Selection Sort [here program](https://github.com/krushidj/core-java/blob/master/src/org/core/array/SelectionSortArrayTest.java)   
   
  ## OOP Concept
 OOPS Concepts or Object Oriented Programming Concepts are very important. Without having an idea about OOPS concepts, you will not be able to design systems in the object-oriented programming model. following are main topic
 - Data Hiding
 - Abstraction
 - Encapsulation
 - IS-A Relationship
 - HAS-A Relationship
 - Polymorphism(1.Overloading 2. Overriding)
 - Constructor
 - Coupling
 - type casting
 ### Data Hiding
 - Outside person can't access our internal data or our internal data should not go directly this oop feature is hiding.
 - After validation or identification outside person data.
 - Eg: username and password we can able to access.
 - Advantage of data hiding is security.
 - Note: it is highly recommended variable as private  
 ```java
 class Test
 {
    private String  userName;
    private String password;
    private double balance;
    public double getBalance(){
        // after validation 
        return this.balance;
    }
 }
  ```
  ### Abstraction
  - Hiding internal implementation and just highlight set services we are offering is called abstraction.
  - The main advantage are
  1. Security
  2. Enhancement
  3. Maintainability easy
 - By using interface abstract class we can implement abstraction.
 ### Encapsulation
  ```java
   class Employee
   {
     data member;
     +
     methods(behavior)
   }
   ```
 - The process of binding data member and corresponding methods into a single unit is called encapsulation.
 - Every java class itself is an encapsulation 
 - If any component follow data hiding and abstraction such type of component is said to be encapsulated component,
 - Encapsulation=Data Hiding + Abstraction  
 ### IS-A Relationship
 - It is also known as Inheritance (Parent Child Relationship). 
 - The main Advantage of is-a relationship is code re-usability.
 - By using extends keyword we can implements is-a relationship.
 - Java class can't extends more than one class at a time hence java won't provide multiple inheritance support.
 -   EX. class C extends B, C // CE :Class cannot extend multiple classes
 - The most common method which are applicable for any type of child we have defined (write) in parent class.
 -The specific (child required) method we have to defined(write) in child class.
 - See Example see Example [ here program](https://github.com/krushidj/core-java/blob/master/src/org/core/inheritance/Test.java)
 
 ### HAS-A Relationship
- also know as composition/ aggregation
-main advantage re-usability.
-by using new keyword.
- See Example see 1 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/inheritance_has_a_relationship/Splender.java)
- See Example see Example 2[ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/inheritance_has_a_relationship/Pulser.java)
### Polymorphism
There are two types of polymorphism.
1. Compile time polymorphism or Static  polymorphism or Method Overloading 

    - If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
    - If we have to perform only one operation, having same name of the methods increases the readability of the program.
    - Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.
    - So, we perform method overloading to figure out the program quickly.
    - Method overloading increases the readability of the program.
    - See Example see 1 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overloading/OverloadingTest.java) Example 2 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overloading/OverloadintTest1.java) Example 3 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overloading/OverloadingTypePromotionTest.java) Example 4 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overloading/OverloadingObjectTypeTest.java)
    - See Example see Parent Child Level Overloading  [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overloading/ParentChlidOverloadingTest.java)

2. Runtime Polymorphism or Dynamic Polymorphism or Method Overriding
    - If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
    - In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
    - Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
    - Method overriding is used for runtime polymorphism
    - Rules:
      1. The method must have the same name as in the parent class
      2. The method must have the same parameter as in the parent class.
      3. There must be an IS-A relationship (inheritance).
    - See Example 1 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overring/Test1.java)
    - See Example--> private method can not override  [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overring/OverringExample2.java)
    - See Example -->final method can not override  [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overring/OverrideExample3.java  )
    - See Example 4 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overring/OverrideExample4.java) Example 5 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overring/OverrideExample5.java)
    - See Example 6 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overring/MOL6WithInheritance.java) Example 7 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/overring/MOL7WithInheritance.java)

### Constructor
- Every time an object is created using new() keyword, at least one constructor is called. It calls a default constructor.
- Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.
- Rules:
  1. Name of class and name of constructor must be same.
  2. return type concept not applicable for constructor.
  3. Applicable modifier --> public, protected ,protected ,<default>
  4. compiler generated default constructor  if and only if when programmer not write any constructor.
  5. constructor 1st line required this() or super(), if u r not place any thing constructor automatically add super().
  6. 1st line this() or super() but not both.
 - See Example 1 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/constructor/Employee.java) Constructor chaining Example 2 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/constructor/Employee1.java) Example 2 [ here program](https://github.com/anil-webonise/core-java/blob/master/src/org/core/constructor/Example.java)


 
  



 
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

see Example [ here program](https://github.com/krushidj/core-java/blob/master/src/org/core/exception/TestThrow.java)