package Shape;


abstract class Shape {
    public abstract String getName();
}

class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }
}

class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }
}

class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }
}

class Pentagon extends Shape {
    @Override
    public String getName() {
        return "Pentagon";
    }
}

class ShapePrinter {
    public void printShape(Shape shape) {
        System.out.println("Shape is: " + shape.getName());
    }
}

class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        printer.printShape(new Circle());
        printer.printShape(new Square());
        printer.printShape(new Rectangle());
        printer.printShape(new Triangle());
        printer.printShape(new Pentagon());
    }
}
