interface Animal {
    int eye = 2;

    public void walk();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("Horse is walking");
    }
}

public class InterfaceInJava {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
