class Calculations{
    // Method Overloading is a feature in Java where multiple methods have the same name but different parameters (different number, type, or order of parameters) within the same class.
    
    // this is a instance variable
    int num = 0; // num is not part of any method here, but can access it but it is not a part of it
    
    public int sum(int n1, int n2, int n3){
        // n1,n2,n3 are local variables
        return n1+n2+n3;
    }
    public int sum(int n1, int n2){
        return n1+n2;
    }
    public double sum(double n1,double n2){
        return n1+n2;
    }
}

class MethodOverloading{
    public static void main(String args[]){
        Calculations obj = new Calculations();
        int result1 = obj.sum(3,5,7);
        double result2 = obj.sum(3,5);
        System.out.println(result1);
        System.out.println(result2);
    }
}   



