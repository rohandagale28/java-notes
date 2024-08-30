abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Chicken is walking");
    }
}

public class HierarchialInheritance {

    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();

        Chicken chick1 = new Chicken();
        chick1.walk();
    }
}
