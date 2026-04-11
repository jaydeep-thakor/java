class Human{

    // "private" are accessible only within the same class (including all its methods).
    private String name;

    // setter
    // public void setName(String name, Human obj){
        // name = name; // this is wrong because name is assign name to it self which which is null(instance variable) at the top
        // 1st way
        // Human obj1 = obj;
        // obj1.name = name;
    // }

    // setter
    // best way using this
    public void setName(String name){
        this.name = name;
    }

    // getter
    public String getName(){
        return name;
    }

}

class Encapsulation{  
    public static void main(String a[]){

        Human obj = new Human();
        // 1st way
        // obj.setName("Jaydeep", obj);
        
        // best way
        obj.setName("Jaydeep");
        System.out.println(obj.getName());


    }
}
