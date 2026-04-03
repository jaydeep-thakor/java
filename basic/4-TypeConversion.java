class TypeConversion {
    public static void main(String args[]) {

        // Type Casting

        // Example 1: Value out of byte range (overflow case)
        int a = 256;
        byte b;

        // Explicit type casting from int to byte
        // Since byte range is -128 to 127, 256 is out of range
        // Java keeps only the last 8 bits (1 byte), causing overflow
        // 256 becomes 0 after casting
        b = (byte) a;
        System.out.println(b); // Output: 0


        // Example 2: Value within byte range (no overflow)
        int x = 10;

        // 10 is within byte range (-128 to 127)
        // So the value remains unchanged after casting
        b = (byte) x;
        System.out.println(b); // Output: 10

        // float is converted to int therefore no point value output will be 5
        float f = 5.6f;
        int num = (int)f; 
        System.out.println(num);

        // Type Promotion
        byte x1 = 10;
        byte x2 = 20;
        int result = x1+x2;

        System.out.println(result);

    }
}