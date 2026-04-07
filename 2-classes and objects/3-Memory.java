// STACK vs HEAP (JVM Memory Overview)
//
// STACK:
// - Stores method calls (stack frames)
// - Stores local variables and references
// - Follows Last In First Out (LIFO)
//
// HEAP:
// - Stores actual objects and their instance variables
// - Shared across methods
//
// NOTE:
// Reference variables store memory addresses pointing to objects in the heap.

class Car {

    // Instance variable → stored inside the object in HEAP
    int carNumber = 7;

    public int drive(int speed) {

        // 'speed' is a local variable → stored in STACK (drive method frame)

        System.out.println("Car speed is " + speed);
        return speed;
    }
}

class Memory {
    public static void main(String args[]) {

        // STACK FRAME: main()

        // 'c' is a reference variable → stored in STACK
        // It holds the address of the Car object in HEAP

        Car c = new Car();

        /*
         MEMORY REPRESENTATION

         STACK (main frame)
         -------------------
         c  →  101   (reference to object in heap)

         HEAP
         -------------------
         Address 101:
             carNumber = 7
             methods (behavior of Car class)

         */

        c.drive(60);

        /*
         When drive(60) is invoked:

         STACK (drive frame)
         -------------------
         speed = 60

         STACK (main frame)
         -------------------
         c  →  101

         HEAP (unchanged)
         -------------------
         Address 101:
             carNumber = 7

         */

        Car c1 = new Car();
        System.out.println(c1.carNumber);
        Car c2 = new Car();
        c2.carNumber = 78;
        System.out.println(c2.carNumber);

    }
}
