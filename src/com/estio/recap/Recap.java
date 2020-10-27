package com.estio.recap;

public class Recap
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Josh", 5);
        student1.describeStudent();

        Student student2 = new Student("Tyler", 7);
        student2.describeStudent();

        Student student3 = new Student("Adam", 6);
        student3.describeStudent();

        // print off Head Teachers Name
        System.out.println("Headteachers name is:" + student1.getHeadTeacher());
        System.out.println("Headteachers name is:" + student3.getHeadTeacher());

        // The head teacher now leaves and Mr Walker joins
        student2.setHeadTeachersName("Mr Walker");

        System.out.println("Headteachers name is:" + student1.getHeadTeacher());
        System.out.println("Headteachers name is:" + student3.getHeadTeacher());
    }
}
