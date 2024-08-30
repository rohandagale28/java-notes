
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing with a " + color + " " + type + " pen");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

// class name start with uppercase and function name start with camelcase
class Student {

    String name;
    int age;

    // public void printInfo() {
    // System.out.println(this.name);
    // System.out.println(this.age);
    // }

    Student() { // non return and non parameterize
        System.out.println("Default constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // polymorphism
    public void printInfo(String name) { // function overloading
        System.out.println(this.name);
    }

    public void printInfo(int age) {
        System.out.println(this.age);
    }

    public void printInfo(String name, int age) {
        System.out.println("my name is " + this.name + "and my age is" + this.age);
    }
}

// inheritance
class Shape { // base class
    String color;

    public void area(int a) {
        System.out.println("Area of shape is " + a);
    }
}

class Triangle extends Shape { // derived class
    int side1;
}

class EquilaterlaTriangle extends Triangle {

    public void area(int l, int h) {
        System.out.println("Area of triangle is " + (l * h) / 2);
    }
}

public class OPPs {
    public static void main(String args[]) {
        // pen example
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ballpoint";
        pen1.write();
        pen1.printColor();

        // student example
        Student s1 = new Student("rohan", 21);
        // s1.name = "John";
        // s1.age = 20;
        s1.printInfo("rohan", 21);

        // inhertinace
        Triangle t1 = new Triangle();
        t1.color = "red";
        t1.side1 = 3;
        t1.area(3);

        EquilaterlaTriangle Eqa = new EquilaterlaTriangle();
        Eqa.area(3);

        // package
        
    }
}