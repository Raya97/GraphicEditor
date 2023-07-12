package main.java;

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
