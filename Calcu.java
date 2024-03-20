class Calculation {
    int add(int a, int b) {
        return a + b;
    }
}

class AdvancedCalculation extends Calculation {
    // Overriding
    int add(int a, int b) {
        return a + b + 10;
    }

    // Overloading
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        AdvancedCalculation calc = new AdvancedCalculation();
        System.out.println("(int, int):Hasil Tambah 5 + 10 = " + calc.add(5, 10)); // Memanggil overridden method
        System.out.println("(double, double): Hasil Tambah dari 5.5 + 10.5 = " + calc.add(5.5, 10.5)); // Memanggil overloaded method
    }
}
