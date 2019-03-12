package org.core.inheritance_has_a_relationship;

class Sheet {
    public void getSheet() {
        System.out.println(" Sheet");
    }
}

class Sheet1 {
    public void getSheet() {
        System.out.println("Sheet");
    }

}

public class Pulser {
    public static void main(String[] args) {
        Engine e = new Engine();
        e.showCC();
        Sheet s = new Sheet();
        s.getSheet();
    }
}
