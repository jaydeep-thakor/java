// In stack, data is stored in a sequence and follows Last in first out order.
// In heap, memory is open and flexible, and data can be stored anywhere.

// every method will have its own stack

class Car{

    // this is a instance variable
    int carNumber = 7; // carNumber is not part of any method here, but can access it but it is not a part of it

    public int drive(int speed){
        // int speed is local variable of drive method
        System.out.println("car speed is "+speed);          
        return speed;
    } 
}

class Memory{
    public static void main(String args[]){

        Car c = new Car();
        c.drive(60);

    }
}
