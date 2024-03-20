class Shape {
    void draw() {
        System.out.println("Menggambar bentuk");
    }
}

class Circle extends Shape {
    // Overriding
    void draw() {
        System.out.println("Menggambar Lingkaran");
    }

    // Overloading
    void draw(int radius) {
        System.out.println("Menggambar lingkaran dengan jari-jari: " + radius);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw(); // Memanggil method dari Shape class

        Circle circle = new Circle();
        circle.draw(); // Memanggil overridden di Circle class
        circle.draw(5); // Memanggil overloaded di Circle class
    }
}
