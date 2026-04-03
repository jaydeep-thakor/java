class Operators {

    public static void main(String args[]) {

        int num1 = 10;
        int num2 = 20;

        // 🔹 1. Arithmetic Operators
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Arithmetic:");
        System.out.println(addition + " " + subtraction + " " + multiplication + " " + division + " " + remainder);

        // 🔹 2. Unary Operators
        int x = 10;
        System.out.println("\nUnary:");
        System.out.println("Original: " + x);
        System.out.println("Post-increment: " + (x++));
        System.out.println("After increment: " + x);
        System.out.println("Pre-decrement: " + (--x));

        // 🔹 3. Relational Operators
        System.out.println("\nRelational:");
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        // 🔹 4. Logical Operators
        System.out.println("\nLogical:");
        System.out.println((num1 > 5) && (num2 > 15));
        System.out.println((num1 > 5) || (num2 < 15));
        System.out.println(!(num1 > 5));

        // 🔹 5. Assignment Operators
        int a = 5;
        System.out.println("\nAssignment:");
        a += 3; // 8
        System.out.println("a += 3: " + a);
        a -= 2; // 6
        System.out.println("a -= 2: " + a);
        a *= 2; // 12
        System.out.println("a *= 2: " + a);
        a /= 3; // 4
        System.out.println("a /= 3: " + a);
        a %= 3; // 1
        System.out.println("a %= 3: " + a);

        // 🔹 6. Bitwise Operators
        // &: gives 1 only if both are 1, otherwise gives 0
        // |: gives 1 if any one is 1, otherwise gives 0
        // ^: gives 1 if both are different, 0 if same
        // ~: changes 1 to 0 and 0 to 1
        // <<: move left → number becomes double
        // >>: move right → number becomes half

        int b1 = 5; // 0101
        int b2 = 3; // 0011
        System.out.println("\nBitwise:");
        System.out.println("b1 & b2: " + (b1 & b2));
        System.out.println("b1 | b2: " + (b1 | b2));
        System.out.println("b1 ^ b2: " + (b1 ^ b2));
        System.out.println("~b1: " + (~b1));
        System.out.println("b1 << 1: " + (b1 << 1));
        System.out.println("b1 >> 1: " + (b1 >> 1));

        // 🔹 7. Ternary Operator
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("\nTernary:");
        System.out.println("Max: " + max);

        // 🔹 8. instanceof Operator
        // Is str created from String type?
        String str = "Hello";
        System.out.println("\ninstanceof:");
        System.out.println(str instanceof String);
    }
}