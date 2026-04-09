class AboutString{

    public static void main(String args[]){

        // string name = "jaydeep"; this will also work it creates an object behind the scene new String();

        // we create string uisng object of string
        String fullName = new String("Jaydeep Thakor"); // once I decalre string with value it can never be changed, strings are immutable 
        fullName = fullName + " frontend developer"; // creates a new object, original string keep the same it won't change
        System.out.println(fullName);
        System.out.println("hello" + fullName); // concatenating string only + can be used in strings, other operators will not work in string
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.concat(" Software developer "));
        // System.out.println(fullName.length());
        System.out.println(fullName);

        // if both have same data, java do not create object two times in heap memoery, it will create only one and give the address to both
        // String s1 = "Hailee";
        // String s2 = "Hailee";

        // String buffer - in this one array are mutable
        StringBuffer sb = new StringBuffer("Jaydeep");
        sb.append(" Thakor");
        sb.deleteCharAt(3);
        sb.insert(7, " J. ");
        sb.setLength(47);
        sb.ensureCapacity(100);
        System.out.print("sb "+ sb);


    }

}