class Variables {
    public static void main(String[] args) {
        /*
        In memory, 1 bit is sacrificed to store the SIGN of the number
        This is called the "Sign Bit"
        31 bits →  actual number (for int)
        [ 0 | 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ]
          ↑                         ↑
        sign bit                 31 bits for the value
        So usable bits = 32 - 1 = 31
        Hence → 2^(bits-1)
        */

        /*
        The positive side must share its slots with 0
        0 is neither positive nor negative, but it lives on the positive side
        Total slots on positive side = 2^31
        But 0 takes one slot, so positives only get = 2^31 - 1
        Negative side: -1, -2, -3 ... -2^31  → no zero, gets full 2^31 slots
        Positive side:  0, +1, +2 ... +2^31-1 → zero steals 1 slot
        That stolen slot is the -1 in:  Max = 2^(bits-1) - 1
        */

        // ===== Primitive types =====
        
        // Integer types: byte, short, int, long
        int n = 9;             // 4 bytes      // 32 bits        min = -2^(32-1)        max = 2^(32-1)-1
        byte b = 127;          // 1 byte     // 8 bits         min = -2^(8-1)         max = 2^(8-1)-1          
        short s = 400;         // 2 bytes     // 16 bits        min = -2^(16-1)        max = 2^(16-1)-1 
        long l = 7898L;        // 8 bytes     // 64 bits        min = -2^(64-1)        max = 2^(64-1)-1
        // Floating-point types: float, double
        double d = 20.10;      // 8 bytes     // 64 bits        min = -1.7×10^308      max = 1.7×10^308
        float f = 5.6F;        // 4 bytes     // 32 bits        min = -3.4×10^38       max = 3.4×10^38
        // Character type: char
        char c = 'j';          // 2 bytes     // 16 bits        min = 0                max = 65,535  
        // Boolean type: boolean
        boolean bl = true;     // 1 byte      // 8 bits         only → true or false            

        // we can use capital l or f for long and float both will work same
        
        // ===== Non-primitive types ===== size depends on how many characters

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
