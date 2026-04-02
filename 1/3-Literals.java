class Literals {
    public static void main(String args[]) {

        // If we write 0b, the number is treated as a binary literal
        int binaryNum = 0b111;
        System.out.println(binaryNum); // Output: 7

        // If we write 0x, the number is treated as a hexadecimal literal
        int hexaNum = 0x7E;
        System.out.println(hexaNum); // Output: 126

        // We can use underscores (_) to make numbers more readable
        // They are ignored by the compiler
        int num = 1_00_00_00;
        System.out.println(num); // Output: 1000000

        // 'e' represents scientific notation (exponent).
        // 12e10 means 12 × 10^10 (i.e., 120000000000.0)
        double num1 = 12e10;
        System.out.println(num1); // (Java prints large numbers in scientific notation)
        System.out.printf("%.0f", num1); // If you want full number output (no scientific format)

        char c = 'a';
        c++;
        System.out.println(c);
    
    }
}