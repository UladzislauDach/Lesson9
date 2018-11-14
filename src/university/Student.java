package university;

import student.school.School;

public class Student {
    private int age; // инициализируются значением по умолчанию: примитивы = 0, boolean= false, char='0', а если объект то null
    private String name;
private School school;
    public static void main(String[] args) {
        Student st1 = new Student(15);
        Student st2 = new Student();
        Student st3 = new Student(18, "ivan");
    }


    //    static int counter;

    public Student(int age, String name){
        this.age=age;
        this.name=name;
    }
    public Student(int age) {
        this(age, "constructor 1");
    }

    public Student() {
        this(20, "constructor 2");
        System.out.println("constructor 2 call");
        int a = 10;

    }
    public Student(String name){
        this(20);
        this.name=name;
    }

    ////    {
////        age = 12;
////        name = "name";
////    }//вызываетсся каждый раз при создании объекта
//
//    //    static {
////        counter++;
////    }//блоки инициализации. Вызывается 1 раз при запуске программы
//    {
//        counter++;
//    }
//
//    public student() {
//    }
//
//    public student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//
//
////    public student(int age, String name) {
////        this.age = age;
////        this.name = name;
// //   }
//
//    public student(int ageOfStudent) {
//
//        age = ageOfStudent;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public static void printClassName() {
//        System.out.println("student");
//    }
//
//    public static void main(String[] args) {
//        student st = new student();
//        student st1 = new student();
//        System.out.println(st.getName());
//        System.out.println(st1.getAge());
//        System.out.println(counter);
//    }

}