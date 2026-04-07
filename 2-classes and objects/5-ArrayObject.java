class Student{
    int rollNo;
    String name;
    int marks;
}

class ArrayObject{
    public static void main(String args[]){

        Student s1 = new Student();
        s1.rollNo = 7;
        s1.name = "Jaydeep";
        s1.marks = 98;

        Student s2 = new Student();
        s2.rollNo = 11;
        s2.name = "Hailee";
        s2.marks = 96;

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;

        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].rollNo + " " + students[i].name + " " + students[i].marks);
        }

    }
}