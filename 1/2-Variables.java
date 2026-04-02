class Variables {
    public static void main(String[] args) {

        // ===== Primitive types =====

        // Integer types: byte, short, int, long
        int n = 9;
        byte b = 127;
        short s = 400;
        long l = 7898l;
        // Floating-point types: float, double
        double d = 20.10;
        float f = 5.6f;
        // Character type: char
        char c = 'j';
        // Boolean type: boolean
        boolean bl = true;        

        // ===== Non-primitive types =====

        // String (most commonly used)
        String name = "Jaydeep";
        System.out.println(name);

        // Array
        int[] numbers = {1, 2, 3, 4};
        System.out.println(numbers[0]); // prints first element

        // Class (example using wrapper class)
        Integer obj = 100;
        System.out.println(obj);
    }
}