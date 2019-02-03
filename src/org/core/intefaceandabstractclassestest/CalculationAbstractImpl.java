package org.core.intefaceandabstractclassestest;



public abstract class CalculationAbstractImpl implements  Calculation{
    public void add(int x, int y) {
        System.out.println("add");
    }

    public abstract void sub(int x, int y) ;
    public abstract void mul(int x, int y) ;

}
/*
1. if method declare as abstract then class must be declare abstract .
but if there is no method is abstract we can decalare class as abstract
2. in abstract class abstract and concrete method we can declared.
note:  interface method override not  compulsary if class declared as abstract.
 */