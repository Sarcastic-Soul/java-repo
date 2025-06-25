abstract class Shape {                      //Cannot create "Shape" object cause its abstract
    public void area() {
        System.out.println("Display Area of Shape");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println(0.5*b*h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2, 5);

        Circle c1 = new Circle();
        c1.area(5);

    }
    
}
