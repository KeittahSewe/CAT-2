public class MathOperations {
    // Two numbers
    public int multiply(int x, int y) {
        return x * y;
    }

    // Three numbers Overload
    public int multiply(int x, int y, int z) {
        return x * y * z;
    }

    // Test overloading
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Multiplication of 2 numbers: " + math.multiply(4, 8));
        System.out.println("Multiplication of 3 numbers: " + math.multiply(4, 8, 12));
    }
}
