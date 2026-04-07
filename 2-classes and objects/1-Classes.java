// creating a class, a class will have method, can also have variables

// Function  →  stands alone, not inside any class
// Method    →  lives inside a class
// Java has NO standalone functions
// EVERYTHING in Java lives inside a class
// So in Java → all functions are methods
    
class Calculator{
    public int add(int n1,int n2){
        int sum = n1 + n2;
        return sum;
    }
}

class Store{
    public String getPen(int cost){
        if(cost >= 10){
            return "pen";
        }else{
            return "minimum cost of pen is 10, please give me 10rs";
        }
    }
}

class ClassesAndObjects{

    public static void main(String args[]){

        // primitive data types
        int num1 = 7;
        int num2 = 8;
        // int result = num1+num2;
        // System.out.println(result);

        // reference variable
        Calculator calc = new Calculator();
        int finalResult = calc.add(num1, num2);
        System.out.println(finalResult);

        // store example
        Store obj = new Store();
        String pen = obj.getPen(5);
        System.out.println(pen);

    }

}
