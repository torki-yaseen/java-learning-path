public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    /*
    constructor = a special method to initialize objects you can pass arguments to contactor and set up initial value
     */
    Student(String name,int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    void study(){
        System.out.println(this.name + " is studding!");
    }
}
