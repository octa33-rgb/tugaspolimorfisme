class Animal {
    void sound() {
        System.out.println("Binatang Bersuara");
    }

    // Overloading
    void move() {
        System.out.println("Binatang Bergerak");
    }
}

class Dog extends Animal {
    // Overriding
    void sound() {
        System.out.println("Anjing Menggonggong");
    }

    // Overloading method dengan tambahan parameter
    void move(String direction) {
        System.out.println("Anjing bergerak ke " + direction);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Memanggil metode overridden  in Animal class
        animal.move();  // Memanggil metode overloaded  in Animal class

        Dog dog = new Dog();
        dog.sound(); // Memanggil metode overridden  in Dog class
        dog.move();  // Memanggil metode overloaded  in Animal class
        dog.move("arah pasar"); // Memanggil metode overloaded  in Dog class
    }
}
