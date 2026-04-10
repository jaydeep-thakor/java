class Human{

    int age;
    private String name; // when we write private it can be accessible only within the class

}

class Encapsulation{
    public static void main(String a[]){

        Human obj = new Human();

        obj.age = 27;
        obj.name = "hailee";

        System.out.println(obj.name);


    }
}
