package org.core.intefaceandabstractclassestest;




public class CalculationExtendsAbstract extends CalculationAbstractImpl {


    public void sub(int x, int y) {
        System.out.println("sub");
    }

    public void mul(int x, int y) {
        System.out.println("mul");
    }

    public static void main(String[] args) {
        CalculationExtendsAbstract calculationExtendsAbstract=new CalculationExtendsAbstract();
        calculationExtendsAbstract.add(10,20);
    }
}

/*

 */
